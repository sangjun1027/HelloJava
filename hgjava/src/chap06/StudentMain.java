package chap06;

public class StudentMain {

	public static void main(String[] args) {
		// 객체 생성 / Student라는 class type사용!!! 
		// 배열에 저장
		Student[] students= {
				new Student("우상준", 100, 100, 100),
				new Student("손흥민", 90, 80, 80),
				new Student("호날두", 99, 89, 92),
				new Student("메시", 99, 99, 99),
				new Student("베컴", 79, 88, 91),
				new Student("음바페", 97, 88, 91),
				new Student("베컴", 79, 88, 91),
				new Student("베컴", 79, 88, 91),
				new Student("베컴", 79, 88, 91)
				
		};
		// 객체 사용
		for (int i = 0; i < students.length; i ++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\n",
					students[i].name,
					students[i].kor,
					students[i].eng,
					students[i].math,
					students[i].tot(),
					students[i].avg(),
					students[i].grade());
					
		};
		
		//Student st1 = new Student("우상준", 100, 100, 100); 	//new는 객체만드는 keyword
		//Student st2 = new Student("손흥민", 90, 80, 80); 	//new는 객체만드는 keyword
		//Student st3 = new Student("호날두", 99, 89, 92); 	//new는 객체만드는 keyword
		//Student st4 = new Student("메시", 99, 99, 99); 	//new는 객체만드는 keyword
		//Student st5 = new Student("베컴", 79, 88, 91); 	//new는 객체만드는 keyword
		
		// 객체 사용 / 객체 안에 있는 것을 다 끄집어 내 쓰겠다
		//System.out.printtf("%s\t%d\t%d\t%d\t%d\t%%.1f\t%s\n",
		//		st1.name, st1.kor, st1.eng, st1.math, st1.tot(), st1.avg(),st1.grade());
		//System.out.printtf("%s\t%d\t%d\t%d\t%d\t%%.1f\t%s\n",
		//		st2.name, st2.kor, st2.eng, st2.math, st2.tot(), st2.avg(),st2.grade());
		//System.out.printtf("%s\t%d\t%d\t%d\t%d\t%%.1f\t%s\n",
		//		st3.name, st3.kor, st3.eng, st3.math, st3.tot(), st3.avg(),st3.grade());
		//System.out.printtf("%s\t%d\t%d\t%d\t%d\t%%.1f\t%s\n",
		//		st1.name, st1.kor, st1.eng, st1.math, st1.tot(), st1.avg(),st1.grade());
		//System.out.printtf("%s\t%d\t%d\t%d\t%d\t%%.1f\t%s\n",
		//		st1.name, st1.kor, st1.eng, st1.math, st1.tot(), st1.avg(),st1.grade());
		
		//System.out.println(st1.kor);
		//System.out.println(st1.eng);
		//System.out.println(st1.math);
		//System.out.println(st1.tot());
		//System.out.println(st1.avg());
		//System.out.println(st1.grade());
	}
}
