package com.example.exam1;

import java.util.Scanner;

// 사용자에게 n을 입력받아 1~n까지의 짝수의 합을 누적하여 출력하는 프로그램 (do-while문 이용)
public class EvenTotal2 {
	public static void main(String[] args) {
		int n; // 입력값
		int sum = 0; // 짝수의 합을 위한 변수
		Scanner scan = new Scanner(System.in);
		System.out.println("n을 입력하세요.");
		n = scan.nextInt();
		int i = 1;
		
		do {
			if(i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}while(i<=n);
		System.out.println(sum);
	}
}
