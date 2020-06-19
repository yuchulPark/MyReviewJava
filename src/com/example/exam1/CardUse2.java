package com.example.exam1;

import java.util.Scanner;

// 12개월 동안의 카드 사용 금액을 double형의 배열에 저장하는 클래스 Credit-Card를 설계하라
// 프로그램은 다음과 같은 정보를 반환하는 메소드를 가져야 한다.
// 사용자로부터 월별 사용 금액을 입력받을 때는 음수를 체크하도록 하라.
// ex) 1년동안의 전체 사용 금액, 월별 평균 사용 금액, 가장 지출이 많았던 월, 가장 지출이 적었던 월
// 인덱스 지우고 중복이 있을 경우
public class CardUse2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double usePrice[] = new double[12]; // 12개월 동안 카드 사용 금액의 변수
		double total = 0;
		double avg = 0;
		String name[] = new String[12];
		
		for(int i=0; i<usePrice.length; i++) {
			System.out.println("이름을 입력하세요.");
			name[i] = scan.next();
			System.out.println((i+1) + "월 사용 금액을 입력하세요.");
			usePrice[i] = scan.nextDouble();
			total = total + usePrice[i];
		}	
		avg = total / usePrice.length;
		for(int i=0; i<usePrice.length; i++) {
			System.out.println(name[i] + "\t" + usePrice[i]);
		}
		double max = usePrice[0]; // 사용 금액이 결정되고 나서 max, min을 지정해줘야 함
		double min = usePrice[0];
		
	}
}
