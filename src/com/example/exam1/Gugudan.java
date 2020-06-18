package com.example.exam1;

import java.util.Scanner;

// 구구단 출력
public class Gugudan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan; // 입력할 변수
		System.out.println("몇단을 출력?");
		dan = scan.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
	}
}
