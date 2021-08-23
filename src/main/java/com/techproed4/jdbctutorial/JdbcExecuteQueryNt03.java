package com.techproed4.jdbctutorial;

import java.sql.*;


public class JdbcExecuteQueryNt03 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//3.step
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","hr","oracle");
		//4.step
		Statement st=con.createStatement();
		
		//print name and salary whose salary lowest by jdbc
		
		
//		String str="select name,salary from workers where salary=(select min(salary) from workers)";
//		ResultSet rs=st.executeQuery(str);
//		
//		
//		while(rs.next()){
//		System.out.println(rs.getString(1)+rs.getInt(2));
//		}
		
		//from workers table print name and salary whose salary second highest
//		String str2="select name,salary from workers where salary=(select max(salary) from workers where salary <(select max(salary) from workers))";
//		
//		ResultSet rs2=st.executeQuery(str2);
//		while(rs2.next()) {
//			
//			System.out.println(rs2.getString(1)+" "+rs2.getInt(2));
//			
//		}
		
		//2.way 
		// it is not working check it again
//		String str2="select name,salary from workers order by salary desc offset 1 row fetch next 1 row";
//		ResultSet rs2=st.executeQuery(str2);
//		while(rs2.next()) {
//			
//			System.out.println(rs2.getString(1)+" "+rs2.getInt(2));
//			
//		}
		
		//print all record  whose salary less than average salary
//		String str3="select * from workers where salary<(select avg(salary)from workers)";
//		ResultSet rs3=st.executeQuery(str3);
//		
//while(rs3.next()) {
//			
//			System.out.println(rs3.getInt(1)+" "+rs3.getString(2)+" "+rs3.getInt(3));
//			
//		}
		
		//print all column whose ID between 10004 10006
// name should be upper case

//       String str="SELECT id,UPPER(name),salary FROM workers WHERE id BETWEEN 10004 AND 10006";
//    
//       ResultSet rs3=st.executeQuery(str);
//		
//while(rs3.next()) {
//			
//			System.out.println(rs3.getInt(1)+" "+rs3.getString(2)+" "+rs3.getInt(3));
//			
//		}

//CREATE A FUNCTION WHICH USES 2 integer paremeters and return the sum of the integer

String str="create or replace function addf(a number,b number)\r\n"
		+ "return number is \r\n"
		+ "\r\n"
		+ "begin\r\n"
		+ "return a+b;\r\n"
		+ "end;";


 boolean result=st.execute(str);

 System.out.println(result);
 
 con.close();
 st.close();
 
 
 
 

	}

}
