package com.example.exam3;

import java.util.Random;

/*
로또 번호 6개를 뽑는 프로그램을 작성하시오.
- 로또 번호는 1부터 45까지 존재한다.
- Thread를 사용하여 비동기로 한번에 6개의 번호를 뽑아야 한다.
- 중복되는 번호가 있을 경우 다시 번호를 뽑아야 한다.
- 중복되지 않는다면 각 Thread는 1번만 숫자를 뽑아야 한다.
- 뽑은 숫자를 오름차순으로 정렬한다.
 */
public class Lotto {
	public static void main(String[] args) {
		Random r = new Random();
		int a[] = new int[6];
		for(int i=0; i<a.length; ) {
			int n = r.nextInt(45)+1;
			
			boolean re = false;
			for(int j=0; j<i; j++) {
				if(n == a[j]) {
					re = true;
				}
			}
			if(re == true) {
				continue;
			}
			a[i] = n;
			i++;
		}
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
