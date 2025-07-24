package Board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDAO {				
	public boolean zlog(String id, String pwd) {		//로그인 관련 method : zlog
		
		Connection conn = BoardUtil.getConnect();		// DB에 연결하는 변수 conn
		String query = "select     id,"
				+ "                pwd, "
				+ "                name, "
				+ "                phone"
				+ "     from       zuser"
				+ "     where id = ?"
				+ "       and pwd = ?";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(query);		//변수conn을 써서 ?를 건드리겠다
			stmt.setString(1, id );		
			stmt.setString(2, pwd);
		
			ResultSet r = stmt.executeQuery();
			if ( r.next() ) {		
				return true;
			}
		
		}	catch (SQLException e) {
			e.printStackTrace();
		}
			return false;
	}//end method zlog

	public  boolean overlap(String id) {				//중복체크 관련 method : overlap 
		
		Connection conn = BoardUtil.getConnect();
		String query = "select     id"
				      + "       from      zuser"
				      + "       where id   = ?";		// where는 조건문
		
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, id);
			
			ResultSet r = stmt.executeQuery();
			if ( r.next()) {
				return true;
			}
		
		}
			catch (SQLException e) {
			e.printStackTrace();
			}
			return false;
	}//end of method overlap
	
	public boolean insert(String id, String pwd, String name, int phone) { // 회원등록 method : newjoin 
		
		Connection conn = BoardUtil.getConnect();
		String query = "insert into zuser (id,"
				                      + " pwd,"
				                      + " name,"
				                      + " phone)"
				               + " values( ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, id);
			stmt.setString(2, pwd);
			stmt.setString(3, name);
			stmt.setInt(4, phone);
			
			ResultSet r = stmt.executeQuery();
			if ( r.next()) {
				return true;
			}
		
		}
			catch (SQLException e) {
			e.printStackTrace();
			}
			return false;
	}
	
}//end class
