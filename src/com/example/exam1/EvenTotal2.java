package com.example.exam1;

import java.util.Scanner;

// ����ڿ��� n�� �Է¹޾� 1~n������ ¦���� ���� �����Ͽ� ����ϴ� ���α׷� (do-while�� �̿�)
public class EvenTotal2 {
	public static void main(String[] args) {
		int n; // �Է°�
		int sum = 0; // ¦���� ���� ���� ����
		Scanner scan = new Scanner(System.in);
		System.out.println("n�� �Է��ϼ���.");
		n = scan.nextInt();
		int i = 1;
		
		do {
			if(i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}while(i<=n);
		System.out.println(sum);
	}
}
