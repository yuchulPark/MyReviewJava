package com.example.exam1;

import java.util.Scanner;

// �ְ� ������ �ְ� ������ ���� �л��� �̸� ���
public class MaxScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name[] = new String[5];
		int score[] = new int[5];
		int total = 0;
		int avg = 0;
		
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1) + "��° �л��� �̸�");
			name[i] = scan.next();
			System.out.println((i+1) + "��° �л��� ����");
			score[i] = scan.nextInt();
			total = total + score[i];
		}
		avg = total / score.length;
		
		for(int i=0; i<score.length; i++) {
			System.out.println(name[i] + "\t" + score[i]);
		}
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
	
		int max = score[0];
		int idx = 0;
		
		for(int i=0; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
				idx = i;
			} // ���࿡ ���� int�� for���� ���� ��ģ�ٰ� �ؼ� �����ٰ� ���ٰ� �������� ��, ������ ������ �����ȴٸ� ���� ū���� ������ ����
		}
		System.out.println("�ְ� ���� : " + max);
		System.out.println("�ְ������ : " + name[idx]);
	}
}
