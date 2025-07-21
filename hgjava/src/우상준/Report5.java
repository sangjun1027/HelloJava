package 우상준;

import java.util.Scanner;

public class Report5 {

	public static void main(String[] args) {
		// 문제. 5) 섭씨-화씨 온도 변환 프로그램
		// 화면에  ----- 아래 내용을 출력
		// 번호선택에 입력창! -> 입력번호에 따른 연결
			boolean run = true;
			Scanner sc = new Scanner(System.in);
			
			while(run) {
			System.out.println("------------------");
			System.out.println("1. 화씨 => 섭씨");
			System.out.println("2. 섭씨 => 화씨");
			System.out.println("3. 종료");
			System.out.println("------------------");
		// 화면에 출력 되는데 ...
			System.out.print("▶번호 선택 : \n");
			int etr = Integer.parseInt(sc.nextLine());
			
			double subC = 0;
			double hwaF = 0;
			
			
			switch(etr) {
			case 1 : 
				System.out.printf("▶화씨 온도 입력 : \n");
				hwaF = Integer.parseInt(sc.nextLine());
				subC = 5d / 9 * (hwaF - 32);
				System.out.print("섭씨온도=  "+ subC);
				break;
			case 2 :
				System.out.printf("▶섭씨 온도 입력 : \n");
				subC = Integer.parseInt(sc.nextLine());
				hwaF = 9d / 5 * subC + 32;
				System.out.println("화씨온도= " + hwaF);
				break;
			case 3 :
				 System.out.println("program end");
				 run = false;
				 break;
			}
		     
		}
		sc.close();

	}//end main

}//end class
