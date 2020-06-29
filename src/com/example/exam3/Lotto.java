package com.example.exam3;

import java.util.Random;

/*
�ζ� ��ȣ 6���� �̴� ���α׷��� �ۼ��Ͻÿ�.
- �ζ� ��ȣ�� 1���� 45���� �����Ѵ�.
- Thread�� ����Ͽ� �񵿱�� �ѹ��� 6���� ��ȣ�� �̾ƾ� �Ѵ�.
- �ߺ��Ǵ� ��ȣ�� ���� ��� �ٽ� ��ȣ�� �̾ƾ� �Ѵ�.
- �ߺ����� �ʴ´ٸ� �� Thread�� 1���� ���ڸ� �̾ƾ� �Ѵ�.
- ���� ���ڸ� ������������ �����Ѵ�.
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
