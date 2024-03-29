package javadev.jdbctutorial;

import java.sql.*;

public class CallableStatement01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "oracle");
		
		Statement st = con.createStatement();
		
		//Create a function which adds 2 numbers and returns the result, name, the function as "addf"
		
		String sql1 = "CREATE OR REPLACE FUNCTION addf (num1 NUMBER, num2 NUMBER)\r\n"
				+ "RETURN NUMBER IS \r\n"
				+ "BEGIN \r\n"
				+ "    RETURN num1+num2;\r\n"
				+ "END;";
		
		st.execute(sql1);
		System.out.println("addf function is created");
		
		//CallableStatement kullanildiginda result==> ? = call addf(?,?) <== values 
		CallableStatement cst1 = con.prepareCall("{? = call addf(?,?)}");
		
		cst1.registerOutParameter(1, Types.INTEGER);
		cst1.setInt(2, 10);
		cst1.setInt(3, 20);
		
		cst1.execute();
		
		System.out.println("The sum is : " +cst1.getInt(1));
		
		//Create a funtion which returns the name of a student from students table 
		//when you enter student id
		String sql2 = "CREATE OR REPLACE FUNCTION getName(id CHAR)\r\n"
				+ "RETURN VARCHAR IS\r\n"
				+ "s_name students.std_name%TYPE;\r\n"
				+ "BEGIN\r\n"
				+ "    SELECT std_name \r\n"
				+ "    INTO s_name\r\n"
				+ "    FROM students\r\n"
				+ "    WHERE std_id= id;\r\n"
				+ "    RETURN s_name;\r\n"
				+ "END;";
		st.execute(sql2);
		
		CallableStatement cst2 = con.prepareCall("{? = call getName (?)}");
		cst2.registerOutParameter(1, Types.VARCHAR);
		cst2.setString(2, "101");
		
		cst2.execute();
		
		System.out.println(cst2.getString(1));
		
		con.close();
		st.close();
		cst1.close();
		cst2.close();
		
	}

}
