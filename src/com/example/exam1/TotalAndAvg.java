package com.example.exam1;

import java.util.Scanner;

// 10���� �л� ������ �Է��ϰ� �հ�� ��� ���ϱ�
public class TotalAndAvg {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score[] = new int[10]; // score �迭 ����
		int total = 0;
		int avg;
		
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1) + "��° �л��� ������ �Է����ּ���.");
			score[i] = scan.nextInt();
			total = total + score[i];
		}
		avg = total / score.length;
		System.out.println("�հ� : " + total);
		System.out.println("��� : " + avg);
	}
}
