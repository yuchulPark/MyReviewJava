package com.example.exam1;

import java.util.Scanner;

// ������� ���Ǹ� ���ϴ� ���α׷��� �ۼ� (����� �ظ��� �������� ���̸� �Է¹޾Ƽ� ���� ���)
public class CircleVolume {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int radius, height; // ������, ����
		double volume; // ����
		
		System.out.println("����� �ظ��� �������� �Է��ϼ���.");
		radius = scan.nextInt();
		System.out.println("����� ���̸� �Է��ϼ���.");
		height = scan.nextInt();
		volume = 3.14 * radius * radius * height;
		System.out.println("������� ���� : " + volume);
	}
}
