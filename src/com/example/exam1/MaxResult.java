package com.example.exam1;

// ���� ū��, ���� ū���� ��ġ�� index
public class MaxResult {
	public static void main(String[] args) {
		int a[] = {10,31,29,11,100};
		int max = a[0];
		int position = 0; // ���� ū �迭�� �ڸ���
		
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
				position = i;
			}
		}
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ū ���� �ִ� �ڸ� : " + position);
	}
}
