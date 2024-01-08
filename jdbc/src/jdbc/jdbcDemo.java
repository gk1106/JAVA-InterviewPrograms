package jdbc;

import java.sql.*;

public class jdbcDemo {
public static void main(String[] args) throws Exception {
	
	String url="jdbc:mysql://127.0.0.1:3306/jdbcdemo";
	String userName="root";
	String password ="1234";
	String query="select * from employee";
	
	
	Connection con=DriverManager.getConnection(url,userName,password);
	Statement st=con.createStatement();
	ResultSet rs= st.executeQuery(query);
	
	while(rs.next()) {

		System.out.println("id is"+rs.getInt(1));
		System.out.println("name is ="+rs.getString(2));
		System.err.println("sal "+rs.getInt(3));
		
		
	}
	
	
	con.close();
}
	
	
}
