package Board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BatDAO {
	public Bat bats (String name) {
		Bat bat = new Bat();
		Connection conn = BoardUtil.getConnect();
		String query = "select batname,"
						   + " age"
			               + " hr,"
			               + " avg,"
			               + " rb,"
			               + " ops,"
			               + " wrc"
			               + " war"
			    +" from   samsungbat"
			    + " where batname = ?";
	try {
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1, name);

		ResultSet r = stmt.executeQuery();
		
		while (r.next() ) {
		bat.setName(r.getString("batname"));
		bat.setAge(r.getInt("age"));
		bat.setHr(r.getInt("hr"));
		bat.setAvg(r.getDouble("avg"));
		bat.setRb(r.getInt("rb"));
		bat.setOps(r.getDouble("ops"));
		bat.setWrc(r.getDouble("wrc"));
		bat.setWar(r.getDouble("war"));
		}	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return bat;
	}
	
		
	}

