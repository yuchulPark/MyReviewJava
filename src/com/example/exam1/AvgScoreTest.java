package com.example.exam1;

import java.util.Scanner;

// � �л��� �̹� �б⿡ ��ǻ�� ����, c��� ���α׷���, ����, �Ϲ� ������ ������û �ߴٰ� �� �� 
// �� ������ ������ �Է��ϸ� �� �л��� �̹� �б� ��� ������ ����ϴ� ���α׷�
public class AvgScoreTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,d; // ���� ��ǻ�� ����, c��� ���α׷���, ����, ����
		System.out.println("��ǻ�� ���� ���� �Է�");
		a = scan.nextInt();
		System.out.println("c��� ���α׷��� ���� �Է�");
		b = scan.nextInt();
		System.out.println("���� ���� �Է�");
		c = scan.nextInt();
		System.out.println("���� ���� �Է�");
		d = scan.nextInt();
		int avg = (a+b+c+d)/4;
		System.out.println("��� : " + avg);
	}
}
