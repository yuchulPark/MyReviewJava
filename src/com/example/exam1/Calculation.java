package com.example.exam1;

import java.util.Scanner;

//�� ���� ������ �Է¹޾� ��Ģ������ ������ ����� ����ϴ� ���α׷�
public class Calculation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		int add, sub, mul, div;
		System.out.println("ù��° �� : ");
		a = scan.nextInt();
		System.out.println("�ι�° �� : ");
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
