package com.example.exam2;

public class CallByReference {
	// ������ �迭�� �Ű������� ���޹޾� �迭�� ��ҿ� ��� 1�� �����ϴ� �޼ҵ�
	public static void plus(int a[]) {
		for(int i=0; i<a.length; i++) {
			a[i] = a[i] + 1;
		}
	}
	public static void main(String[] args) {
		int k = 10; // �⺻ �ڷ��� k�� ����(10) ����. �迭 ������ ���� ������ ���� �ִ� �޸𸮸� ����Ŵ (�ڱ� �ڽ��� ���� ����)
		int a[] = new int[3];
		a[0] = 10; a[1] = 20; a[2] = 30; // �� �� ���� int a[] = {10,20,30};�� ��� ��
		plus(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
