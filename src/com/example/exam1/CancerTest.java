package com.example.exam1;

import java.util.Date;
import java.util.Scanner;

//���� �ϰ��� ��������� �Ǻ��ϴ� ���α׷� (���̰� 40�� �̻��̸� ���� �ϰ��� �����)
public class CancerTest {
	public static void main(String[] args) {
		int age; // ����
		int year; // ����⵵
		String result; // ���� �ϰ��� ������� �ƴ���
		Scanner scan = new Scanner(System.in);
		System.out.println("����⵵�� �Է��ϼ���.");
		year = scan.nextInt(); // ����⵵�� �Է�
		Date date = new Date();
		int thisyear = date.getYear()+1900; // ���� �⵵�� ����
		age = (thisyear - year); // ���� �⵵���� �Է��� ����⵵�� ���� ���̰� ����
		if(age >= 40) {
			result = "���� �ϰ��� �����";
		}else {
			result = "���� �ϰ��� ����ڰ� �ƴ�";
		}
		System.out.println(result);
	}
}
