package com.example.exam1;

import java.util.Scanner;

// 원기둥의 부피를 구하는 프로그램을 작성 (원기둥 밑면의 반지름과 높이를 입력받아서 부피 계산)
public class CircleVolume {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int radius, height; // 반지름, 높이
		double volume; // 넓이
		
		System.out.println("원기둥 밑면의 반지름을 입력하세요.");
		radius = scan.nextInt();
		System.out.println("원기둥 높이를 입력하세요.");
		height = scan.nextInt();
		volume = 3.14 * radius * radius * height;
		System.out.println("원기둥의 부피 : " + volume);
	}
}
