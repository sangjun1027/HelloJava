package Board;

import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		BatDAO bdao = new BatDAO();
		
		
		// 첫 로그인화면 
		while (run) {
			System.out.println("=========================================");
			System.out.println("        ZZUN 삼성Lions Data Center        ");
			System.out.println("=========================================");
			System.out.print(" 1.  ID  >> ");
			String id = scan.nextLine();
			System.out.print(" 2.  비밀번호  >> ");
			String pwd = scan.nextLine();
			
			if(dao.zlog(id, pwd)) {						//아이디, 비번 일치 시 아래출력
				System.out.println("로그인을 환영합니다");
				System.out.println();	
				break;
			} else {
				System.out.println("아이디 또는 비밀번호가 일치하지않습니다.");		//false 시 회원가입 의사 질문
				System.out.println();
				System.out.println("회원가입을 원하시면 'Y'를 입력하세요. >> ");
				System.out.print("되돌아가시려면 아무키를 입력하세요. >> ");
				String join = scan.nextLine();
				if(join.equals("y")) {
					boolean i = true;
					while( i ) {				// 아이디 중복 시 이쪽으로 오게하기 위한 while문
					
					System.out.println("=========================================");
					System.out.println("               회원가입                    ");
					System.out.println("=========================================");
					
								//회원가입
					System.out.println();
					
					System.out.print(" 1. 이름 >> ");
					String name = scan.nextLine();
					System.out.print(" 2. ID >> ");
					String firstId = scan.nextLine();
					
					if(dao.overlap(firstId)) {						//아이디, 비번 일치 시 아래출력
						System.out.println("이미 존재하는 ID입니다");
						System.out.println();
					} else {
						boolean h = true;
						String pass = "";
						while( h ) {
							System.out.print(" 3. 비밀번호 >> ");
							pass = scan.nextLine();
							System.out.print(" 4. 비밀번호확인 >> ");
							String passH= scan.nextLine();
							if(passH.equals(pass) == false) {			//equals뒤 괄호 값을 true/false비교
								System.out.println("비밀번호가 일치하지 않습니다.");
							} else {
							h = false;
						}
						}// end of while(h)
						System.out.print(" 5. 전화번호 >> ");
						int phone = scan.nextInt();scan.nextLine();
						System.out.println();
						if (dao.newjoin(firstId, pass, name, phone)){		
							System.out.println("회원가입을 축하드립니다.");
						} else {
							System.out.println("등록 중 오류");
						}
						i = false;		
					}//end of if overlap else
					}//end of while(i) 
				}// end of if zlog
			 }// end of if zlog else
			
		}//end of while(run)
		
		System.out.println("=======================================");
		System.out.println("                                       ");
		System.out.println("  ★☆★☆★ Welcom to ZZUN Center ★☆★☆★  ");
		System.out.println("                                       ");
		System.out.println("=======================================");
		
		//while
		System.out.print("선수이름을 입력하세요. >> ");
		String sname = scan.nextLine();
		Bat bat = bdao.bats(sname);
		
		System.out.println(" " + bat.getName()+ "  | 홈런" + bat.getHr() + "개"
				               + "  | 타율 " + bat.getAvg() 
				               + "  | 타점 " + bat.getRb() + "점" 
				               + "  | 출루율+장타율 " + bat.getOps()
				               + "  | wrc+ " + bat.getWrc());
		System.out.println();
		System.out.println("1. 홈런순위 ");
		System.out.println("2. 타율순위 ");
		System.out.println("3. 타점순위 ");
		System.out.println("4. 출루율 + 장타율 순위 ");
		System.out.println("5. wrc+ 순위 ");
		System.out.println("6. 선수이름입력 ");
		System.out.println();
		System.out.print("원하는 정보를 입력해주세요 >> ");
		int info = Integer.parseInt(scan.nextLine());
		
		switch(info) {
		
		case 1 :
			
			System.out.print("선수이름을 입력하세요 >> ");
			String name = scan.nextLine();			//1003엔터, 변환값이 int
			System.out.print("선수나이를 입력하세요 >> ");
			int age = Integer.parseInt(scan.nextLine());		//변환값이 String
			System.out.print("현재 홈런갯수를 입력하세요 >> ");
			int hr = Integer.parseInt(scan.nextLine());
			System.out.print("현재 타율을 입력하세요. >> ");
			double avg = Double.parseDouble(scan.nextLine());
			System.out.print("현재 타점을 입력하세요. >> ");
			int rb = Integer.parseInt(scan.nextLine()); 
			System.out.print("현재 OPS를 입력하세요. >> ");
			double ops = Double.parseDouble(scan.nextLine());
			System.out.println("현재 wrc+를 입력하세요. >> ");
			double wrc = Double.parseDouble(scan.nextLine());
			System.out.println("현재 WAR을 입력하세요. >> ");
			double war = Double.parseDouble(scan.nextLine());
			
			Bat sbat = new Bat (name, age, hr, avg, rb, ops, wrc, war);
			if (bdao.insert(bat)){		
				System.out.println("정상 등록");
			} else {
				System.out.println("등록 중 오류");
			}
			break;
		}
		
	}//end of method
}// end of class