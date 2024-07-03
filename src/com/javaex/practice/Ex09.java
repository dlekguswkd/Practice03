package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
			// 다음과 같이 출력하세요
			//물어봤음(참조함)
		for(int i=1; i<=10; i++) {
			
			for (int j = 0 ; j < 10 ; j++) {
				System.out.print(i+j);
				System.out.print("\t");
			}
			/*
			 for(int j=i; j<i+10 ; j++){
				System.out.print(j + "\t");
			}	
			 */
			System.out.println("");
		}

	}

}
