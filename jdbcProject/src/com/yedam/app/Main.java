package com.yedam.app;

import java.util.ArrayList;
import java.util.Scanner;

//사용자 입력 => DB 반영
	//DB결과 => 콘솔출력,
	// 이 전체 프로그램의 컨트롤 역할

public class Main {		// main method가 여기서부터 시작
	public static void main(String[] args) {		// ctrl + space
		boolean run = true;	//반복조건에 사용
		Scanner scn = new Scanner(System.in);
		BookDAO dao = new BookDAO(); // 조회기능
		
		while (run) {
			System.out.println("도서 관리 시스템");
			System.out.println("1. 도서 목록");
			System.out.println("2. 도서 목록");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("9. 종료");
			System.out.print("선택 : ");
			int menu = scn.nextInt();		//입력값을 menu변수에 대입(할당)
			
			switch(menu) {
			case 1 :	// 도서목록
					ArrayList<Book> list = dao.findAll();		//목록가져오는 method가 findAll, 반환: ArrayLisy<Book>
					System.out.println("도서번호 도서명    저자    가격");
					System.out.println("==========================");
					for(int i = 0; i<list.size(); i ++) {
						System.out.println(list.get(i).getId()  // 
								+ " " + list.get(i).getTitle()  //
								+ " " + list.get(i).getAuthor() //
								+ " " + list.get(i).getPrice()  //
								);
					} // end of for
					break;	
			case 9 : 	// 종료
				run = false;
			} // end of switch
		} // end of while
		System.out.println("end of program");
	}//end main().
} // end of class
		