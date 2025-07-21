package chap01;

import java.util.Scanner;

public class Ex149 {

	public static void main(String[] args) {
		// 교재 page.149
		// 이유를 주석으로 표시하고, 오류를 수정
		
		// 문제.1
		int  b = 5;  //정수형으로 연산을 해야되기에 int로
		b = -b;   
		int result = 10 / b;
		System.out.println(result);

		
		// 문제.2
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);  // x = 11 / y = 18
		System.out.println(z);  // z = 31
		
		// 문제.4
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
		
		// 문제.5
		int var1 = 5;
		int var2 = 2;
		double var3 = (double)var1 / var2; 
		// 정수를 나누면 실수로 2.5인데 int로 표현하면 0.5빠지고 2이 나옴
		// double로 입력하면 2
		int var4 = (int)(var3*var2);
		System.out.println(var4);
	
		// 문제. 6
		int value = 356;
		System.out.println((value / 100 ) * 100);
		
		// 문제. 7
		float var11 = 10f;
		float var22 = var11 / 100;
		if (var22 == 0.1f) {
			// var22가 float , 0.1은 double형식
			System.out.println("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}
	
		// 문제. 8
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double)(lengthTop + lengthBottom) * height / 2;
		System.out.println(area);
	
		// 문제. 9
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 수");
		double fsu = Double.parseDouble(sc.nextLine());
		
		
		System.out.println("두 번째 수");
		double ssu = Double.parseDouble(sc.nextLine());
		
		System.out.println("--------------------");
		
		if ( ssu == 0 || ssu == 0.0) {
				System.out.println("결과 : 값");
		} else {
			double result99 = fsu / ssu;
			System.out.println("결과 : 무한대" + result99);
		}
		
		
		//
		//var 4 = var 1 * var2 * var2 + "."+var3)
		//10 * 10 * 3.14
		//0 * 10* "3.14" int double
		//doubld.parsedouble("3.14")
		
	
		
		
		
		// 교수님 문제
		// 윤년계산 프로그램
		// 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년
		// 400으로 나누어 떨어지면 윤년
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" ##년도 입력 :");
		int year = Integer.parseInt(scan.nextLine());
		
		if( year % 4 == 0 ) {
			if ( year % 400 == 0 && ( year % 100 !=0)) {
				System.out.println( year + "년은 윤년입니다.");
			} else {
				System.out.println( year + "년은 평년입니다.");
			}
				
			scan.close();
			
	
		
	} // end main
	}	
} // end class
	

