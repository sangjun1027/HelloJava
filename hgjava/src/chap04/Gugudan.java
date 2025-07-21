package chap04;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단을 외우자 !!!
		// 단을 반복
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("****" + dan + "****");
			for(int gob = 1; gob <=9; gob++) {
				System.out.printf("%d x %d = %d\n", dan, gob, dan * gob);
			}
			System.out.println();
		}

		
		// 과제 4번. 유아용 구구단 포스터(?)
		for (int dan = 2; dan <= 9; dan++) {
		System.out.printf("%9d 단 ", dan);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		for (int num = 1; num <=9; num++ ) {
			for (int gob9 = 2; gob9 <=9; gob9++) {
				System.out.printf("%d x %d = %4d  ", gob9, num, num * gob9 );
			}
			System.out.println();
		}
		
		

		
		
		
	} // end main

} // end class
