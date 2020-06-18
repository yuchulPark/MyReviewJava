package com.example.exam1;

import java.util.Scanner;

// 반복문을 이용하여 피보나치 수열을 구하는 프로그램. 피보나치 수열은 0 1 1 2 3 5 8 13 ... 과 같이 앞의 두 항을 더한 값이 다음 항이 되는 수열
public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 1, c;
		int n = 0; // 입력값
		System.out.println("몇 항까지 출력할까요?");
		n = scan.nextInt();
		if(n < 3) {
			System.out.println("적어도 3이상을 입력하세요.");
			return;
		}
		System.out.println(a + " " + b + " ");
		for(int i=2; i<n; i++) {
			c = a + b; // 변수 a와 b를 더하여 변수 c에 대입한다.
			System.out.println(c + " ");
			a = b; // 변수 b의 값을 변수 a로 옮긴다.
			b = c; // 변수 c의 값을 변수 b로 옮긴다. 
		}
	}
}
