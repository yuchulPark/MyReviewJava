package com.example.exam1;

import java.util.Random;
import java.util.Scanner;

// ��ǻ�Ϳ� ����ڰ��� ���� ���� �� ������ ���� ���α׷��� ������� �Ѵ�. ����ڿ��� 0,1,2�� �޾� "����", "����", "��"�� ���
// ��ǻ�Ϳ� ����� �� ���� �̰���� ���
public class UserVsComputer {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int x; // �����
		int com; // ��ǻ��
		String y = ""; // ����� ���� ���� ��
		String comStr = ""; // ��ǻ�� ���� ���� ��
		
		com = rand.nextInt(3); // ��ǻ�ʹ� 0,1,2 �� �������� �ϳ� ��
		System.out.println("����-0, ����-1, ��-2 �߿� �����ϼ���.");
		x = scan.nextInt(); // ����ڰ� 0,1,2 �� �ϳ� �Է�
	
		if(x < 0 || x > 2) { // ���� 0~2�� ���� �Է����� �ʾ��� ��쿡��
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			return;
		}
		switch(x) {
		case 0 :
			y = "����";
			break;
		case 1 :
			y = "����";
			break;
		case 2 :
			y = "��";
			break;
		}
		System.out.println("����� " + y + "�� ���̽��ϴ�.");
		
		switch(com) {
		case 0 :
			comStr = "����";
			break;
		case 1 :
			comStr = "����";
			break;
		case 2 :
			comStr = "��";
			break;
		}
		System.out.println("��ǻ�ʹ� " + comStr + "�� ���̽��ϴ�.");
		
		if(x == com) {
			System.out.println("�����ϴ�.");
		}else if((x == 0 && com == 2) || (x == 1 && com == 0) || (x == 2 && com == 1)) {
			System.out.println("����� �̰���ϴ�.");
		}else {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
	}
}
