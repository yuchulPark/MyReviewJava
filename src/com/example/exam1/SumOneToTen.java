package com.example.exam1;

import java.util.Scanner;

// ����ڿ��� ������ �� n�� �Է¹޾� 1���� n������ ���� �����Ͽ� ����ϴ� ���α׷�
// ex) n�� �Է��ϼ��� ==> 10		1���� 10������ ���� __
public class SumOneToTen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n; // ���� �Է��ϴ� ��
		int sum = 0; // �հ�
		System.out.println("n�� �Է��ϼ���.");
		n = scan.nextInt();
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
