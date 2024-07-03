package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 다음과 같은 프로그램을 작성하세요
		a. 입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다.
		- 예) 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 )
		b. 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다.
		- 예) 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )
		 */
		//물어봤음
		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int r = 0;
		
		if (num%2 ==0) {		//짝수일때
			for (int i=2; i<=num; i++) {
				r=r+i;
				i++;
				}System.out.println("결과값: " + r);
		}else {
			for (int i=1; i<=num; i++) {
				r=r+i;
				i++;
			}System.out.println("결과값: " + r);
		}
		/*
		 int num = sc.nextInt();
		int startNum;
		int sum = 0;

		if (num % 2 == 1) {
			startNum = 1;
		} else {
			startNum = 2;
		}

		for (int i = startNum; i <= num; i = i + 2) {
			sum = sum + i;
		}

		System.out.println("결과값: " + sum);
		 */
		
		sc.close();
	}

}
