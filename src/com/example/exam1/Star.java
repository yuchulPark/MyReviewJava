package com.example.exam1;

import java.util.Scanner;

// 생월, 생일을 입력받아 별자리를 구하는 프로그램
// ex) 이름은 무엇인가요? 홍길동, 몇월에 태어났나요? 12, 몇일에 태어났나요? 17, 홍길동님의 별자리는 __자리입니다.
public class Star {
	public static void main(String[] args) {
		int month, day; // 생월, 생일
		String name; // 이름
		String star = ""; // 별자리
		Scanner scan = new Scanner(System.in);
		System.out.println("이름은 무엇인가요?");
		name = scan.next(); // 이름 입력
		System.out.println("몇월에 태어났나요?");
		month = scan.nextInt();

		// 1~12 외의 숫자를 입력하면
		if (month > 12 || month < 1) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		int lastDay = 31; // default값으로 마지막날을 31로 설정
		switch (month) {
		case 2:
			lastDay = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay = 30;
			break;
		}
		System.out.println("몇일에 태어났나요?");
		day = scan.nextInt();

		// 1~lastDay 외의 숫자를 입력하면
		if (day < 1 || day > lastDay) {
			System.out.println(month + "월은 " + lastDay + "일까지 있어요.");
			return;
		}
		switch (month) {
		case 1:
			if (day <= 19) {
				star = "염소";
			} else {
				star = "물병";
				break;
			}
		case 2:
			if (day <= 18) {
				star = "물병";
			} else {
				star = "물고기";
				break;
			}
		case 3:
			if (day <= 20) {
				star = "물고기";
			} else {
				star = "양";
				break;
			}
		case 4:
			if (day <= 19) {
				star = "양";
			} else {
				star = "황소";
				break;
			}
		case 5:
			if (day <= 20) {
				star = "황소";
			} else {
				star = "쌍둥이";
				break;
			}
		case 6:
			if (day <= 21) {
				star = "쌍둥이";
			} else {
				star = "게";
				break;
			}
		case 7:
			if (day <= 22) {
				star = "게";
			} else {
				star = "사자";
				break;
			}
		case 8:
			if (day <= 22) {
				star = "사자";
			} else {
				star = "처녀";
				break;
			}
		case 9:
			if (day <= 23) {
				star = "처녀";
			} else {
				star = "천칭";
				break;
			}
		case 10:
			if (day <= 22) {
				star = "천칭";
			} else {
				star = "전갈";
				break;
			}
		case 11:
			if (day <= 22) {
				star = "전갈";
			} else {
				star = "사수";
				break;
			}
		case 12:
			if (day <= 24) {
				star = "사수";
			} else {
				star = "염소";
				break;
			}
		}
		System.out.println(name + "님의 별자리는 " + star + "자리 입니다.");
	}
}
