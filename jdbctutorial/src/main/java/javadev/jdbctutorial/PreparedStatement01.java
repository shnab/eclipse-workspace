package javadev.jdbctutorial;

import java.sql.*;

public class PreparedStatement01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "oracle");
		
		Statement st = con.createStatement();
		
		//Create a table whose name is students which has std_id, std_name, std_grade columns
//			String sql1 = "CREATE TABLE students(std_id CHAR(3), std_name VARCHAR2(50), std_grade NUMBER(2))";
//			st.execute(sql1);
		
		//Insert 4 records into students table
//					String sql2 = "INSERT ALL INTO students VALUES('101','Ali Can', 9)"
//							               + "INTO students VALUES('102', 'Veli Han', 11)"
//							               + "INTO students VALUES('103', 'Mary Star', 10)"
//							               + "INTO students VALUES('104', 'Angie Ocean', 12)"
//							               + "SELECT * FROM DUAL";
//					int result1 = st.executeUpdate(sql2);
//					System.out.println(result1 + " row(s) affected");
		
		//Get all records from students table on the console
		String sql3 = "SELECT * FROM students";
		ResultSet rs1 = st.executeQuery(sql3);
			//		while(rs1.next()) {
			//			System.out.println(rs1.getString(1) + " - " + rs1.getString(2) + " - " + rs1.getInt(3));
			//		}
		
		System.out.println("====================");
		
		//Instead of column numbers you can use column names as well
		while(rs1.next()) {
			System.out.println(rs1.getString("std_id") + " - " + rs1.getString("std_name") + " - " + rs1.getInt("std_grade"));
		}

		//Sometimes, te type an SQL Statement and we are sure, we will use the statement many times, we
		//"PreparedStatement" instead of 'Statement' or we use both together
		// buarada in plaats van values zet ? soru isareti
//		String sql4 = "INSERT INTO students VALUES (?, ?, ?)";
//		PreparedStatement pst = con.prepareStatement(sql4);
//		
//		pst.setString(1, "105");
//		pst.setString(2, "Tom HANKS");
//		pst.setInt(3, 12);
//		
//		int result2 = pst.executeUpdate();
//		System.out.println(result2);
		
		String sql5 = "SELECT * FROM students";
		ResultSet rs2 = st.executeQuery(sql5);
	
		while(rs2.next()) {
			System.out.println(rs2.getString("std_id") + " - " + rs2.getString("std_name") + " - " + rs2.getInt("std_grade"));
		}
		
		//create a prepare statement to delete a record from students by using id
		
//		String sql6 = "DELETE FROM students WHERE std_id = ?";
//		PreparedStatement pst2 = con.prepareStatement(sql6);
//		
//		pst2.setString(1, "104");
//		int result3 = pst2.executeUpdate();
		
//		pst2.setString(1, "105");
//		int result3 = pst2.executeUpdate();
//		System.out.println(result3);
		
		System.out.println("====================");
		
		String sql7 = "SELECT * FROM students";
		ResultSet rs3 = st.executeQuery(sql7);
	
		while(rs3.next()) {
			System.out.println(rs3.getString("std_id") + " - " + rs3.getString("std_name") + " - " + rs3.getInt("std_grade"));
		}
		
		con.close();
		st.close();
		rs1.close();
		rs2.close();
		rs3.close();
//		pst.close();
//		pst2.close();
		
	}

}
