package com.example.exam1;

import java.util.Scanner;

// 사용자로부터 하나의 문자를 입력받아서 문자가 R이면 사각형의 면적을 계산, T이면 삼각형의 면적을, C이면 원의 면적을 계산
// 면적을 계산하는데 필요한 숫자들은 사용자로부터 입력받음
public class ShapeArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String type; // 문자가 R인지 T인지 C인지 판별
		int row, col, radius; // 가로, 세로, 반지름 길이
		int area = 0; // 면적
		System.out.println("문자를 입력해주세요.");
		type = scan.nextLine();
		// 만약 입력값이 R, r, T, t, C, c도 아니라면
		if(!type.equals("R") && !type.equals("r") && !type.equals("T") && 
		   !type.equals("t") && !type.equals("C") && !type.equals("c")) {
			System.out.println("다시 입력해주세요.");
			return;
		}
		// if문 이용
//		if(type.equals("R") || type.equals("r")) {
//			System.out.println("가로 길이 : ");
//			row = scan.nextInt();
//			System.out.println("세로 길이 : ");
//			col = scan.nextInt();
//			area = row * col;
//		}else if(type.equals("T") || type.equals("t")) {
//			System.out.println("가로 길이 : ");
//			row = scan.nextInt();
//			System.out.println("세로 길이 : ");
//			col = scan.nextInt();
//			area = row * col * 1/2;
//		}else if(type.equals("C") || type.equals("c")) {
//			System.out.println("반지름 길이 : ");
//			radius = scan.nextInt();
//			area = (int)(radius * radius * 3.14);
//		}
		
		// switch문 이용
		switch(type) {
		case "R" :
		case "r" :
			System.out.println("가로 길이 : ");
			row = scan.nextInt();
			System.out.println("세로 길이 : ");
			col = scan.nextInt();
			area = row * col;
			break;
		case "T" :
		case "t" :
			System.out.println("가로 길이 : ");
			row = scan.nextInt();
			System.out.println("세로 길이 : ");
			col = scan.nextInt();
			area = row * col * 1/2;
			break;
		case "C" :
		case "c" :
			System.out.println("반지름 길이");
			radius = scan.nextInt();
			area = (int)(radius * radius * 3.14);
			break;
		}
		System.out.println(area);
	}
}
