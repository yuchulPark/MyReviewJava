package com.example.exam1;


import java.util.Date;
import java.util.Scanner;

// ����⵵�� �Է¹޾� �� ����� ���� �ϰ��� ������� �Ǻ��ϴ� ���α׷� 
// (���̰� 40�� �̻��̰�, ����⵵�� Ȧ���� ���� �ϰ��� �������)
public class CancerTest2 {
	public static void main(String[] args) {
		int age; // ����
		int birthday; // ����⵵
		String result; // ���� �ϰ��� ��������� �ƴ���
		Scanner scan = new Scanner(System.in);
		System.out.println("����⵵ : ");
		birthday = scan.nextInt(); // ����⵵ �Է�
		Date date = new Date();
		int thisYear = date.getYear()+1900; // ���� �⵵�� ����
		age = thisYear - birthday; // ���� = ���� �⵵ - ��� �⵵
		// if(age >= 40 && birthday % 2 == 1) { // ���̰� 40�� �̻��̰�, ����⵵�� Ȧ���̸�
		// ������ ���� �ڵ�� ���ظ� ����� �����ϴ�. ������ �ڵ�� ������ ����.
		if(age >= 40 && birthday % 2 == thisYear % 2) {
			result = "���� �ϰ��� �����";
		}else {
			result = "���� �ϰ��� ����ڰ� �ƴ�";
		}
		System.out.println(result);
	}
}
