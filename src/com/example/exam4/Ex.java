package com.example.exam4;

public class Ex {
	public static class Place_Info{
		int place_no; // ������� ��ȣ
		String place_name; // ��� �̸�
		String place_img; // ����
		String place_tel; // ��ȭ��ȣ
		String place_open; // � ���� & �޹���
		String place_price; // �̿� ���
		double place_row; // ��� ����
		double place_col; // ��� �浵
		String place_addr; // �ּ�
		int place_type; // ���� (��� : 0, ������ : 1, ���� : 2)
		String place_detail; // �� ����
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
