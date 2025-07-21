package chap01;

import java.io.IOException;

public class Exam106 {     /* class 이름 */

	public static void main(String[] args) throws IOException {
		// 문자열 => 숫자
		String str = "10";
		String str2 = "3.14";
		String str3 = "true";
		
		boolean str3B = Boolean.parseBoolean(str3);
		if (str3B) {
			System.out.println("타입 변경 성공");
		}else {
		    System.out.println("타입 변경 실패");
		}
		
		int strInt = Integer.parseInt(str);
//		int str2double= Integer.parseInt(str2); 타입오류
		double str2Double= Double.parseDouble(str2); 
		
		System.out.println(strInt + str2Double);
		System.out.println(str + str2);
		
		// page.109 5번문제
		char c1 = 'a';
		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		
		// page.109 7번문제
		int x = 5;
		int y = 2;
		double result = (double) x / y ;
		System.out.println(result);
		
		// page.109 8번문제
		double var1 = 3.5;
		double var2 = 2.7;
		int result2 = (int) (var1 + var2);
		System.out.println(result2);
		
		// page.110 9번문제
		long var9 = 2L;
		float var8 = 1.8f;
		double var7 = 2.5;
		String var6 = "3.9";
		int result1 = (int)(var9 + var8 + var7) + (int)Double.parseDouble(var6);
		System.out.println(result1);
		
		// page.110 10번문제
		String str5 = 2 + 3 + "";
		String str6 = 2 + ""+ 3 ;
		String str7 = "" + 2 + 3 ;
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		
		// printf를 쓰면 앞에 포맷이 들어간다
		long var10 = 2L;
		float var20 = 1.8f;
		double var30 = 2.5;
		String var40 = "3.9";
		int result11 = (int)(var10 + var20 + var30) + (int)Double.parseDouble(var40);
		System.out.println(result11);
		System.out.printf("정수 %d, 실수 %.1f,실수:%5.2f,문자열 %s, 결과 %d\n", var10, var20, var30, var40, result11);
		
		// 표준입력장치로 key값(유니코드값)을 입력받음
		int keyCode;
		
		while(true) {
			// system.in.read가 중요함
			keyCode = System.in.read();
			System.out.println(keyCode);
			if(keyCode == 113) {
				break;
			}
		}
		System.out.println("종료");
		
		
		
	} // end main

}  // end class
