package com.example.exam1;

import java.util.Scanner;

// ������ ���
public class Gugudan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan; // �Է��� ����
		System.out.println("����� ���?");
		dan = scan.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
	}
}
