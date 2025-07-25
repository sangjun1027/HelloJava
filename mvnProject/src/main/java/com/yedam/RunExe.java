package com.yedam;

// Ruuable라는interface에 정의된 추상메소드 구현. <<약속  -교수님 필기-
	public class RunExe implements Runnable {

	@Override
	//부모class는 아니지만 비슷한 역할
	public void run() {
		// Runnable가 가지고있는 메서드를 RynExe에서 구현해줌
		System.out.println("달립니다");
		
		
	}

}
