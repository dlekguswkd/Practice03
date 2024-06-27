package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// 아래와 같이 구구단을 출력하세요
		
		int x =2;
		int y = 1;
		
		for (y=1; y<=9; y++) {
			for (x=2; x<=9; x++) {
				System.out.print(x +"*" + y + "=" +x*y);
				System.out.print("\t");
			}System.out.println("");
		}
			

	}

}
