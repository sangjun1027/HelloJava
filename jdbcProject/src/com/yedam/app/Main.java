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
			System.out.println("2. 도서 등록");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 하나");
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
			
			case 2 : // 도서등록
				System.out.println("도서번호 >> ");
				int bno = scn.nextInt();scn.nextLine();			//1003엔터, 변환값이 int
				System.out.println("도서제목 >> ");
				String title = scn.nextLine();		//변환값이 String
				System.out.println("도서저자 >> ");
				String author = scn.nextLine();		//변환값이 String
				System.out.println("도서가격 >> ");
				int price = scn.nextInt();scn.nextLine();		//변환값이 int
				
				Book book = new Book (bno, title, author, price);
				if (dao.insert(book)){		//dao.insert(book)변환 값이 blooean이라서 true면 위, false면 else
					System.out.println("정상 등록");
				} else {
					System.out.println("등록 중 오류");
				}
				break;
				
			case 3 : // 도서수정
				System.out.println("도서번호 >> ");
				bno = scn.nextInt();scn.nextLine();			
				System.out.println("도서가격 >> ");
				price = scn.nextInt();scn.nextLine();
				if (dao.update(bno, price)) {
					System.out.println("정상 수정");
				} else {
					System.out.println("수정 중 오류");
				}
				break;
				
			case 4 :
				System.out.println("삭제할 번호");
				bno = scn.nextInt();scn.nextLine();
				if (dao.delete(bno)) {
					System.out.println("삭제완료");
				} else {
					System.out.println("삭제실패");
				}
				break;
				
			case 5 :
				System.out.println("도서번호>> ");
				bno = scn.nextInt();
				scn.nextLine();
				
				ArrayList<Book> list1 = dao.findByID(bno);
				
				System.out.println("도서번호   도서명   저자   가격");
				System.out.println("=========================");
				System.out.println(list1.get(0).getId() 
									+ " " + list1.get(0).getTitle()
									+ " " + list1.get(0).getAuthor()
									+ " " + list1.get(0).getPrice());
				break;
				
			case 9 : 	// 종료
				run = false;
			} // end of switch
		} // end of while
		System.out.println("end of program");
		
		scn.close();
	}//end main().
	
} // end of class
		