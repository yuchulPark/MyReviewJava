package com.example.exam4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// ũ�Ѹ�
public class VisitSeoulCrawling {
	public static class Place_Info {
		int place_no; // ���� ��� ��ȣ
		String place_name; // ��� �̸�
		String place_img; // ����
		String place_tel; // ��ȭ��ȣ
		String place_open; // � ���� & �޹���
		String place_price; // �̿� ���
		double place_row; // ��� ���� (īī�� �� api �̿��ϱ� ���� ����)
		double place_col; // ��� �浵 (īī�� �� api �̿��ϱ� ���� �浵)
		String place_addr; // �ּ�
		int place_type; // ���� (��� : 0, ������ : 1, ���� : 2)
		String place_detail; // �� ����
	
		// ������ �����
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
	
	
	// oracle�� ������ �ֱ�
	public static void insertPlace_Info(List<Place_Info> list) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##dotori", "dotori");
			String sql = "insert into place_info values((select nvl(max(place_no),0)+1 from place_info), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			for(int i = 0; i < list.size(); i++) {
				Place_Info pi = list.get(i);
				ps.setInt(1, pi.place_no);
				ps.setString(1, pi.place_name);
				ps.setString(2, pi.place_img);
				ps.setString(3, pi.place_tel);
				ps.setString(4, pi.place_open);
				ps.setString(5, pi.place_price);
				ps.setDouble(6, pi.place_row);
				ps.setDouble(7, pi.place_col);
				ps.setString(8, pi.place_addr);
				ps.setInt(9, pi.place_type);
				ps.setString(10, pi.place_detail);
				ps.execute();
				System.out.println(pi.place_name);
			}
			if(conn != null) {
				conn.close();
			}
			if(ps != null) {
				ps.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// ���� ū ������ ��ȣ ����ϴ� �޼ҵ�
	public static int getMaxPage() {
		String url = "https://korean.visitseoul.net/attractions"; // visit seoul�� ��� Ȩ������
		Document doc;
		try {
			doc = Jsoup.connect(url).get();
			String maxPageStr = doc.select("a.icon:nth-child(9)").attr("href");
			maxPageStr = maxPageStr.substring(maxPageStr.indexOf("=") + 1);
			System.out.println(maxPageStr);
			return Integer.parseInt(maxPageStr);
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
	private static int MAX_PAGE = 0;
	public static void main(String[] args) {
		MAX_PAGE = getMaxPage();
	}
}

