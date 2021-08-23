package com.techproed4.jdbctutorial;

//step1
import java.sql.*;
public class JdbcExecuteQueryNt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		//step 2
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//step 3
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","hr","oracle");
		//step 4
		Statement st=con.createStatement();
		//1st example
		//step 5
		ResultSet rs1=st.executeQuery("SELECT * FROM workers");
		
		while(rs1.next()) {
			System.out.println(rs1.getString(1)+" "+rs1.getString(2)+" "+rs1.getString(3));
			
			
		}
		
		
		// example2
		ResultSet rs2=st.executeQuery("select fullname from teacher where salary>200");
		
		while(rs2.next()) {
			System.out.println("names whose salary are greater than 200:"+rs2.getString(1));
			
			
		}
		
		
		
		
		// step 6 close everything
		con.close();
		st.close();
		rs1.close();
		rs2.close();
		
		
		
		
	}

}
