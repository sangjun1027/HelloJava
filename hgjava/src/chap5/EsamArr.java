package chap5;

public class EsamArr {

	public static void main(String[] args) {
		// 배열과제 1번
		// 배열생성, 크기 10, 데이터 1~100사이 난수
		// 배열의 값 출력
		// 배열의 합, 최대값, 최소값 출력
		
		int[] rans = new int[10];
		
		for(int i = 0; i < rans.length; i ++) {
			
			rans[i] = (int)(Math.random() * 100) + 1;
			System.out.println(rans[i] + " ");
		
		}
		System.out.println();
		
		int sum = 0;

		int max = 1;
		int min = 100;
		
		for( int i = 0; i < rans.length; i ++ ) {
			sum += rans[i];
			
			if( max < rans[i]) max = rans[i] ; 
			if(min > rans[i]) min = rans[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("최대 값 : " + max);
		System.out.println("최소 값 : " + min);
		
		//배열의 요소 중 4의 배수 출력
		// 4의 배수 갯수 출력
		int count = 0;
		for ( int i = 0; i < rans.length; i ++ ) {
			if( rans[i] % 4 == 0 ) {
				System.out.println(rans[i] + " ");
				count++;
			}
		}
		System.out.println( "\n 4의 배수 갯수 : " + count);
		
		
		
		
		// 2차원 배열
		// 배열 선언
		
		int [][] twoArr = {
				{80,90},
				{70,60,50}
		};
		
		// 2차원 출력
		for( int i = 0; i < twoArr.length; i ++) {   //행
			for ( int j = 0; j < twoArr[i].length; j ++) {   //열
				System.out.printf("| %d ", twoArr[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		// 과제 2.
		// 2차원 배열 출력
		// 배열 = {{1,2,3},{1,2},{1},{1,2,3}};
		
		int [][] twoArr2 = {
				{1,2,3},
				{1,2},
				{1},
				{1,2,3}
		};
		
		for ( int i = 0; i < twoArr2.length; i ++) {
			for ( int j = 0; j < twoArr2[i].length; j ++) {
				System.out.printf("| %d ", twoArr2[i][j]);
			}
			System.out.println();
		}
		
		
		// 과제 3.
		// 관객 있는 좌석 1, 없는 좌석 0 => 난수 이용
		// 극장 자리는 1줄ㅇ에 10좌석씩 3줄
		int[][] guest = new int [3][10];
		int rich = 0;
		for (int i = 0; i < guest.length; i ++) {
			for ( int j = 0; j < guest[i].length; j ++) {
				// 3행 10열의 배열에 0 또는 1 저장 -> 값 출력
				guest[i][j] = (int)(Math.random()*2);
				System.out.printf(" | %d", guest[i][j]);
				// 관객 수 계산하기
				rich += guest[i][j];
			}
			System.out.println();
		}
		System.out.printf(" 관객 수 : %d\n", rich);

		
		
		// 과제 4.
		// 학생 3명
		// 각 학생 당 5번의 테스트 점수를 array에 save
		// 50 <= 점수(난수) <= 100
		// 학생 별 평균계산 출력
		
		int[][] student = new int[3][5];
		for ( int i = 0; i < student.length; i ++) {
			for ( int j = 0; j < student[i].length; j ++) {
				student[i][j] = (int)(Math.random() * 51) + 50; 
				System.out.printf(" %d ", student[i][j]);
			}
			System.out.println();
		}
		
		for ( int i = 0; i < student.length; i ++) {
			int ssum = 0;
			int avg = 0;
			for ( int k = 0; k < student[i].length; k ++) {
				ssum += student[i][k];
			}
				avg = ssum / 5;
			System.out.printf(" %d번 학생 평균 =  %d\n", i + 1, avg );
		}
		
		
		
		// 과제 5.
		// 배열 : Clubs,  Diamonds,  Hearts,  Spades
		// 배열 : 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King
		
		String[] card = {"Clubs",  "Diamonds",  "Hearts",  "Spades"};
		String[] card2 = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		
		 for ( int h = 1; h < 6; h ++) {
			   int q = (int)(Math.random() * 4);
			   int u = (int)(Math.random() * 13);
			   System.out.printf( "%s 의 %s\n ", card[q], card2[u]);
		 }
		
	}//end main
}//end class
