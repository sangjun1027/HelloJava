package chap06_1;

public class Book {
	// 필드 : field
	private int bookNum;		// private로 접근제한 걸어놓은 상태
	private String bookName;
	private int bookPrice;
	
	
	
	public int getBookNum() {
		return bookNum;
	}



	public String getBookName() {
		return bookName;
	}



	public int getBookPrice() {
		return bookPrice;
	}



	// 생성자 : construct
	Book (int bookNum, String bookName, int bookPrice) {
		this.bookNum =bookNum;
		this.bookName = bookName;
		this.bookPrice =bookPrice;
		
	}
	// 메소드 : method
}//end class
