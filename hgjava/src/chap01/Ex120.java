package chap01;

import java.util.Scanner;

public class Ex120 {

	public static void main(String[] args) {
		// 교재 page.120 1번문제
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2="123", tel3="4567"; 
		/* 다 string type이기에 이어줄 수 있음 */
		
		System.out.println("이름 : " + name);
		System.out.print("나이 : " + age + "\n");
		System.out.printf(" 전화 + %s-%s-%s\n",tel1, tel2,tel3);

		// 교재 page.121 2번 문제
		Scanner sc = new Scanner(System.in);
		// import 시키는 단축키 : Ctrl + Shift + O , 자주사용
		
		System.out.print("수1 입력 >");
		int num1 = Integer.parseInt(sc.nextLine());
		//integer.parsint : 문자를 정수로 바꾸기위해
		//nextline : sc안에있는 method
		
		System.out.print("수2 입력>");
		int num2 = Integer.parseInt(sc.nextLine());
		
		int result = num1 + num2;
		// 변수사용!
		
		System.out.println("덧셈 결과" + result);
		
		sc.close();
		
	}//end main

}//end class	


