package com.example.exam1;

import java.util.Date;
import java.util.Scanner;

//���� �ϰ��� ��������� �Ǻ��ϴ� ���α׷�
public class CancerTest {
	public static void main(String[] args) {
		int age; // ����
		int year; // ����⵵
		Scanner scan = new Scanner(System.in);
		System.out.println("����⵵�� �Է��ϼ���.");
		year = scan.nextInt(); // ����⵵�� �Է�
		Date date = new Date();
		int thisyear = date.getYear()+1900; // ���� �⵵�� ����
		age = (thisyear - year); // ���� �⵵���� �Է��� ����⵵�� ���� ���̰� ����
		if(age >= 40) {
			System.out.println("���� �ϰ��� ������Դϴ�.");
		}else {
			System.out.println("���� �ϰ��� ����ڰ� �ƴմϴ�.");
		}
	}
}
