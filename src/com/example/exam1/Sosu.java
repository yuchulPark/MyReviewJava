package com.example.exam1;

import java.util.Scanner;

// 사용자한테 임의의 수 n을 입력받아 그 수가 소수인지 판별하는 프로그램
public class Sosu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n; // 입력받는 수
		int cnt = 0; // 약수의 개수를 구하는 변수
		System.out.println("n을 입력해주세요.");
		n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) { // 나누어 떨어지면 cnt에 1 추가
				cnt = cnt + 1;
			}
		}
		// cnt를 다 구했으면 이제 if문으로 2개가 맞는지 아닌지 판별
		if(cnt == 2) {
			System.out.println(n + "은 소수입니다.");
		}else {
			System.out.println(n + "은 소수가 아닙니다.");
		}
	}
}
