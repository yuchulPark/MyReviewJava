package com.example.exam1;

import java.util.Scanner;

// ��������� ���� �Է¹޾� ������ ���� ����ϴ� ���α׷�
// �Է��� ���� 1~12 ������ ���� �ƴ϶�� ����� �� ���� �Է� ���������� �ݺ� ����
public class LastDay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month; // ����ڰ� �Է��� ��
		
		while(true) { // ������ ���̹Ƿ� ���� �ݺ���
			System.out.println("���� �Է��ϼ���.");
			month = scan.nextInt();
			
			if(month >= 1 || month <= 12) { // ����� �� ���� �Է��ϸ� �� �ݺ������� �������´�.
				break;
			}
		}
		int lastDay[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println(month + "���� " + lastDay[month-1] + "�ϱ��� ����");
	}
}
