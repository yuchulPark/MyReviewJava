package com.example.exam1;

import java.util.ArrayList;

// ���� ū ��, ���� ū ���� ��ġ�� index (�ߺ��Ǵ� ���)
public class MaxIndex {
	public static void main(String[] args) {
		int a[] = {10,31,100,11,100};
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		// ���� �迭
		ArrayList<Integer> position = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) {
			// ���࿡ �ִ밪�� �ߺ��ȴٸ�
			if(max == a[i]) {
				position.add(i); // ������ �ϳ� �߰�
			}
		}
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ū ���� �ִ� �ڸ� : " + position);
	}
}
