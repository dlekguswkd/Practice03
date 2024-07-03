package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// 13번 문제에 아래와 같이 계산식이 표시되도록 프로그램을 작성하세요.
		// i인지 r인지 구별확인 필요
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int r = 0;
		
		for (int i=1; i<=num; i++) {
			r=r+i;
			System.out.print(i);
			if (i!=num) {
			System.out.print("+");
			}			
		} System.out.println("");
		System.out.println("합계: " + r);
		
		/*
		 for(int i=1; i<=num; i++) {
			r = r + i;
			if(i==num) {
				System.out.println(i);
			}else {
				System.out.print(i + "+");
			}
			
		}
		System.out.println("합계: " + r);
		 */
		
		
		sc.close();
	
	}

}
