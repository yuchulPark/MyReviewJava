package com.example.exam1;

import java.util.Scanner;

// 사용자로부터 n을 입력받아 1부터 n까지의 짝수의 합, 홀수의 합, 짝수의 개수, 홀수의 개수를 각각 구하여 출력
public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n; // 입력받는 값
		int even = 0, odd = 0; // 짝수, 홀수
		int sumEven = 0, sumOdd = 0; // 짝수의 합, 홀수의 합
		System.out.println("n을 입력하세요.");
		n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i % 2 == 0) { // 짝수면
				sumEven = sumEven + i; // 짝수의 합에 더함
				even = even + 1; // 짝수의 개수를 1 증가시킴 
			}else {
				sumOdd = sumOdd + i; // 홀수의 합에 더함
				odd = odd + 1; // 홀수의 개수를 1 증가시킴
			}
		}
		System.out.println("짝수의 합 : " + sumEven);
		System.out.println("홀수의 합 : " + sumOdd);
		System.out.println("짝수의 개수 : " + even);
		System.out.println("홀수의 개수 : " + odd);
	}
}
