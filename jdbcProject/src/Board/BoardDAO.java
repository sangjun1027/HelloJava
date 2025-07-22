package Board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class BoardDAO {
	public boolean zlog(String id, String pwd) {
		
		Connection conn = BoardUtil.getConnect();
		String query = "select     id,"
				+ "                pwd, "
				+ "                name, "
				+ "                phone"
				+ "     from       zuser"
				+ "     where id = ?"
				+ "       and pwd = ?";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(query);		// ?를 건드릴테다
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
	}//end zlog
}//end class
