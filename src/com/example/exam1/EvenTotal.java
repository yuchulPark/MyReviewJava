package com.example.exam1;

import java.util.Scanner;

// ����ڿ��� n�� �Է¹޾� 1~n�� ¦���� ���� �����Ͽ� ���
public class EvenTotal {
	public static void main(String[] args) {
		int n; // �Է°�
		int sum = 0; // ¦���� ���� ���� ����
		Scanner scan = new Scanner(System.in);
		System.out.println("n�� �Է��ϼ���.");
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
