package com.yedam;

import java.util.ArrayList;

public class ListExe {
	public static void main(String[] args) {
		// ArrayList 클래스. vs 배열.
		int[] intAry = {10, 20, 30}; // intAry[0] = 10;
		for(int i = 0; i < intAry.length; i++) {
			System.out.println("[" +i+ "]번째 값 =>" + intAry[i]);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();  //배열대신 class를 사용
		//복잡한 형태의 data를 class에 담을 수 있다.
		list.add(10); //추가 add라는 메소드 사용
		list.add(20);
		list.add(30);
		for(int i = 0; i < list.size(); i++) { // class이고 메소드 활용이기에 length 말고 size
			System.out.println("["+i+"]번째 값=> "+list.get(i));
		}
		
		//학생정보
		ArrayList<Student> stdList = new ArrayList<Student>();
		Student s1 = new Student();  //s1이라는 변수에 인스턴스생성
		s1.setStdNo(1000);		//학번: 1000
		s1.setStdName("우상준");		
		s1.setPhone("010-1234-5678");		
		s1.setBloodType("A");
		
		Student s2 = new Student(2000, "카리나", "010-9886-5432", "B");
		
		stdList.add(s1);
		stdList.add(s2);
		stdList.add(new Student(3000, "장원영", "010-5678-0192", "O"));
		
		for (int i = 0; i<stdList.size(); i ++) {
			System.out.println("학번 : " + stdList.get(i).getStdNo() + ", 이름 : " + stdList.get(i).getStdName());		//값을 가져올 때는 get method 사용
		}
		System.out.println("end of prog.");
	}//end of main

}// end class
