package com.example.exam1;

import java.util.Scanner;

// ����, ������ �Է¹޾� ���ڸ��� ���ϴ� ���α׷�
// ex) �̸��� �����ΰ���? ȫ�浿, ����� �¾����? 12, ���Ͽ� �¾����? 17, ȫ�浿���� ���ڸ��� __�ڸ��Դϴ�.
public class Star {
	public static void main(String[] args) {
		int month, day; // ����, ����
		String name; // �̸�
		String star = ""; // ���ڸ�
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��� �����ΰ���?");
		name = scan.next(); // �̸� �Է�
		System.out.println("����� �¾����?");
		month = scan.nextInt();

		// 1~12 ���� ���ڸ� �Է��ϸ�
		if (month > 12 || month < 1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		int lastDay = 31; // default������ ���������� 31�� ����
		switch (month) {
		case 2:
			lastDay = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay = 30;
			break;
		}
		System.out.println("���Ͽ� �¾����?");
		day = scan.nextInt();

		// 1~lastDay ���� ���ڸ� �Է��ϸ�
		if (day < 1 || day > lastDay) {
			System.out.println(month + "���� " + lastDay + "�ϱ��� �־��.");
			return;
		}
		switch (month) {
		case 1:
			if (day <= 19) {
				star = "����";
			} else {
				star = "����";
				break;
			}
		case 2:
			if (day <= 18) {
				star = "����";
			} else {
				star = "�����";
				break;
			}
		case 3:
			if (day <= 20) {
				star = "�����";
			} else {
				star = "��";
				break;
			}
		case 4:
			if (day <= 19) {
				star = "��";
			} else {
				star = "Ȳ��";
				break;
			}
		case 5:
			if (day <= 20) {
				star = "Ȳ��";
			} else {
				star = "�ֵ���";
				break;
			}
		case 6:
			if (day <= 21) {
				star = "�ֵ���";
			} else {
				star = "��";
				break;
			}
		case 7:
			if (day <= 22) {
				star = "��";
			} else {
				star = "����";
				break;
			}
		case 8:
			if (day <= 22) {
				star = "����";
			} else {
				star = "ó��";
				break;
			}
		case 9:
			if (day <= 23) {
				star = "ó��";
			} else {
				star = "õĪ";
				break;
			}
		case 10:
			if (day <= 22) {
				star = "õĪ";
			} else {
				star = "����";
				break;
			}
		case 11:
			if (day <= 22) {
				star = "����";
			} else {
				star = "���";
				break;
			}
		case 12:
			if (day <= 24) {
				star = "���";
			} else {
				star = "����";
				break;
			}
		}
		System.out.println(name + "���� ���ڸ��� " + star + "�ڸ� �Դϴ�.");
	}
}
