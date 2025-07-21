package com.yedam.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//Class안에 조회, 등록, 수정, 삭제 가능한 method 생성

public class BookDAO {
	// 목록조회(다건) 즉, 다건을 조회하는 기능을 생성
	// BookDAO라는 크래스에 findall이라는 메소드르 만들어준 것
	// 수정, 매개값(int bno, int price), 반환값(boolean)
	
	// 숙제 : 삭제기능(delete), 단건조회(findById) 작성해보셈
	//      매개값 (
	
	public boolean update(int bno, int price) {
		Connection conn = DBUtill.getConnect();
		String query = "update book" //
						+ "  set price = ? " //
						+ "   where id = ? ";
		// System.out.println(query);
		
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1,  price);		// 첫 번째 값을 지정
			stmt.setInt(2,  bno);
		
		int r = stmt.executeUpdate();		//실행된 쿼리의 결과 count변환
		if ( r > 0 ) {		//한건 입력되몆ㄴ
			return true;
		}
		}	catch (SQLException e) {
			e.printStackTrace();
		}	return false;  	//일단 에러 없는 상태로 만들기
	
	}	//end of update
	// 등록, 매개값(book), 반환값(blooean)
	
	public boolean insert (Book book) {
		Connection conn = DBUtill.getConnect();
		String query = "insert into book(id, title, author, price)" //
				// + "     values("  +  book.getId() + ",'" + book.getTitle() 	
				+ "     values(?,?,?,?)";		//PreparedStatement 구문

				//아래는 걍 Statement
				//+ "("  +  book.getId() + ",'" + book.getTitle() 	//
				//+ "','" + book.getAuthor() + "'," + book.getPrice() + ")";
		
		System.out.println(query);
		
		try {			//statament불편하기에 PreparedStatement 사용 
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1,  book.getId());		// 첫 번째 값을 지정
			stmt.setString(2,  book.getTitle());
			stmt.setString(3,  book.getAuthor());
			stmt.setInt(4,  book.getPrice());
			
		int r = stmt.executeUpdate();		//실행된 쿼리의 결과 count변환
		if ( r > 0 ) {		//한건 입력되몆ㄴ
			return true;
		}
		}	catch (SQLException e) {
			e.printStackTrace();
			}
		return false;  	//일단 에러 없는 상태로 만들기 위해 return값을 false로 !
	}
	public ArrayList<Book> findAll(){		//arraylist class를 import
		Connection conn = DBUtill.getConnect();		//static니깐 이게 가능
		ArrayList<Book> list = new ArrayList<Book>();		//컬렉션(book)
		try {
			Statement stmt = conn.createStatement();	//예외처리 무조건 해야됨
			ResultSet rs = stmt.executeQuery("select * from book");		//쿼리선언
			// 반복
			while(rs.next()) {
				Book book = new Book();		// book class에 기본생성자가 있으면 오류가 안뜸
				book.setId(rs.getInt("id"));	// id라는 필드에다가 id를 할당
				book.setTitle(rs.getString("title"));		// title -> title 필드,
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getInt("price"));
				// 컬렉션에 추가
				list.add(book);
				
			}
		}
		catch (SQLException e) {
		e.printStackTrace();
	}
	return list;
}
}
