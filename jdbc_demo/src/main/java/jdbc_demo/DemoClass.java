package jdbc_demo;

import java.sql.*;

public class DemoClass {
	public static void main(String args[]) throws Exception {
		
		String url = "jdbc:postgresql://localhost:5432/demo";
		String uname = "sabr";
		String pwd = "mypwd";
		String query = "CREATE TABLE user_authentication ( user_id serial PRIMARY KEY, username VARCHAR(50) UNIQUE NOT NULL, password VARCHAR(10) NOT NULL );";
		
		Class.forName("org.postgresql.Driver");
		Connection c = DriverManager.getConnection(url,uname,pwd);
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		System.out.println("query executed");
	}
}
