package com.example.exam3;

import java.util.Scanner;

/* 
�Ʒ� ���ø� �����Ͽ� ��Ģ���� ���α׷��� �ۼ��Ͻÿ�.
- �ڿ��� A�� B�� �Է¹޴´�.
- ������ ���� (+, -, *, /(������))�� �Է¹޴´�
- ��exit����� �ܾ �Է¹޾� ���α׷��� �����Ѵ�
ex) �ڿ��� A�� �Է��Ͻÿ�.
    10
         �ڿ��� B�� �Է��Ͻÿ�.
    5
         ������ ������ �Է��Ͻÿ�.
    +
         ��� : 15
    -------------------------------------
         �ڿ��� A�� �Է��Ͻÿ�.
 */
public class AddSubMulDiv {
	public static void main(String[] args) {
		int a,b;
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.println("�ڿ��� A�� �Է��Ͻÿ�");
		a = scan.nextInt();
		System.out.println("�ڿ��� B�� �Է��Ͻÿ�");
		b = scan.nextInt();
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		
		System.out.println("������ ������ �Է��Ͻÿ�");
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
