package com.example.exam1;

import java.util.Scanner;

// 12���� ������ ī�� ��� �ݾ��� double���� �迭�� �����ϴ� Ŭ���� Credit-Card�� �����϶�
// ���α׷��� ������ ���� ������ ��ȯ�ϴ� �޼ҵ带 ������ �Ѵ�.
// ����ڷκ��� ���� ��� �ݾ��� �Է¹��� ���� ������ üũ�ϵ��� �϶�.
// ex) 1�⵿���� ��ü ��� �ݾ�, ���� ��� ��� �ݾ�, ���� ������ ���Ҵ� ��, ���� ������ ������ ��
public class CardUse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double usePrice[] = new double[12]; // 12���� ���� ī�� ��� �ݾ��� ����
		double total = 0;
		double avg = 0;
		String name[] = new String[12];
		
		for(int i=0; i<usePrice.length; i++) {
			System.out.println("�̸��� �Է��ϼ���.");
			name[i] = scan.next();
			System.out.println((i+1) + "�� ��� �ݾ��� �Է��ϼ���.");
			usePrice[i] = scan.nextDouble();
			total = total + usePrice[i];
		}	
		avg = total / usePrice.length;
		for(int i=0; i<usePrice.length; i++) {
			System.out.println(name[i] + "\t" + usePrice[i]);
		}
		double max = usePrice[0]; // ���� ��� �ݾ��� �����ǰ� ���� max, min�� ��������� ��
		int index = 0;
		double min = usePrice[0];
		int index2 = 0;
		
		for(int i=0; i<usePrice.length; i++) {
			if(usePrice[i] > max) {
				max = usePrice[i];
				index = i;
			}
			if(usePrice[i] < min) {
				min = usePrice[i];
				index2 = i;
			}
		}
		System.out.println("1�� ������ ��ü ��� �ݾ� : " + total);
		System.out.println("���� ��� ��� �ݾ� : " + avg);
		System.out.println("���� ������ ���Ҵ� �� : " + (index+1));
		System.out.println("���� ������ ������ �� : " + (index2+1));
	}
}
