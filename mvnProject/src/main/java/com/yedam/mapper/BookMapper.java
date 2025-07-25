package com.yedam.mapper;

import java.util.List;

import com.yedam.vo.Book;
// interface는 규칙만 정의
public interface BookMapper {
	public Book selectBook(int id);		//초록글씨가 method
	public List<Book> selectList(int page);		
	public int insertBook(Book book);
	public int deleteBook(int id);
}
