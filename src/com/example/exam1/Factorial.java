package com.example.exam1;

import java.util.Scanner;

// 사용자한테 임의의 수 n을 입력받아 n!을 구하여 출력하는 프로그램을 작성
// ex) n을 입력하세요 => 5 	5*4*3*2*1=__
public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n; // 입력하는 수
		int p = 1; // 곱한 결과
		System.out.println("n을 입력하세요.");
		n = scan.nextInt();
		// 거꾸로 내려간다.
		for(int i=n; i>0; i--) {
			p = p * i;
			System.out.print(i);
			// i가 1이 오기 전까지만 *을 붙임
			if(i != 1) {
				System.out.print("*");
			}
		}
		System.out.println("=" + p);
	}
}
