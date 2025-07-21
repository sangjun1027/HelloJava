package com.yedam;
//속성 => 필드
//기능 => 메소드
// 속성 : 학생번호, 이름, 연락처, 혈액형 
public class Student {
	
	private int stdNo; // java는 대소문자 구분 ! std_no(oracle스타일)
	//field
	private String stdName;
	private String phone;
	private String bloodType;
	
	//생성자
	public Student() {
		// 기본생성자(매개값이 X , 정의가 안돼면 호출 불가능)
	}
	public Student(int stdNo, String stdName, String phone, String bloodType) {
		this.stdNo = stdNo;  //첫번째 매개값은 학생번호를 채워주는 역할
		this.stdName = stdName;
		this.phone = phone;
		this.bloodType = bloodType;
	}
	
	//method ( getter, setter )			//걍 외워라 !!!!!
	//stdNo : 매개변수
	//this : 인덱스, 자신!  /  stdNo: 필드
	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

}

