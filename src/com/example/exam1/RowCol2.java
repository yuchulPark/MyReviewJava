package com.example.exam1;

import java.util.Scanner;

/*
다음과 같이 동작하는 프로그램을 while문을 사용하여 작성
줄 수를 입력하세요 => 3
칸 수를 입력하세요 => 4
****
****
****
 */
public class RowCol2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, col;
		System.out.println("줄 수를 입력하세요.");
		row = scan.nextInt();
		System.out.println("칸 수를 입력하세요.");
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
