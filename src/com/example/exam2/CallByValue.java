package com.example.exam2;

public class CallByValue {
	// �Ű����� n�� ���޹޾� n�� ���� 1�����Ͽ� ����ϴ� �޼ҵ�
	public static void plus(int n) {
		n = n + 1;
		System.out.println(n);
	}
	// �����ؼ� ���� n�� ���� n�� ������ �����̴�.
	public static void main(String[] args) {
		int n = 31;
		plus(n);
		System.out.println(n);
	}
}
