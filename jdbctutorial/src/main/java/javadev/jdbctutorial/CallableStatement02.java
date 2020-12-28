package javadev.jdbctutorial;

import java.sql.*;
public class CallableStatement02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "oracle");
		
		Statement st = con.createStatement();
		
		//Create a "procedure" to find the minimum one of 2 numbers
		String sql1 = "CREATE OR REPLACE PROCEDURE findMin(x IN OUT NUMBER, y IN OUT NUMBER, z OUT NUMBER) IS\r\n"
				+ "BEGIN\r\n"
				+ "    IF x<y THEN\r\n"
				+ "       z :=x;\r\n"
				+ "    ELSE \r\n"
				+ "       z :=y; \r\n"
				+ "    END IF;\r\n"
				+ "END;";
		
		st.execute(sql1);
		System.out.println("procedure is created ");
		
		CallableStatement cst1 = con.prepareCall("{call findMin(?, ?, ? )}");
		
		cst1.setInt(1, 13);
		cst1.setInt(2, 25);
		cst1.registerOutParameter(3, Types.INTEGER);
		
		cst1.execute();
		
		System.out.println("The minimum of " + cst1.getInt(3));
		
		//
		String sql2 = "CREATE OR REPLACE PROCEDURE getNameGrade(id IN CHAR, name OUT VARCHAR, grade OUT NUMBER) IS\r\n"
				+ "BEGIN\r\n"
				+ "    SELECT std_name, std_grade\r\n"
				+ "    INTO name, grade\r\n"
				+ "    FROM students\r\n"
				+ "    WHERE std_id = id;\r\n"
				+ "END;";
		
		st.execute(sql2);
		System.out.println("procedure is created");

		CallableStatement cst2 = con.prepareCall("{call getNameGrade (?, ?, ?)}");
		
		cst2.setString(1, "101");
		cst2.registerOutParameter(2, Types.VARCHAR);
		cst2.registerOutParameter(3, Types.INTEGER);
		cst2.execute();
		System.out.println(cst2.getString(2) + "-" + cst2.getString(3));
		
		con.close();
		st.close();
		cst1.close();
		cst2.close();
	}

}
