package chap5;

public class Arr204 {

	public static void main(String[] args) {
		// 배열 생성, 배열 데이터 활용
		// 교재 page.204
		// add method없이 그냥 바로 생성하고 바로 합해서 출력
		int[] scores;   //int형 배열 생성이름은 scores
		scores = new int[] {83, 90, 87};  //scores배열에 data삽입
		int sum1 = 0; //sum 변수 초기화
		for (int i = 0; i < 3; i ++) {  //for문을 이용해서 하나하나 더하기
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);  //sum1 출력
		
		//add method를 이용해서 출력
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합 : " + sum2);
		System.out.println();
	
		// int형의 배열 선언, 크기 : 5
		// 배열에 50 ~ 100사이의 수 5개 입력
		// 배열의 합 계산
		int[] rans = new int[5]; 
		// 배열의 값
		for (int i = 0; i < rans.length; i ++) {   //rans의 길이
			rans[i] = (int)(Math.random() * 51) + 50;
			System.out.println(rans[i]);
		}
		// 배열의 합
		int result = add(rans);
		System.out.println("배열합 = " + result);
		
		
	}//end main
		
	public static int add(int[] scores) {  //method
		// 배열의 합
		int sum = 0;
		for(int i = 0; i < scores.length; i ++) {
			sum += scores[i];
		}
		return sum;
	}//end add
}


