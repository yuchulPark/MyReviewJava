package com.example.exam1;

import java.util.Scanner;

// ��������� ������ �� n�� �Է¹޾� n!�� ���Ͽ� ����ϴ� ���α׷��� �ۼ�
// ex) n�� �Է��ϼ��� => 5 	5*4*3*2*1=__
public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n; // �Է��ϴ� ��
		int p = 1; // ���� ���
		System.out.println("n�� �Է��ϼ���.");
		n = scan.nextInt();
		// �Ųٷ� ��������.
		for(int i=n; i>0; i--) {
			p = p * i;
			System.out.print(i);
			// i�� 1�� ���� �������� *�� ����
			if(i != 1) {
				System.out.print("*");
			}
		}
		System.out.println("=" + p);
	}
}
