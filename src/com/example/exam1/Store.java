package com.example.exam1;

import java.util.Scanner;

// 상점에서 하나에 100원인 물건을 판매하고 있다고 가정. 물건을 10개 이상 구입하는 고객에게 10%를 할인해준다고 하자.
// 사용자가 구입한 물건의 개수를 입력하면 전체 가격이 얼마인지 계산해주는 프로그램을 작성
public class Store {
	public static void main(String[] args) {
		int item; // 몇 개를 구매할건지
		int price = 100; // 상품 가격은 100원
		Scanner scan = new Scanner(System.in);
		System.out.println("물건의 개수를 입력하세요.");
		item = scan.nextInt();
		if(item >= 10) { // 물건을 10개 이상 구매하면
			System.out.println("전체 가격은 " + price * item * 0.9 + "원 입니다.");
		}else {
			System.out.println("전체 가격은 " + price * item + "원 입니다.");
		}
	}
}
