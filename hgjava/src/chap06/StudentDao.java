package chap06;

public class StudentDao {
	// 학생 데이터 생성
	// 필드
	// 생성자 : 기본생성자 => 컴파일 시 자동생성
	// 메소드
	Student[] stData(){
		Student[] students = {
				new Student("우상준", 100, 100, 100),
				new Student("손흥민", 90, 80, 80),
				new Student("호날두", 99, 89, 92),
				new Student("메시", 99, 99, 99),
				new Student("베컴", 79, 88, 91),
				new Student("음바페", 97, 90, 93),
				new Student("아자르", 77, 69, 59),
				new Student("지단", 92, 90, 91),
				new Student("베컴", 79, 88, 91)
	};
	return students;
 }
}
