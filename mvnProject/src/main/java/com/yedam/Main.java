package com.yedam;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.common.DBUtil;
import com.yedam.mapper.BookMapper;
import com.yedam.vo.Book;

public class Main {
	public static void main(String[] args) {
		BookControl ctrl = new BookControl();
		ctrl.exe();
	}
	
	void backup() {
		
		Object obj;
		// RunExe는 Runnable를 구현하는 클래스  -교수님 필기-
		// Runnable > RunExe
		RunExe exe = new RunExe();		// tryp이 같아야됨
		// Runnable exe = new RunExe도 가능 ! / Runnable가 더 상위이기에
		exe.run();	// run은 추상메서드 /  run기능에 관심은 없고, 이름 & 규칙만 지정
					// interface와 구현 class의 관계 -> ex) 차 악셀과 운행기능? 과의 관계?
		
		
		//DBUtil util = new DBUtil();	//인스턴스를 통해서 메모리 로딩
		SqlSessionFactory factory = DBUtil.getInstance();	// static 선언
		// ↑인스턴스를 안만들어도 바로 사용할 수 있는 메서드 
		SqlSession sqlSession = factory.openSession();//SqlSession 객체를 반환.
		
		// interface - 구현class ↓
		BookMapper mapper = sqlSession.getMapper(BookMapper.class);
//		Book book = mapper.selectBook(1001);	// 앞에 Book book 안적어도됨
		List<Book> list = mapper.selectList(1);	//37행이랑 같은 기능, 37행보다 사용이 편함
		
		
//		단건조회
//		Book book = sqlSession.selectOne("com.yedam.mapper.BookMapper.selectBook", 1000);
//		List<Book> list = sqlSession.selectList("com.yedam.mapper.BookMapper.selectList");
		for( Book book : list) {
			System.out.println(book.toStr());
		}
		
//		System.out.println(book.toString());
	}
}
