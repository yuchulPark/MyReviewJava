package com.example.exam1;

import java.util.Scanner;

/*
다음과 같이 동작하는 프로그램 작성
줄수를 입력하세요 => 3
칸수를 입력하세요 => 4
****
****
****
 */
public class RowCol {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, col; // 줄, 칸
		System.out.println("줄수를 입력하세요.");
		row = scan.nextInt();
		System.out.println("칸수를 입력하세요.");
		col = scan.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				System.out.print("*"); // 한줄에 col의 개수만큼 *이 입력되고, 
			}
			System.out.println();
		}
	}
}
