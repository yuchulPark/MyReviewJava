package com.example.exam1;

import java.util.Scanner;

/*
������ ���� �����ϴ� ���α׷��� while���� ����Ͽ� �ۼ�
�� ���� �Է��ϼ��� => 3
ĭ ���� �Է��ϼ��� => 4
****
****
****
 */
public class RowCol2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, col;
		System.out.println("�� ���� �Է��ϼ���.");
		row = scan.nextInt();
		System.out.println("ĭ ���� �Է��ϼ���.");
		col = scan.nextInt();
		
		int i = 1;
		while(i<=row) {
			int j = 1;
			while(j<=col) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
