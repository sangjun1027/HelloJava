package chap01;

import java.util.Scanner;

public class Scanner117 {

	public static void main(String[] args) {
		// 통문자 읽어오기
		// scanner 객체를 생성하고,
		Scanner sc = new Scanner(System.in);
		// scanner method를 이용
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름 >>");
		String name = sc.nextLine();
		System.out.print("2. 주민번호 앞 6자리 >>");
		String idNum = sc.nextLine();
		System.out.print("3. 전화번호 >>");
		String phone = sc.nextLine();
		
		//출력 ctrl + alt + 아랫키
		System.out.println("");
		System.out.println("[입력된 내용]");
		System.out.println("[1. 이름 : ]" + name);
		System.out.println("[2. 주민번호 앞 6자리]" + idNum);
		System.out.println("[2. 전화번호]" + phone);
		
		sc.close();

	}

}
