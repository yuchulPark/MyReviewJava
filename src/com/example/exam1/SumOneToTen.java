package com.example.exam1;

import java.util.Scanner;

// 사용자에게 임의의 수 n을 입력받아 1에서 n까지의 합을 누적하여 출력하는 프로그램
// ex) n을 입력하세요 ==> 10		1에서 10까지의 합은 __
public class SumOneToTen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n; // 내가 입력하는 수
		int sum = 0; // 합계
		System.out.println("n을 입력하세요.");
		n = scan.nextInt();
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
