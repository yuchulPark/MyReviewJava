package com.example.exam1;

import java.util.Scanner;

// 계산기 프로그램
// 사용자로부터 하나의 문자를 입력받는다.
// 사용자로부터 받은 문자가 +면 두 수의 덧셈을, 문자가 -면 뺄셈을, 문자가 *면 곱셈을, 문자가 /면 나눗셈을 수행하도록 작성
// if-else문, 나눗셈의 경우 분모가 0이 아닌지를 먼저 검사
public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sign; // 연산자 입력을 위한 변수
		int x, y;
		double z = 0; // x와 y를 연산자를 이용해 계산한 결과의 값
		System.out.println("연산자를(+,-,*,/) 입력해주세요.");
		sign = scan.next();
		
		// 만약 연산자가 아닌 값이 입력됐으면
		if(!sign.equals("+") && !sign.equals("-") && !sign.equals("*") && !sign.equals("/")) {
			System.out.println("다시 입력해주세요.");
			return;
		}
		System.out.println("x를 입력해주세요.");
		x = scan.nextInt();
		System.out.println("y를 입력해주세요.");
		y = scan.nextInt();
		
		if(sign.equals("+")) {
			z = x + y;
		}else if(sign.equals("-")) {
			z = x - y;
		}else if(sign.equals("*")) {
			z = x * y;
		}else {
			if(x / y == 0) {
				System.out.println("다시 입력해주세요.");
				return;
			}
			z = x / (double)y;
		}
		System.out.println(z);
	}
}
