package com.example.exam1;


import java.util.Date;
import java.util.Scanner;

// 출생년도를 입력받아 그 사람이 무료 암검진 대상인지 판별하는 프로그램 
// (나이가 40살 이상이고, 출생년도가 홀수면 무료 암검진 대상자임)
public class CancerTest2 {
	public static void main(String[] args) {
		int age; // 나이
		int birthday; // 출생년도
		String result; // 무료 암검진 대상자인지 아닌지
		Scanner scan = new Scanner(System.in);
		System.out.println("출생년도 : ");
		birthday = scan.nextInt(); // 출생년도 입력
		Date date = new Date();
		int thisYear = date.getYear()+1900; // 현재 년도를 구함
		age = thisYear - birthday; // 나이 = 현재 년도 - 출생 년도
		// if(age >= 40 && birthday % 2 == 1) { // 나이가 40살 이상이고, 출생년도가 홀수이면
		// 하지만 위의 코드는 올해만 사용이 가능하다. 보완한 코드는 다음과 같다.
		if(age >= 40 && birthday % 2 == thisYear % 2) {
			result = "무료 암검진 대상자";
		}else {
			result = "무료 암검진 대상자가 아님";
		}
		System.out.println(result);
	}
}
