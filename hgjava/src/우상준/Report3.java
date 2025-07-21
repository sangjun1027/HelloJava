package 우상준;

import java.util.Scanner;

public class Report3 {

	public static void main(String[] args) {

		// 문제. 3)
		// 1에서 100까지의 수를 발생시키고 어떤 수인지 알아 맞히는 게임
		Scanner sc = new Scanner(System.in);
		
		int dollor = (int)(Math.random() * 100) + 1;
		
		while(true) {			
			System.out.println("숫자 입력 => ");
			int count = Integer.parseInt(sc.nextLine());
			if( count == dollor ) {
					System.out.println("wow!");
					break;
			}else {
				if( count < dollor ) {
					System.out.println("Up!");
				}else {
					System.out.println("down!");
				}
			} 
		}
	   sc.close();
	

	}//end main

}//end class
