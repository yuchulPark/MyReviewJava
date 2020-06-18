package com.example.exam1;

import java.util.Scanner;

// 사용자한테 월을 입력받아 마지막 날을 출력하는 프로그램
// 입력한 월이 1~12 사이의 값이 아니라면 제대로 된 값을 입력 받을때까지 반복 실행
public class LastDay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month; // 사용자가 입력할 월
		
		while(true) { // 무조건 참이므로 무한 반복문
			System.out.println("월을 입력하세요.");
			month = scan.nextInt();
			
			if(month >= 1 || month <= 12) { // 제대로 된 월을 입력하면 이 반복문에서 빠져나온다.
				break;
			}
		}
		int lastDay[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println(month + "월은 " + lastDay[month-1] + "일까지 있음");
	}
}
