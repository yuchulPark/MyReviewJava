package com.example.exam3;

import java.util.Scanner;

/* 
아래 예시를 참고하여 사칙연산 프로그램을 작성하시오.
- 자연수 A와 B를 입력받는다.
- 수행할 연산 (+, -, *, /(나누기))를 입력받는다
- ‘exit’라는 단어를 입력받아 프로그램을 종료한다
ex) 자연수 A를 입력하시오.
    10
         자연수 B를 입력하시오.
    5
         수행할 연산을 입력하시오.
    +
         결과 : 15
    -------------------------------------
         자연수 A를 입력하시오.
 */
public class AddSubMulDiv {
	public static void main(String[] args) {
		int a,b;
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.println("자연수 A를 입력하시오");
		a = scan.nextInt();
		System.out.println("자연수 B를 입력하시오");
		b = scan.nextInt();
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		
		System.out.println("수행할 연산을 입력하시오");
		result = scan.next();
		if(result.equals("+")) {
			System.out.println(add);
		}else if(result.equals("-")) {
			System.out.println(sub);
		}else if(result.equals("*")) {
			System.out.println(mul);
		}else if(result.equals("/")){
			System.out.println(div);
		}
	}
}
