package com.example.exam1;

import java.util.Scanner;

// 10명의 학생 점수를 입력하고 합계와 평균 구하기
public class TotalAndAvg {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score[] = new int[10]; // score 배열 생성
		int total = 0;
		int avg;
		
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1) + "번째 학생의 점수를 입력해주세요.");
			score[i] = scan.nextInt();
			total = total + score[i];
		}
		avg = total / score.length;
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
	}
}
