package com.example.exam2;

public class CallByValue {
	// 매개변수 n을 전달받아 n의 값을 1증가하여 출력하는 메소드
	public static void plus(int n) {
		n = n + 1;
		System.out.println(n);
	}
	// 복사해서 받은 n과 밑의 n은 별도의 공간이다.
	public static void main(String[] args) {
		int n = 31;
		plus(n);
		System.out.println(n);
	}
}
