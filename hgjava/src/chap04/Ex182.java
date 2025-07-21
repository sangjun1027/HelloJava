package chap04;

public class Ex182 {

	public static void main(String[] args) {
		// 교재 page.182 문제2
		//1에서 100까지 정수 중 3의 배수 합, 3의 배수의 갯수
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if ( i % 3 == 0) {
				sum  += i;
				count++;
			}
		}
		 System.out.println("3의 배수의 합 = " + sum);
		 System.out.println("3의 배수의 개수 = " + count);
	
		
			 
		 // 교재 page.183 문제3
		 // 추가 : 몇 번만에 탈출했는지 출력
		 // 주사위 2개생성 -> 순서쌍 출력 ->  합이 5가 되었는지 체크 -> 5면 탈출, 아니면 반복
		 // 반복횟수 출력
		int count6 = 0;
		int dice1 = 0;
		int dice2 = 0;
		
		while (dice1 + dice2 != 5) {  //조건식!!! while의 특성
			dice1 = (int)(Math.random() * 6 ) + 1;
			dice2 = (int)(Math.random() * 6 ) + 1;
			System.out.printf(" (%d , %d)\n ", dice1, dice2);
			count6++;
		}
		System.out.printf("%d 번 만에 완료 ", count6);
		 
		 
		// 교제 page.183 문제 4번
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				int result = 4 * x + 5 * y;
				if(result == 60) {
					System.out.printf("(%d,%d)\n", x, y);
				}
			}
		}
		 
		
		
		// 교재 page.183  5번문제
		for (int star = 1; star <= 4; star++) {
			for(int byul = 1; byul <= star; byul++) {
				System.out.print("☆");
			}
			System.out.print("\n");
		}
		
		// 교재 page.183  6번문제
		for (int star1 = 1; star1 <= 4; star1++) {
			for(int byul1 = 3; byul1 >= star1; byul1--) {
				System.out.print(" ");
			}
			for(int byul1 = 1; byul1 <= star1; byul1++) {
				System.out.print("★");
			}
				System.out.print("\n");
		 }
		 
		
		// 6번을 IF문으로
	   for(int star9 = 1; star9 <= 4; star9++) {  //별이 1, 4보다 작거나 같은경우
		 for(int byul9 = 4; byul9 >= 1; byul9--) {  // 
			if(byul9 > star9) {
				System.out.print(" ");
			}else {
				System.out.print("◆");
			}
		}
		System.out.println();
	}
		
		
	   
	   
	   
	   
	   
	   
	} //end main

} // end class
