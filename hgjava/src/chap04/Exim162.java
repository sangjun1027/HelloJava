package chap04;

public class Exim162 {

	public static void main(String[] args) {
		// 주사위 게임
		// 주사위를 2개 던져서 합이 10을 넘으면 두 수를 더하고 > 덧셈결과 : 000
		// 아니면 두 수를 곱한 결과를 출력 > 곱셈결과 : 000
		int num1 = (int)(Math.random() * 6) + 1;
		System.out.println("1번 주사위 :" + num1);
		int num2 = (int)(Math.random() * 6) + 1;
		System.out.println("2번 주사위 :" + num2);
		
		int sum = num1 + num2;
		int gop = num1 * num2;
		
		if (sum > 10) {
			System.out.println(" 덧셈결과 : " + sum);
		}else {
			System.out.println("곱셈결과 :" + gop);
			
		// int result = dice1 + dice2 ; 
		// if (result > 10) {
		// system.out.printf(%/d + %/d = %d\n , dice1, dice2, result);
		// else {
		// system.out.printf(%d * %d = %d\n , dice1, dice2, dice1 * dice2)
			
		// 문제2. 오전 (9시~12시) 일정출력
		// 현재시간 확인
		// 9시 : 출근,  10시 : 회의, 11시 : 업무, 12시 : 외근
		int time = (int)(Math.random() * 4 ) + 9;
		System.out.println("현재시간 :" + time);
		switch(time) {    //break가 없으면 아래로 쭉쭉쭉 !!
		case 9 :
			System.out.println("출근");
		case 10 :
			System.out.println("회의");
		case 11:
			System.out.println("업무");
		case 12 :
			System.out.println("외근");
		}
		System.out.println("퇴근");
	}
			
		
		// 교재 page.169 문제 3번을 switch로
		int score = 65;
		
		System.out.println("등급은 ");
		score = score / 10 * 10;
		
		switch(score / 10) {
		
		case 10 :
		case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		default :
			System.out.println("D의 의지");
			break;
		}
		
		System.out.println("입니다");

		
		// 반복문  for, while
		// 주사위 2개를 던져서 합이 10이되면 탈출
		  // 주사위 순서쌍 출력 
		// 5회 이상이 되면 game over -> 출력
		
		for (int i = 0; i < 5; i++) {
			
		int dice1 = (int)(Math.random() * 6 ) + 1;  // 0부터 시작이니깐 +1 해주는거다 븅신아!
		int dice2 = (int)(Math.random() * 6 ) + 1;
		System.out.printf(" ( %d ,  %d ) \n",dice1, dice2);  // %d를 적어야 , 뒤에 변수가 출력된다.
		
		if (dice1 + dice2 >10) {
			System.out.println("탈출 성공!!!");
			break;
		}
	}
		System.out.println("game over");
		
		
		
		
	} // end main

} // end class
