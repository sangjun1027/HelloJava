package chap01;

public class Hello {

	public static void main(String[] args) {
		// 출력문
		System.out.println("hello java!");
		int a = 7;
		System.out.println(a);
		
		//변수의 값 교환
		int x = 10;
		int y = 50;
		int temp = y; /* y를 temp라는 기억공간으로 */
		y = x;
		x = temp;
		System.out.println("x= " + x + " y= " + y);
		
		
		// 기본타입
		char font = 'A';
		int intchar = font + 1;
		char font2 = (char)intchar; /*char이 int보다 작기에 */
		System.out.println(font);
		System.out.print(intchar + "\n");
		System.out.println(font2);
		
		// 문자열 저장 -> String라는 객체type 변수를 생성
		String str = "우상준";
		System.out.println(str);
		
		
		// 연산 : 정수 -> 기본type = int,  실수 -> 기본type =  double
		int su1 = 1;
		int su2 = 3;
        //int result = su1 / su2;   0으로 출력
		double result = su1 / su2;
		System.out.println(result);
		
		// 결과가 0.3333로 나오게하기위한 강제type변환
		result = (double)su1 / su2;
		System.out.println(result);
		
		
		// 문자열비교 교재 page.143
		String str1 = "신용권";
		String str2 = "신용권";
		String str3 = new  String("신용권");
		// new는 힙공간에 주소를 새롭게 생성했기에
		// str1은 리터럴 "신용권" str2까지는 주소가 같기에 true
		// str3은 주소가 다르기에 false
		boolean resultStr = str1 == str2; // 힙 주소 비교 => 같은객체인지 확인하는 것
		boolean resultObj = str2 == str3;
		// ==는 객체가 같냐? 라고 묻는거
		System.out.println(resultStr); // 같은객체
		System.out.println(resultObj); // 다른객체
		System.out.println(str1.equals(str3)); //객체데이터 자체를 비교
	
		// &=,  |=,  ^= 연산  교재 page.143
		int r1 = 1 & 2; 
		int r2 = 1 | 2;
		int r3 = 1 ^ 2;
		System.out.println("and 연산 = " + r1);
		System.out.println("or 연산 = " + r2);
		System.out.println("xor 연산 = " + r3);
	
		// 7월15일 총망라
		// 수 20이 4의 배수이면서 5의 배수인지 체크 (if)
		// 결과 = 20은 4와 5의 배수입니다. 라고 출력 (printf)
		// 아니면 20은 4와 5의 배수가 아닙니다. 라고 출력 (printf)
		// 홀수 짝수 구별 (삼항연산자)
		// 수는 20을 이용
		// 
		int num = 20;
		if (num % 4 == 0 && num % 5 == 0) {
			System.out.printf("%d은 20은 4와 5의 배수입니다.\n", num);
	   }else {
		   System.out.printf("%d은 20은 4와 5의 배수가 아닙니다.\n", num);
		}
	 
		String result99 = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result99);
		
	}

}
