package chap06_1;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BookData bdao = new BookData();		// 생성자 : bookdata객체를 땡겨와서 쓰겠다
		Book[] books = null;
		
		int bookCount = 0;
		boolean run = true;
		
		 while(run) {
			 System.out.println("=========================================================================");
			 System.out.println("1. 도서수 입력	2. 도서정보 등록	3. 도서정보 전체조회	4. 도서정보 분석	5. 종료");
			 System.out.println("=========================================================================");
			 
			 System.out.println(" 선택 >>  ");
			 int selectNum= Integer.parseInt(sc.nextLine());
			 
		switch(selectNum) {		// 입력을 받아야되니, 그 이름이 selectNum
		 		
			case 1 :
				System.out.print("도서 수 > "); 
				bookCount = Integer.parseInt(sc.nextLine());
		 		break;
		 		//book은 객체, book data는 가공이 된 것(배열)
		 		
		 	case 2 :
		 		books = bdao.bkData(bookCount);		// bookCount를 메소드인 bkData에게 넘기겠다
		 		break;
		 	case 3 :
		 		for(int i = 0; i < books.length; i ++) {
		 			System.out.printf("도서번호 : %d , 가격 : %d원\n", books[i].getBookNum(), books[i].getBookPrice());
		 		}
		 		break;
		 	case 4 :
		 		int max = 0;
		 		int min = books[0].getBookPrice();
		 		int sum = 0;
		 		double avg = 0;
		 		
		 		for( int i = 0; i < books.length; i ++) {
		 			if( max < books[i].getBookPrice())		//GET은 private 관련
		 				max = books[i].getBookPrice();
		 			if( min > books[i].getBookPrice())
		 				min = books[i].getBookPrice();
		 			sum += books[i].getBookPrice();
		 		}
		 		avg = (double) sum / books.length;
		 		
		 		System.out.printf("최고 가격 : %d원\n 최저 가격 : %d원\n 평균점수는 %.1f점 입니다", 
		 				           max, min, avg);
		 		break;
		 		case 5 :
		 			run = false;
		 }
	}
		 System.out.println("끝 ! 시발");
		 
		 sc.close();
 }//end main
}// end class
