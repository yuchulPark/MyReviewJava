package com.example.exam1;

import java.util.Scanner;

// �ݺ����� �̿��Ͽ� �Ǻ���ġ ������ ���ϴ� ���α׷�. �Ǻ���ġ ������ 0 1 1 2 3 5 8 13 ... �� ���� ���� �� ���� ���� ���� ���� ���� �Ǵ� ����
public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 1, c;
		int n = 0; // �Է°�
		System.out.println("�� �ױ��� ����ұ��?");
		n = scan.nextInt();
		if(n < 3) {
			System.out.println("��� 3�̻��� �Է��ϼ���.");
			return;
		}
		System.out.println(a + " " + b + " ");
		for(int i=2; i<n; i++) {
			c = a + b; // ���� a�� b�� ���Ͽ� ���� c�� �����Ѵ�.
			System.out.println(c + " ");
			a = b; // ���� b�� ���� ���� a�� �ű��.
			b = c; // ���� c�� ���� ���� b�� �ű��. 
		}
	}
}
