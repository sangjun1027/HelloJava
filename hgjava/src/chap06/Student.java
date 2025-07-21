package chap06;

public class Student {
	// 객체생성 class
	// 필드 : 객체의 속성 (data)
		String name;		// 모든 애들이 이름이 같을 수 있기에, 자리만 잡아둠
		int kor;			// 객체 data 선언
		int eng;
		int math;
		
	// 생성자 : 객체 생성시 속성 값을 초기화
		Student(String name, int kor, int eng, int math){		//class와 이름이 같아야하기에 ! /  name는 매개변수
			this.name = name;									//this는 객체자신을 의미 / name구별을 위해(이름이 같음)
			this.kor = kor;										// name -> this.name -> String name으로 !
			this.eng = eng;										// 
			this.math = math;
		}
	
	// 메소드 : 객체의 기능(실행)을 담당 / 반드시 return이 있다
		// 총점을 구하는 method
		int tot() {			// 매개변수가 없기에 this 안넣어도 됨
			int sum = this.kor + this.eng + this.math;
			return sum;
		}
	// 평균
		double avg() {
			return this.tot() / 3.0;		//double이기에 3이 아니라 3.0
		}
	//등급
		char grade() {
			char gradeChar;
			switch((int)(this.avg() / 10 )) {
				case 10 :
				case 9: gradeChar = 'A'; break;
				case 8: gradeChar = 'B'; break;
				case 7: gradeChar = 'C'; break;
				case 6: gradeChar = 'D'; break;
				default : gradeChar = 'F';
		}
		return gradeChar;

	}
}// end class
