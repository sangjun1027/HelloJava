package 우상준;

import java.util.Scanner;

public class Report2 {

	public static void main(String[] args) {
		
		// 문제. 2) 동전 교환
		
		Scanner sc = new Scanner(System.in);
		System.out.print("액수 입력 >>\n");
		
		int price = Integer.parseInt(sc.nextLine());
		int remain = price;
				
		int coin500 = 0;
		int coin100 = 0;
		int coin50 = 0;
		int coin10 = 0;
				
		coin500 = price / 500;
		remain = price % 500;
		
		coin100 = remain / 100;
		remain = remain % 100;
		
		coin50 = remain / 50;
		remain = remain % 50;
		
		coin10 = remain / 10;
		remain = remain % 10;
		
		System.out.printf("500원 짜리 : %d개\n"
				+ "100원 짜리 :%d개\n"
				+ "50원 짜리 : %d개\n"
				+ "10원 짜리 : %d개\n"
				+ "교환금액 : %d원\n"
				+ "잔액 : %d원\n", coin500, coin100, coin50, coin10, price - remain, remain);
		
		sc.close();
	}//end main

}//end class
