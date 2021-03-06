package javadev.jdbctutorial;

import java.sql.*;

public class PreparedStatement02 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "oracle");
		
		Statement st = con.createStatement();
		
		//PreparedStatement is used for DML to use multiple times
		//Use PreparedStatement to update grades by using student ids
		String sql1 = "UPDATE students SET std_grade= ? WHERE std_id= ? ";
		PreparedStatement pst1 = con.prepareStatement(sql1);
		
		pst1.setInt(1, 12);
		pst1.setString(2, "102");
		
		//UPDATE DML oldugu icin executeUpdate(); 
		System.out.println(pst1.executeUpdate());

		String sql2 = "SELECT * FROM students";
		ResultSet rs1 = st.executeQuery(sql2);
		
		while(rs1.next()) {
			System.out.println(rs1.getString("std_id") + " - " + rs1.getString("std_name") + " - " + rs1.getInt("std_grade"));
		}
		
		con.close();
		st.close();
		rs1.close();

	}

}
