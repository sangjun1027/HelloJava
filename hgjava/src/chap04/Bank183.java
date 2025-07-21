package chap04;

import java.util.Scanner;

public class Bank183 {

	public static void main(String[] args) {
		// 교재 page.183  문제7
		// 잔고변수생성
		// 실행제어 변수
		// 업무 1. 예금, 2. 출금, 3.조회, 4.종료
		// 종료가 될 때까지 반복
		boolean  run  =  true;
		int  balance  =  0;  //잔액
		Scanner sc = new Scanner(System.in);
		int money;
		   
		while(run) {
		  System.out.println("---------------------------------------");
		  System.out.println(" 1. 예금 : 2. 출금 : 3. 잔고 : 4. 종료");
	      System.out.println("---------------------------------------");
		  System.out.print("선택 >> ");
		  
		  int selNum = Integer.parseInt(sc.nextLine());
		  
		  switch(selNum) {
		  case 1 :
			  System.out.print("예금액 >> ");
			  money = Integer.parseInt(sc.nextLine());
			  balance += money;
			  break;
		  case 2 :
			  // 출금액이 부족할 경우 '잔액부족 출력
			  // 출금 가능금액 출력
			  // 가능하면 출금처리
			  System.out.print("출금액 >>");
			  money = Integer.parseInt(sc.nextLine());
			  if( money > balance) {
				  System.out.println("잔액이 부족합니다");
				  System.out.printf("%d\n", balance);
			  }else {
				  balance -= money;
			  }break;
			  
		  case 3 :
			  System.out.println("잔액");
			  System.out.printf(" %d", balance);
			  
		  //default :
		  }
		  
		   }

	}

}
