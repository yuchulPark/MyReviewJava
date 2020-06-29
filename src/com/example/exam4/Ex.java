package com.example.exam4;

public class Ex {
	public static class Place_Info{
		int place_no; // 여행장소 번호
		String place_name; // 장소 이름
		String place_img; // 사진
		String place_tel; // 전화번호
		String place_open; // 운영 요일 & 휴무일
		String place_price; // 이용 요금
		double place_row; // 장소 위도
		double place_col; // 장소 경도
		String place_addr; // 주소
		int place_type; // 구분 (명소 : 0, 음식점 : 1, 숙소 : 2)
		String place_detail; // 상세 설명
		public Place_Info(int place_no, String place_name, String place_img, String place_tel, 
				String place_open, String place_price, double place_row, double place_col, 
				String place_addr, int place_type, String place_detail) {
			this.place_no = place_no;
			this.place_name = place_name;
			this.place_img = place_img;
			this.place_tel = place_tel;
			this.place_open = place_open;
			this.place_price = place_price;
			this.place_row = place_row;
			this.place_col = place_col;
			this.place_addr = place_addr;
			this.place_type = place_type;
			this.place_detail = place_detail;
		}
	}

	public static void main(String[] args) {
		
	}
}
