package com.example.exam1;

import java.util.Scanner;

// 사용자에게 n을 입력받아 1~n의 짝수의 합을 누적하여 출력
public class EvenTotal {
	public static void main(String[] args) {
		int n; // 입력값
		int sum = 0; // 짝수의 합을 위한 변수
		Scanner scan = new Scanner(System.in);
		System.out.println("n을 입력하세요.");
		n = scan.nextInt();
		
		int i = 1;
		while(i<=n) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
