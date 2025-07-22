package Board;

import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		
		
		while (run) {
			System.out.println("=========================================");
			System.out.println("        Welcome to ZZUN Board            ");
			System.out.println("=========================================");
			System.out.print(" 1.  ID  >> ");
			String id = scan.nextLine();
			System.out.print(" 2.  비밀번호  >> ");
			String pw = scan.nextLine();
			if(dao.zlog(id, pw)) {
				System.out.println("로그인을 환영합니다");
			} else {
				System.out.println("아이디 또는 비밀번호가 일치하지않습니다.");
			}
			
			
			
			
			 
			// switch(mainMenu) {

			 	
			 //case 1 :		// ID
				 
				 
			 }
			
			
		}
	}


