package com.example.exam1;

import java.util.Scanner;

/*
������ ���� �����ϴ� ���α׷� �ۼ�
�ټ��� �Է��ϼ��� => 3
ĭ���� �Է��ϼ��� => 4
****
****
****
 */
public class RowCol {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, col; // ��, ĭ
		System.out.println("�ټ��� �Է��ϼ���.");
		row = scan.nextInt();
		System.out.println("ĭ���� �Է��ϼ���.");
		col = scan.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				System.out.print("*"); // ���ٿ� col�� ������ŭ *�� �Էµǰ�, 
			}
			System.out.println();
		}
	}
}
