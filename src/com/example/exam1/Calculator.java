package com.example.exam1;

import java.util.Scanner;

// ���� ���α׷�
// ����ڷκ��� �ϳ��� ���ڸ� �Է¹޴´�.
// ����ڷκ��� ���� ���ڰ� +�� �� ���� ������, ���ڰ� -�� ������, ���ڰ� *�� ������, ���ڰ� /�� �������� �����ϵ��� �ۼ�
// if-else��, �������� ��� �и� 0�� �ƴ����� ���� �˻�
public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sign; // ������ �Է��� ���� ����
		int x, y;
		double z = 0; // x�� y�� �����ڸ� �̿��� ����� ����� ��
		System.out.println("�����ڸ�(+,-,*,/) �Է����ּ���.");
		sign = scan.next();
		
		// ���� �����ڰ� �ƴ� ���� �Էµ�����
		if(!sign.equals("+") && !sign.equals("-") && !sign.equals("*") && !sign.equals("/")) {
			System.out.println("�ٽ� �Է����ּ���.");
			return;
		}
		System.out.println("x�� �Է����ּ���.");
		x = scan.nextInt();
		System.out.println("y�� �Է����ּ���.");
		y = scan.nextInt();
		
		if(sign.equals("+")) {
			z = x + y;
		}else if(sign.equals("-")) {
			z = x - y;
		}else if(sign.equals("*")) {
			z = x * y;
		}else {
			if(x / y == 0) {
				System.out.println("�ٽ� �Է����ּ���.");
				return;
			}
			z = x / (double)y;
		}
		System.out.println(z);
	}
}
