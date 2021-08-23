package com.techproed4.jdbctutorial;
//1.step
import java.sql.*;

public class JdbcExecuteQueryNt02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		//2.step
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//3.step
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","hr","oracle");
		//4.step
		Statement st=con.createStatement();
		
		//5.step
		//create a table whose name is students which has std_id,std_name,std_grade columns
		//note:for ddl statements(create,drop,truncate),we use execute() method
		
		//boolean result=st.execute("create table students(std_id char(3),std_name varchar2(50),std_grade number(2))");
		//when you print of result on the console it print false because when you use execute methd for ddl it doest nt return any record
		// it s mean no record
		//System.out.println(result);
		
		//insert two record by jdbc
		//note :for dml statement(insert into,update set,delete) we use execeteUpdate
		
		
		//int numOfRecord=st.executeUpdate("INSERT INTO students VALUES('101','ali can',11)");
		
		//System.out.println(numOfRecord);
		
		//int numOfRecord2=st.executeUpdate("INSERT INTO students VALUES('102','murat kaan',12)");
		//System.out.println(numOfRecord2);
		
		//how to add multible record into a table without repetition
		//insert 3 records by using jdbc
//		int numOfRecord3=st.executeUpdate("INSERT ALL INTO students VALUES(103,'KAAN CETIN',13) "
//				+ "INTO students VALUES(104,'SERPIL CETIN',14) "
//				+ "into students values(105,'serhan kaan',15)"
//				+ "select * from dual"); // don't forget dual part
//		
//		System.out.println(numOfRecord3);
		
		
		//print table on the console 
		//executeQuery return tabular data you need to store data in the ResultSet 
//		ResultSet rs1=st.executeQuery("select * from students");
//		
//		while(rs1.next()) {
//			System.out.println(rs1.getString(1)+" "+rs1.getString(2)+" "+rs1.getString(3));
//			
//		}
		
		
		// delete record from workers table whose id is greater than 10001
		//check record deleted or not by printing remaing data on the console
//		int delete=st.executeUpdate("delete from students where std_id>103");
//		System.out.println(delete+" rows deleted");
//		
//		
//		ResultSet rs2=st.executeQuery("select * from students");
//		
//		
//		while(rs2.next()) {
//			System.out.println(rs2.getString(1)+rs2.getString(2)+rs2.getString(3));
//			
//		}
		
		
		
		
		// drop students table use jdbc
		//put a message if table drop
//		boolean drop=st.execute("drop table students");
//		
//		System.out.println(drop); //return false because of no data but table deleted
		
		ResultSet rs2=null;
		
		try{

		 rs2=st.executeQuery("select * from students");
			
			
			while(rs2.next()) {
				System.out.println(rs2.getString(1)+rs2.getString(2)+rs2.getString(3));
				
			}
		}catch(SQLException e){
			System.out.println("no table drop "+e.getMessage());
			
		}finally {
			rs2.close();
		}
		
		
		
		con.close();
		st.close();
		//rs1.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
