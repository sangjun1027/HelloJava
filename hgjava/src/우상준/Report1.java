package 우상준;

import java.util.Scanner;

public class Report1 {

	public static void main(String[] args) {
	
		// 문제.1) 윤년 계산
		Scanner sc = new Scanner(System.in);
		
		System.out.println("□□년도 입력 : ");
		
		int year = Integer.parseInt(sc.nextLine());
		
		if( year % 4 == 0) {
		   if( year % 400 == 0 && (year % 100 != 0)) {
			    System.out.println("윤년 입니다");
		}  else {
			    System.out.println("평년 입니다");
		}
	   }
		sc.close();
	}//end main

} //end class
