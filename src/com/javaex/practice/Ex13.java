package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/* 
		 아래와 설명에 맞는 프로그램을 작성하세요
		 숫자를 1개 입력 받아 입력한 숫자까지 누적합계를 구하는 프로그램을 작성하세요.
		예를들어 100을 입력받는다면 아래와 같이 계산됩니다.
		*/
		//11번참고
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int r = 0;
		
		for (int i=1; i<=num; i++) {
			r=r+i;
			
		}System.out.println("합계: " + r);
		
		
		sc.close();
	}

}
