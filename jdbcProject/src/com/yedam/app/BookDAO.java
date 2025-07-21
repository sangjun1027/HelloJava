package com.yedam.app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//Class안에 조회, 등록, 수정, 삭제 가능한 method 생성

public class BookDAO {
	// 목록조회(다건) 즉, 다건을 조회하는 기능을 생성
	// BookDAO라는 크래스에 findall이라는 메소드르 만들어준 것
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
