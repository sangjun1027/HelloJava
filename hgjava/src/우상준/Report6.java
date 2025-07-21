package 우상준;

import java.util.Scanner;

public class Report6 {

	public static void main(String[] args) {

		// 문제. 6)
		// 가위, 바위, 보
		// 가위(0), 바위(1), 보(2)
		// Com -> Math.Random 
		// Human  vs  Com  -> Winner Print
		// 2 > n -> Game Over -> Print - > End
		
		
		// human win ->  0  :  2
		//           ->  1  :  0
		//           ->  2  :  1
		
		// 	Com win  ->  0  :  1
		//           ->  1  :  2
		//           ->  2  :  0
		
		// Com 패배 값에 1을 더한다
		// 위 결과 값에 3을 나눈 값  =  Human Win
		// Com % = result
		
		//boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
		int com = (int)(Math.random()*3);
		System.out.print(" ## 가위(0) 바위(1) 보(2) => ");
		int me = Integer.parseInt(sc.nextLine());
		if( me > 2) {
			System.out.println("Game Over");
			break;
		}
		if( me == com) {
			System.out.printf("Com : %d , Me : %d ", com, me);
			System.out.println("무승부");
		}
		else if ( me == (com + 1) % 3   ) {
			System.out.printf("Com : %d , Me : %d ", com, me);
			System.out.println("Me Win");
		} else { 
			System.out.printf("Com : %d , Me : %d ", com, me);
			System.out.println("Com Win");
			
		}
		}
		 
		sc.close();
		
	}//end main

}//end class
