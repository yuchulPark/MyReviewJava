package com.example.exam1;

import java.util.Scanner;

// ��������� ������ �� n�� �Է¹޾� �� ���� �Ҽ����� �Ǻ��ϴ� ���α׷�
public class Sosu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n; // �Է¹޴� ��
		int cnt = 0; // ����� ������ ���ϴ� ����
		System.out.println("n�� �Է����ּ���.");
		n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) { // ������ �������� cnt�� 1 �߰�
				cnt = cnt + 1;
			}
		}
		// cnt�� �� �������� ���� if������ 2���� �´��� �ƴ��� �Ǻ�
		if(cnt == 2) {
			System.out.println(n + "�� �Ҽ��Դϴ�.");
		}else {
			System.out.println(n + "�� �Ҽ��� �ƴմϴ�.");
		}
	}
}
