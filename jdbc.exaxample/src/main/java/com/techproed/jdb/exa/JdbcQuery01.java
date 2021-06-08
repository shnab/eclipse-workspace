package com.techproed.jdb.exa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcQuery01 {
    public static void main( String[] args ) throws ClassNotFoundException, SQLException{

    	//1) ilgili Driver yuklemeliyiz
    	Class.forName("oracle.jdbc.driver.OracleDriver");
    	
    	//2. Baglanti olusturmaliyiz
    	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "hr");
    	
    	//3. SQL komutlari icin bir Statement nesnesi olustur
    	Statement st = con.createStatement();
    	
    	//4. SQL ifadeleri yazabiliriz
    	//pesonel tablasondaki personel_id 7369 olan personelin adini 
    	ResultSet rs = st.executeQuery("SELECT personel_isim, maas "
    								+ "FROM personel "
    								+ "WHERE personel_id=7369");
    	// 5. Sonuclari aldik ve isledik donguye sokup sonucu burdan alacaz
    	while(rs.next()) {
    		System.out.println("Personel isim : " + rs.getString("personel_isim")); //AHMET
    		System.out.println("Personel isim : " + rs.getString(1) + "\n"+ "Maas : " + rs.getInt(2));
    	}
    	
    	//6. Olusturlan nesneleri bellekten kaldiralim
		con.close();
		st.close();
		rs.close();
    	
    	

    	//Create a table whose name is students which has std_id, std_name, std_grade columns
//		String sql1 = "CREATE TABLE students(std_id CHAR(3), std_name VARCHAR2(50), std_grade NUMBER(2))";
//		st.execute(sql1);
	
	//Insert 4 records into students table
//				String sql2 = "INSERT ALL INTO students VALUES('101','Ali Can', 9)"
//						               + "INTO students VALUES('102', 'Veli Han', 11)"
//						               + "INTO students VALUES('103', 'Mary Star', 10)"
//						               + "INTO students VALUES('104', 'Angie Ocean', 12)"
//						               + "SELECT * FROM DUAL";
//				int result1 = st.executeUpdate(sql2);
//				System.out.println(result1 + " row(s) affected");
    	
				//Get all records from students table on the console
//				String sql3 = "SELECT * FROM students";
//				ResultSet rs1 = st.executeQuery(sql3);
//					//		while(rs1.next()) {
//					//			System.out.println(rs1.getString(1) + " - " + rs1.getString(2) + " - " + rs1.getInt(3));
//					//		}
//				System.out.println("====================");
//				
//				//Instead of column numbers you can use column names as well
//				while(rs1.next()) {
//					System.out.println(rs1.getString("std_id") + " - " + rs1.getString("std_name") + " - " + rs1.getInt("std_grade"));
//				}
				
				
				
    	
    	
		    	/* how can you create a connection with a database by using jdbc?
		        STRUCTURE OF JDBC
		        
		1)import java.sql.*; (under package,import)
		       
		2)Class.forName("oracle.jdbc.driver.OracleDriver");(choose throw declaration)
		----class ismini ekle demek...
		
		3)for Mac: Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCLCDB.localdomain","oracleusername","oraclepassword");
		for Windows:Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","oracleusername","oraclepassword");
		(choose throw declaration)
		(in jdbc, we only have one exception which is SQLException)
		
		4)  Statement st = con.createStatement();
		
		5)  ResultSet rs=st.executeQuery("SELECT * FROM tableName");
		
		
		
		6)  //table da 1.olusturulan sutun string se rs.getString(1), numbersa rs.getInt(1) 1--->sutunnosu
		 //date ise rs.getDate(sutunno)
		//ornek: 2.sutun numbersa rs.getInt(2);
		//yada soyle yapabilirsin 
		 //ornek: Select isim, id, maas;
		                 rs.getString("isim"), rs.getString("id"),rs.getDouble("maas")
		//resultlarim birden cok loop la almam gerekli.
		 //bir deger olsa bile kursor donmesi icin next() olmasi lazim yani loop
		
		while(rs.next()) {
		System.out.println(rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getInt(3));
		}
		
		7)  don't forget to close connections:)
		
		con.close();
		st.close();
		rs.close();
		//herzaman ilk 4 asama ayni....
		*/

    	
    }
}

