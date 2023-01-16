package templateMethod.clinet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import templateMethod.framework.common.JDBCTemplate;

public class ClientJDBCTemplate extends JDBCTemplate{
	
	@Override
	public Connection getConnection() {
		
		String url = "jdbc:mysql://localhost:3306/bookmanager?useUnicode=true&characterEncoding=utf8";
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, "bm", "123qwe!@#QWE");
			// 개발자가 트랜잭션관리를 직접할 수 있도록 auto commit을 종료
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
