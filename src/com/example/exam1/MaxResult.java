package com.example.exam1;

// 가장 큰값, 가장 큰값이 위치한 index
public class MaxResult {
	public static void main(String[] args) {
		int a[] = {10,31,29,11,100};
		int max = a[0];
		int position = 0; // 제일 큰 배열의 자리수
		
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
				position = i;
			}
		}
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 큰 값이 있는 자리 : " + position);
	}
}
