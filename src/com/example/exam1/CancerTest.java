package com.example.exam1;

import java.util.Date;
import java.util.Scanner;

//무료 암검진 대상자인지 판별하는 프로그램 (나이가 40살 이상이면 무료 암검진 대상자)
public class CancerTest {
	public static void main(String[] args) {
		int age; // 나이
		int year; // 출생년도
		String result; // 무료 암검진 대상인지 아닌지
		Scanner scan = new Scanner(System.in);
		System.out.println("출생년도를 입력하세요.");
		year = scan.nextInt(); // 출생년도를 입력
		Date date = new Date();
		int thisyear = date.getYear()+1900; // 현재 년도를 구함
		age = (thisyear - year); // 현재 년도에서 입력한 출생년도를 빼면 나이가 나옴
		if(age >= 40) {
			result = "무료 암검진 대상자";
		}else {
			result = "무료 암검진 대상자가 아님";
		}
		System.out.println(result);
	}
}
