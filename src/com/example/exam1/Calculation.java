package com.example.exam1;

import java.util.Scanner;

//두 개의 정수를 입력받아 사칙연산을 수행한 결과를 출력하는 프로그램
public class Calculation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		int add, sub, mul, div;
		System.out.println("첫번째 수 : ");
		a = scan.nextInt();
		System.out.println("두번째 수 : ");
		b = scan.nextInt();
		add = a + b; 
		sub = a - b;
		mul = a * b;
		div = a / b;
		System.out.printf("%d + %d = %d\n", a,b,add);
		System.out.printf("%d + %d = %d\n", a,b,sub);
		System.out.printf("%d + %d = %d\n", a,b,mul);
		System.out.printf("%d + %d = %d\n", a,b,div);
	}
}
