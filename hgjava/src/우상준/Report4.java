package 우상준;

public class Report4 {

	public static void main(String[] args) {
		// 문제. 4) 구구단을 외자!!
		
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
		

	}//end main

}// end class
