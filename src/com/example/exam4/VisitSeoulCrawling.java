package com.example.exam4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// 크롤링
public class VisitSeoulCrawling {
	public static class Place_Info {
		int place_no; // 여행 장소 번호
		String place_name; // 장소 이름
		String place_img; // 사진
		String place_tel; // 전화번호
		String place_open; // 운영 요일 & 휴무일
		String place_price; // 이용 요금
		double place_row; // 장소 위도 (카카오 맵 api 이용하기 위한 위도)
		double place_col; // 장소 경도 (카카오 맵 api 이용하기 위한 경도)
		String place_addr; // 주소
		int place_type; // 구분 (명소 : 0, 음식점 : 1, 숙소 : 2)
		String place_detail; // 상세 설명
	
		// 생성자 만들기
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
	
	
	// oracle에 데이터 넣기
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
	
	
	// 가장 큰 페이지 번호 출력하는 메소드
	public static int getMaxPage() {
		String url = "https://korean.visitseoul.net/attractions"; // visit seoul의 명소 홈페이지
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

