package com.example.exam1;

import java.util.Scanner;

// ����ڷκ��� n�� �Է¹޾� 1���� n������ ¦���� ��, Ȧ���� ��, ¦���� ����, Ȧ���� ������ ���� ���Ͽ� ���
public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n; // �Է¹޴� ��
		int even = 0, odd = 0; // ¦��, Ȧ��
		int sumEven = 0, sumOdd = 0; // ¦���� ��, Ȧ���� ��
		System.out.println("n�� �Է��ϼ���.");
		n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i % 2 == 0) { // ¦����
				sumEven = sumEven + i; // ¦���� �տ� ����
				even = even + 1; // ¦���� ������ 1 ������Ŵ 
			}else {
				sumOdd = sumOdd + i; // Ȧ���� �տ� ����
				odd = odd + 1; // Ȧ���� ������ 1 ������Ŵ
			}
		}
		System.out.println("¦���� �� : " + sumEven);
		System.out.println("Ȧ���� �� : " + sumOdd);
		System.out.println("¦���� ���� : " + even);
		System.out.println("Ȧ���� ���� : " + odd);
	}
}
