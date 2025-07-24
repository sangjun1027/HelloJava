package Board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class BatDAO {
	public Bat bats (String name) {
		Bat bat = new Bat();
		Connection conn = BoardUtil.getConnect();
		String query = "select batname,"
						   + " age,"
			               + " hr,"
			               + " avg,"
			               + " rb,"
			               + " ops,"
			               + " wrc,"
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
	
public  boolean 			// 선수정보등록 metrhod
yagu(String name, int age, int hr, double avg, int rb, double ops, double wrc, double war) {  
		
		Connection conn = BoardUtil.getConnect();
		String query = "insert into samsungbat (batname,"
				                      + " age,"
				                      + " hr,"
				                      + " avg,"
				                      + " rb,"
				                      + " ops,"
				                      + " wrc,"
				                      + " war)"
				               + " values( ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, name);
			stmt.setInt(2, age);
			stmt.setInt(3, hr);
			stmt.setDouble(4, avg);
			stmt.setInt(5, rb);
			stmt.setDouble(6, ops);
			stmt.setDouble(7, wrc);
			stmt.setDouble(8, war);
			
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
	public ArrayList<Bat> hrfindAll() {
		Connection conn = BoardUtil.getConnect();
		ArrayList<Bat> hrlist = new ArrayList<Bat>();
		String query = "select batname, age, hr, avg,"
				+ "                 rb, ops, wrc, war"
				+ "     from               samsungbat"
		        + "   order by             hr desc";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);		// query를 rs에 넣음
			
			while(rs.next()) {
			//한줄 찍히고, 그 것을 확인
			Bat bat = new Bat();
			bat.setName(rs.getString("batname"));
			bat.setAge(rs.getInt("age"));
			bat.setHr(rs.getInt("hr"));
			bat.setAvg(rs.getDouble("avg"));
			bat.setRb(rs.getInt("rb"));
			bat.setOps(rs.getDouble("ops"));
			bat.setWrc(rs.getDouble("wrc"));
			bat.setWar(rs.getDouble("war"));
			
			hrlist.add(bat);		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return hrlist;
	}
	
	public ArrayList<Bat> afindAll() {
		Connection conn = BoardUtil.getConnect();
		ArrayList<Bat> alist = new ArrayList<Bat>();
		String query = "select batname, age, hr, avg,"
				+ "                 rb, ops, wrc, war"
				+ "     from               samsungbat"
		        + "   order by             avg desc";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);		// query를 rs에 넣음
			
			while(rs.next()) {
			//한줄 찍히고, 그 것을 확인
			Bat bat = new Bat();
			bat.setName(rs.getString("batname"));
			bat.setAge(rs.getInt("age"));
			bat.setHr(rs.getInt("hr"));
			bat.setAvg(rs.getDouble("avg"));
			bat.setRb(rs.getInt("rb"));
			bat.setOps(rs.getDouble("ops"));
			bat.setWrc(rs.getDouble("wrc"));
			bat.setWar(rs.getDouble("war"));
			
			alist.add(bat);		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alist;
	}
			
	public ArrayList<Bat> rbfindAll() {
		Connection conn = BoardUtil.getConnect();
		ArrayList<Bat> rblist = new ArrayList<Bat>();
		String query = "select batname, age, hr, avg,"
				+ "                 rb, ops, wrc, war"
				+ "     from               samsungbat"
		        + "   order by             rb desc";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);		// query를 rs에 넣음
			
			while(rs.next()) {
			//한줄 찍히고, 그 것을 확인
			Bat bat = new Bat();
			bat.setName(rs.getString("batname"));
			bat.setAge(rs.getInt("age"));
			bat.setHr(rs.getInt("hr"));
			bat.setAvg(rs.getDouble("avg"));
			bat.setRb(rs.getInt("rb"));
			bat.setOps(rs.getDouble("ops"));
			bat.setWrc(rs.getDouble("wrc"));
			bat.setWar(rs.getDouble("war"));
			
			rblist.add(bat);		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rblist;
	}

	public ArrayList<Bat> opsfindAll() {
		Connection conn = BoardUtil.getConnect();
		ArrayList<Bat> opslist = new ArrayList<Bat>();
		String query = "select batname, age, hr, avg,"
				+ "                 rb, ops, wrc, war"
				+ "     from               samsungbat"
		        + "   order by             ops desc";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);		// query를 rs에 넣음
			
			while(rs.next()) {
			//한줄 찍히고, 그 것을 확인
			Bat bat = new Bat();
			bat.setName(rs.getString("batname"));
			bat.setAge(rs.getInt("age"));
			bat.setHr(rs.getInt("hr"));
			bat.setAvg(rs.getDouble("avg"));
			bat.setRb(rs.getInt("rb"));
			bat.setOps(rs.getDouble("ops"));
			bat.setWrc(rs.getDouble("wrc"));
			bat.setWar(rs.getDouble("war"));
			
			opslist.add(bat);		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return opslist;
	}

	public ArrayList<Bat> wrcfindAll() {
		Connection conn = BoardUtil.getConnect();
		ArrayList<Bat> wrclist = new ArrayList<Bat>();
		String query = "select batname, age, hr, avg,"
				+ "                 rb, ops, wrc, war"
				+ "     from               samsungbat"
		        + "   order by             wrc desc";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);		// query를 rs에 넣음
			
			while(rs.next()) {
			//한줄 찍히고, 그 것을 확인
			Bat bat = new Bat();
			bat.setName(rs.getString("batname"));
			bat.setAge(rs.getInt("age"));
			bat.setHr(rs.getInt("hr"));
			bat.setAvg(rs.getDouble("avg"));
			bat.setRb(rs.getInt("rb"));
			bat.setOps(rs.getDouble("ops"));
			bat.setWrc(rs.getDouble("wrc"));
			bat.setWar(rs.getDouble("war"));
			
			wrclist.add(bat);		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return wrclist;
	}
	
	public ArrayList<Bat> warfindAll() {
		Connection conn = BoardUtil.getConnect();
		ArrayList<Bat> warlist = new ArrayList<Bat>();
		String query = "select batname, age, hr, avg,"
				+ "                 rb, ops, wrc, war"
				+ "     from               samsungbat"
		        + "   order by             war desc";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);		// query를 rs에 넣음
			
			while(rs.next()) {
			//한줄 찍히고, 그 것을 확인
			Bat bat = new Bat();
			bat.setName(rs.getString("batname"));
			bat.setAge(rs.getInt("age"));
			bat.setHr(rs.getInt("hr"));
			bat.setAvg(rs.getDouble("avg"));
			bat.setRb(rs.getInt("rb"));
			bat.setOps(rs.getDouble("ops"));
			bat.setWrc(rs.getDouble("wrc"));
			bat.setWar(rs.getDouble("war"));
			
			warlist.add(bat);		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return warlist;
	}
	
	public  boolean soverlap(String name) {				//중복체크 관련 method : overlap 
		
		Connection conn = BoardUtil.getConnect();
		String query = "select     batname"
				      + " from    samsungbat"
				      + " where batname      = ?";		// where는 조건문
		
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, name);
			
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
	
	}

