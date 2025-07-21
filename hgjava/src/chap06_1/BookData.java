package chap06_1;

import java.util.Scanner;

public class BookData {
	Scanner sc = new Scanner(System.in);
	

	Book[] bkData(int n){			//bkData 가 method 이름
		Book[] books = new Book[n];
		
		for(int i = 0; i < books.length; i ++) {
			System.out.printf("%d번 째 도서 정보 입력", i + 1);		// i는 0부터이기에 +1
			System.out.print("도서번호 > ");
			int number = Integer.parseInt(sc.nextLine());
			System.out.print("도서제목 > ");
			String bookT = sc.nextLine();
			System.out.print("도서가격 > ");
			int price = Integer.parseInt(sc.nextLine());
			
			books[i] = new Book(number, bookT, price);
		}
		return books;
  }
}
