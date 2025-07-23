package Board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yedam.app.DBUtill;

public class BatDAO {
	public Bat bats (String name) {
		Bat bat = new Bat();
		Connection conn = BoardUtil.getConnect();
		String query = "select batname,"
			               + " hr,"
			               + " ang,"
			               + " rb,"
			               + " ops,"
			               + " wrc"
			    +" from   samsungbat"
			    + " where batname = ?";
	try {
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1, name);

		ResultSet r = stmt.executeQuery();
		
		r.next();
		bat.setName(r.getString("batname"));
		bat.setHr(r.getInt("hr"));
		bat.setAvg(r.getInt("avg"));
		bat.setRb(r.getInt("rb"));
		bat.setOps(r.getInt("ops"));
		bat.setWrc(r.getInt("wrc"));
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return bat;
	}
}
