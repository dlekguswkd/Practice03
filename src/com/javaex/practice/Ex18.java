package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// 숫자 하나를 입력받아 아래와 같이 * 가 출력되도록 프로그램을 작성하세요.
		//모르겠음(참조해서 적어둠) 
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		for (int i=num; i>0; i--) {
			
			for (int j=1; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int k=2; k<=num; k++) {
			
			for (int m=1 ; m<=k; m++) {
			System.out.print("*");
			}
			System.out.println("");
		}
		
		/*
		 for(int y=1; y<=inputNum; y++) {

			for(int x=1; x<=inputNum+1-y; x++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		for(int y=1; y<=inputNum-1; y++) {

			for(int x=1; x<=y+1; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		 */
		
		sc.close();
	}

}
