package com.example.exam1;

import java.util.Scanner;

// 최고 점수와 최고 점수를 받은 학생의 이름 출력
public class MaxScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name[] = new String[5];
		int score[] = new int[5];
		int total = 0;
		int avg = 0;
		
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1) + "번째 학생의 이름");
			name[i] = scan.next();
			System.out.println((i+1) + "번째 학생의 점수");
			score[i] = scan.nextInt();
			total = total + score[i];
		}
		avg = total / score.length;
		
		for(int i=0; i<score.length; i++) {
			System.out.println(name[i] + "\t" + score[i]);
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	
		int max = score[0];
		int idx = 0;
		
		for(int i=0; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
				idx = i;
			} // 만약에 위의 int와 for문을 위랑 겹친다고 해서 위에다가 쓴다고 가정했을 때, 점수가 음수로 구성된다면 가장 큰값을 구하지 못함
		}
		System.out.println("최고 점수 : " + max);
		System.out.println("최고득점자 : " + name[idx]);
	}
}
