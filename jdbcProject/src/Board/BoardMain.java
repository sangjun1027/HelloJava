package Board;

import java.util.ArrayList;
import java.util.Scanner;

import com.yedam.app.Book;

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
						if (dao.insert(firstId, pass, name, phone)){		
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
		boolean t = true;
		
		while ( t ) {
		
		boolean z = true;
		String sname = "";
		while( z ) {
		System.out.println("=======================================");
		System.out.println("                                       ");
		System.out.println("  ★☆★☆★ Welcom to ZZUN Center ★☆★☆★  ");
		System.out.println("                                       ");
		System.out.println("=======================================");
			
		System.out.print("선수이름을 입력하세요. >> ");
		sname = scan.nextLine();
		if( bdao.soverlap(sname)) {
			z = false;
		} else {
			System.out.println("등록 된 선수가 없습니다.");
		}
		}
		
		Bat bat = bdao.bats(sname);
		
		System.out.println(" " + bat.getName()
							   + "  | 나이 " + bat.getAge() + "세"
							   + "  | 홈런 " + bat.getHr() + "개"
				               + "  | 타율 " + bat.getAvg() 
				               + "  | 타점 " + bat.getRb() + "점" 
				               + "  | 출루율+장타율 " + bat.getOps()
				               + "  | wrc+ " + bat.getWrc()
				               + "  | war  " + bat.getWar());
	    //} else {
		//	System.out.println("등록된 선수가 없습니다.");
		//}
		System.out.println();
		System.out.println("1. 홈런순위 ");
		System.out.println("2. 타율순위 ");
		System.out.println("3. 타점순위 ");
		System.out.println("4. 출루율 + 장타율 순위 ");
		System.out.println("5. wrc+ 순위 ");
		System.out.println("6. WAR 순위 ");
		System.out.println("9. 선수정보등록 ");
		System.out.println();
		System.out.print("원하는 정보를 입력해주세요 >> ");
		int info = Integer.parseInt(scan.nextLine());
		
		switch(info) {
		
		case 1 :		// 홈런순위
			ArrayList<Bat> hrlist = bdao.hrfindAll();	
			System.out.println("  이름     홈런     순위 ");
			System.out.println("======================");
			for(int i = 0; i < hrlist.size(); i ++) {
				System.out.println(hrlist.get(i).getName()   
						   + "   " + hrlist.get(i).getHr() + "   " + ( i+1 ))  ; 
			} // end of for
			break;	

		case 2 :	// 타율순위
			ArrayList<Bat> alist = bdao.afindAll();	
			System.out.println("  이름     타율     순위 ");
			System.out.println("======================");
			for(int i = 0;  i < alist.size(); i ++) {
				System.out.println(alist.get(i).getName()   
						   + "      " + alist.get(i).getAvg() + "       " + ( i + 1 ))  ; 
			} // end of for
			break;	
		
		case 3 :		// 타점
			ArrayList<Bat> rblist = bdao.rbfindAll();	
			System.out.println("  이름     타점     순위 ");
			System.out.println("======================");
			for(int i = 0; i < rblist.size(); i ++) {
				System.out.println(rblist.get(i).getName()   
						   + "     " + rblist.get(i).getRb() + "        " + ( i+1 ))  ; 
			} // end of for
			break;	
			
		case 4 :		// OPS
			ArrayList<Bat> opslist = bdao.opsfindAll();	
			System.out.println("  이름    .OPS     순위 ");
			System.out.println("======================");
			for(int i = 0; i < opslist.size(); i ++) {
				System.out.println(opslist.get(i).getName()   
						   + "     " + opslist.get(i).getOps() + "        " + ( i+1 ))  ; 
			} // end of for
			break;	
			
		case 5 :		// WRC
			ArrayList<Bat> wrclist = bdao.wrcfindAll();	
			System.out.println("  이름    .wRC+    순위 ");
			System.out.println("======================");
			for(int i = 0; i < wrclist.size(); i ++) {
				System.out.println(wrclist.get(i).getName()   
						   + "     " + wrclist.get(i).getWrc() + "        " + ( i+1 ))  ; 
			} // end of for
			break;
			
		case 6 :		// War
			ArrayList<Bat> warlist = bdao.warfindAll();	
			System.out.println("  이름     WAR     순위 ");
			System.out.println("======================");
			for(int i = 0; i < warlist.size(); i ++) {
				System.out.println(warlist.get(i).getName()   
						   + "     " + warlist.get(i).getWar() + "        " + ( i+1 ))  ; 
			} // end of for
			break;
		
		
		case 9 :		//선수등록
			
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
			System.out.print("현재 wrc+를 입력하세요. >> ");
			double wrc = Double.parseDouble(scan.nextLine());
			System.out.print("현재 WAR을 입력하세요. >> ");
			double war = Double.parseDouble(scan.nextLine());		
			
			if (bdao.yagu(name, age, hr, avg, rb, ops, wrc, war)){		
				System.out.println("정상 등록");
			} else {
				System.out.println("등록 중 오류"); 
			break; 
			}
		}//end of switch
		}//end of while (t)
	}//end of method
}// end of class