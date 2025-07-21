package chap5;

import java.util.Scanner;

public class Ex223 {

	public static void main(String[] args) {
		// 교재 page. 223
		// switch문 이용
			// 1. 학생 수 받아서 => 배열의 크기 잡아줌
			// 2. 배열의 크기만큼 학생점수 입력 받아줌
			// 3. 배열에 저장된 학생점수 출력해줌
			// 4. 점수 중 최고점수와 평균점수 계산해서 출력해줌
			// 5. 프로그램 종료
		// 6번 문제
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println(" 1. 학생수 |  2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5.종료 ");
			System.out.println("--------------------------------------------------------");
			System.out.println("선택 >> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			switch(selectNo) {
			
				case 1 :  // 학생 수 받아서 => 배열크기 잡아줌
					System.out.println("학생 수 > ");	  // 메뉴 1~5 선택
					studentNum = Integer.parseInt(scanner.nextLine());
					scores = new int[studentNum];  // 배열크기 잡아줌
					break;
			   
				case 2 : // 학생 점수 를 배열에 입력
					for (int i = 0; i < studentNum; i ++) {
						System.out.printf("scores[%d] > ", i);
						scores[i] = Integer.parseInt(scanner.nextLine());
					}
					break;
				
				case 3 : // 학생 점수 출력
					for ( int i = 0; i < studentNum; i ++) {
						System.out.printf("scores[%d] > %d\n ", i, scores[i]);
					}
					break;
					
				case 4 : 
				int sum = 0;
				int max = 0;
				for (int score : scores) {
					if( max < score ) {
						max = score;
					}
				sum += score;
				}
				Double avg = (double)sum / studentNum;
				System.out.printf("최고 점수 : %d\n", max);
				System.out.printf("평균 점수 : %f\n", avg);
				break;
				default :
					run = false;
			}
		}
				System.out.println("프로그램 종료");
				
				scanner.close();
	} 
}
