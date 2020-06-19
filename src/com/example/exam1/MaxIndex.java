package com.example.exam1;

import java.util.ArrayList;

// 가장 큰 값, 가장 큰 값이 위치한 index (중복되는 경우)
public class MaxIndex {
	public static void main(String[] args) {
		int a[] = {10,31,100,11,100};
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		// 동적 배열
		ArrayList<Integer> position = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) {
			// 만약에 최대값이 중복된다면
			if(max == a[i]) {
				position.add(i); // 포지션 하나 추가
			}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 큰 값이 있는 자리 : " + position);
	}
}
