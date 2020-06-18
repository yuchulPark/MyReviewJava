package com.example.exam1;

import java.util.Scanner;

// 어떤 학생이 이번 학기에 컴퓨터 개론, c언어 프로그래밍, 영어, 일반 수학을 수강신청 했다고 할 때 
// 각 과목의 점수를 입력하면 그 학생의 이번 학기 평균 점수를 계산하는 프로그램
public class AvgScoreTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,d; // 각각 컴퓨터 개론, c언어 프로그래밍, 영어, 수학
		System.out.println("컴퓨터 개론 점수 입력");
		a = scan.nextInt();
		System.out.println("c언어 프로그래밍 점수 입력");
		b = scan.nextInt();
		System.out.println("영어 점수 입력");
		c = scan.nextInt();
		System.out.println("수학 점수 입력");
		d = scan.nextInt();
		int avg = (a+b+c+d)/4;
		System.out.println("평균 : " + avg);
	}
}
