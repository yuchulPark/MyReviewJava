package com.example.exam1;

import java.util.Scanner;

// ����ڷκ��� �ϳ��� ���ڸ� �Է¹޾Ƽ� ���ڰ� R�̸� �簢���� ������ ���, T�̸� �ﰢ���� ������, C�̸� ���� ������ ���
// ������ ����ϴµ� �ʿ��� ���ڵ��� ����ڷκ��� �Է¹���
public class ShapeArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String type; // ���ڰ� R���� T���� C���� �Ǻ�
		int row, col, radius; // ����, ����, ������ ����
		int area = 0; // ����
		System.out.println("���ڸ� �Է����ּ���.");
		type = scan.nextLine();
		// ���� �Է°��� R, r, T, t, C, c�� �ƴ϶��
		if(!type.equals("R") && !type.equals("r") && !type.equals("T") && 
		   !type.equals("t") && !type.equals("C") && !type.equals("c")) {
			System.out.println("�ٽ� �Է����ּ���.");
			return;
		}
		// if�� �̿�
//		if(type.equals("R") || type.equals("r")) {
//			System.out.println("���� ���� : ");
//			row = scan.nextInt();
//			System.out.println("���� ���� : ");
//			col = scan.nextInt();
//			area = row * col;
//		}else if(type.equals("T") || type.equals("t")) {
//			System.out.println("���� ���� : ");
//			row = scan.nextInt();
//			System.out.println("���� ���� : ");
//			col = scan.nextInt();
//			area = row * col * 1/2;
//		}else if(type.equals("C") || type.equals("c")) {
//			System.out.println("������ ���� : ");
//			radius = scan.nextInt();
//			area = (int)(radius * radius * 3.14);
//		}
		
		// switch�� �̿�
		switch(type) {
		case "R" :
		case "r" :
			System.out.println("���� ���� : ");
			row = scan.nextInt();
			System.out.println("���� ���� : ");
			col = scan.nextInt();
			area = row * col;
			break;
		case "T" :
		case "t" :
			System.out.println("���� ���� : ");
			row = scan.nextInt();
			System.out.println("���� ���� : ");
			col = scan.nextInt();
			area = row * col * 1/2;
			break;
		case "C" :
		case "c" :
			System.out.println("������ ����");
			radius = scan.nextInt();
			area = (int)(radius * radius * 3.14);
			break;
		}
		System.out.println(area);
	}
}
