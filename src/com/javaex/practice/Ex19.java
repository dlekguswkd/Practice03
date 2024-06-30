package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		/*
		 아래와 같이 은행 프로그램을 작성하세요
		“1.예금” 선택후 금액을 입력하면 예금액이 합산됩니다.
		“2.출급” 선택후 금액을 입력하면 예금액이 차감됩니다.
		“3.잔고” 선택시 현재 잔고가 출력됩니다.
		“4.종료” 선택시 종료됩니다.
		“1,2,3,4 이외의 숫자” 다시입력해주세요 메시지 출력됩니다.
		 */
		//참고했음

		Scanner sc = new Scanner(System.in);
		
		int deposit = 0;  //예금액
		int withdrawal=0; //출금액
		
		while(true) {
		
			System.out.println("-----------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------");
			System.out.print("선택>");
			int num =sc.nextInt();
		
				if (num==1) {
					System.out.println("예금액>");
					int amount =sc.nextInt();
					deposit = deposit + amount;
				}else if (num==2) {
					System.out.println("출금액>");
					int amount =sc.nextInt();
					withdrawal = withdrawal + amount;
				}else if (num==3) {
					int money = deposit - withdrawal;
					System.out.println("잔고액>"+ money);
					System.out.println("");
				}else if (num==4) {
					System.out.print("프로그램 종료");
					break;
				}else {
					System.out.println("다시 입력해주세요");
				}
			
		}
			sc.close();
		}
	}


