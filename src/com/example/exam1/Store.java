package com.example.exam1;

import java.util.Scanner;

// �������� �ϳ��� 100���� ������ �Ǹ��ϰ� �ִٰ� ����. ������ 10�� �̻� �����ϴ� ������ 10%�� �������شٰ� ����.
// ����ڰ� ������ ������ ������ �Է��ϸ� ��ü ������ ������ ������ִ� ���α׷��� �ۼ�
public class Store {
	public static void main(String[] args) {
		int item; // �� ���� �����Ұ���
		int price = 100; // ��ǰ ������ 100��
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ������ �Է��ϼ���.");
		item = scan.nextInt();
		if(item >= 10) { // ������ 10�� �̻� �����ϸ�
			System.out.println("��ü ������ " + price * item * 0.9 + "�� �Դϴ�.");
		}else {
			System.out.println("��ü ������ " + price * item + "�� �Դϴ�.");
		}
	}
}
