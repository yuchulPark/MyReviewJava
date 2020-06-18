package com.example.exam1;

import java.util.Random;
import java.util.Scanner;

// 컴퓨터와 사용자간에 가위 바위 보 게임을 위한 프로그램을 만들려고 한다. 사용자에게 0,1,2를 받아 "가위", "바위", "보"를 출력
// 컴퓨터와 사용자 중 누가 이겼는지 출력
public class UserVsComputer {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int x; // 사용자
		int com; // 컴퓨터
		String y = ""; // 사용자 가위 바위 보
		String comStr = ""; // 컴퓨터 가위 바위 보
		
		com = rand.nextInt(3); // 컴퓨터는 0,1,2 중 랜덤으로 하나 고름
		System.out.println("가위-0, 바위-1, 보-2 중에 선택하세요.");
		x = scan.nextInt(); // 사용자가 0,1,2 중 하나 입력
	
		if(x < 0 || x > 2) { // 만약 0~2의 값을 입력하지 않았을 경우에는
			System.out.println("잘못 입력하였습니다.");
			return;
		}
		switch(x) {
		case 0 :
			y = "가위";
			break;
		case 1 :
			y = "바위";
			break;
		case 2 :
			y = "보";
			break;
		}
		System.out.println("당신은 " + y + "를 내셨습니다.");
		
		switch(com) {
		case 0 :
			comStr = "가위";
			break;
		case 1 :
			comStr = "바위";
			break;
		case 2 :
			comStr = "보";
			break;
		}
		System.out.println("컴퓨터는 " + comStr + "를 내셨습니다.");
		
		if(x == com) {
			System.out.println("비겼습니다.");
		}else if((x == 0 && com == 2) || (x == 1 && com == 0) || (x == 2 && com == 1)) {
			System.out.println("당신이 이겼습니다.");
		}else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
	}
}
