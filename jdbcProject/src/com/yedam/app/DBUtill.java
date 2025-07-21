package com.yedam.app;

import java.sql.Connection; //sql패키지에 있는 connection이라는 class
import java.sql.DriverManager;

//ojdbc11.jar 외부 라이브러리를 추가!
public class DBUtill {
	// DB접속정보를 활용해서 세션(Connection객체)
	public static Connection getConnect() { // method 이름 : getConnect , static : connect는 인스턴스를 선언해야되는데 static가 편함
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
