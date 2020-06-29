package com.example.exam2;

public class CallByReference {
	// 정수형 배열을 매개변수로 전달받아 배열의 요소에 모두 1씩 증가하는 메소드
	public static void plus(int a[]) {
		for(int i=0; i<a.length; i++) {
			a[i] = a[i] + 1;
		}
	}
	public static void main(String[] args) {
		int k = 10; // 기본 자료형 k는 값을(10) 가짐. 배열 변수는 참조 변수라서 값이 있는 메모리를 가리킴 (자기 자신은 값이 없음)
		int a[] = new int[3];
		a[0] = 10; a[1] = 20; a[2] = 30; // 위 두 줄을 int a[] = {10,20,30};로 적어도 됨
		plus(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
