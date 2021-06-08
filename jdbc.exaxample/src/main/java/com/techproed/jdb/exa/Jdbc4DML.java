package com.techproed.jdb.exa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc4DML {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	   	//1) ilgili Driver yuklemeliyiz
    	Class.forName("oracle.jdbc.driver.OracleDriver");
    	
    	//2. Baglanti olusturmaliyiz
    	String url = "jdbc:oracle:thin:@localhost:1521/xe";
    	String kullanici = "hr"; 
    	String sifre = "hr";
    	Connection con = DriverManager.getConnection(url, kullanici, sifre);
    	
    	//3. SQL komutlari icin bir Statement nesnesi olustur
    	Statement st = con.createStatement();
    	
    	/*=======================================================================
    			 ORNEK1: Bolumler tablosuna yeni bir kayit ((80, ‘ARGE’, ‘ISTANBUL’) 
    			 ekleyelim ve eklenen kaydi teyit icin sorgulayalim.
    	========================================================================*/
//    	String insertQuery1 = "INSERT INTO bolumler VALUES (80,'ARGE', 'ISTANBUL')";
//        st.execute(insertQuery1);
//        System.out.println("Bolumler Tablosuna  (80,'ARGE', 'ISTANBUL') satiri eklendi..");
//        
//        ResultSet rs = st.executeQuery("SELECT * FROM bolumler");
//        
//        while(rs.next()) {
//            System.out.println("Bölüm ID:" + rs.getString("bolum_id")+" "+"Bölüm Isim:" + rs.getString("bolum_isim")+"\t"+"Konum:" + rs.getString("konum"));
//        }
        /*=======================================================================
        ORNEK2: Bolumler tablosuna birden fazla yeni kayıt ekleyelim.
       ========================================================================*/ 
          
    	// 1.YONTEM
          // -----------------------------------------------
          // Ayri ayri sorgular ile veritabanina tekrar tekrar ulasmak islemlerin 
          // yavas yapilmasina yol acar. 10000 tane veri kaydi yapildigi dusunuldugunde
          // bu kotu bir yaklasimdir.
          
//          String [] sorgular = {"INSERT INTO bolumler VALUES(96, 'YEMEKHANE', 'ISTANBUL')",
//                               "INSERT INTO bolumler VALUES(86, 'OFIS','ANKARA')",
//                               "INSERT INTO bolumler VALUES(76, 'OFIS2', 'VAN')"};
//          int s2 =0;
//          for(String each: sorgular) {
//        	   s2= s2 + st.executeUpdate(each);
//          }
//          System.out.println(s2 + " ==> satir eklendi");
  
    	
    	
    	// 2.YONTEM (addBath ve excuteBatch() metotlari ile)
       	// ----------------------------------------------------
       	// addBatch metodu ile SQL ifadeleri gruplandirilabilir ve exucuteBatch()
       	// metodu ile veritabanina bir kere gonderilebilir.
       	// excuteBatch() metodu bir int [] dizi dondurur. Bu dizi her bir ifade sonucunda 
       	// etkilenen satir sayisini gosterir.
    	
    	
//		String [] sorgular1 = {"INSERT INTO bolumler VALUES(97, 'YEMEKHANE', 'ISTANBUL')",
//							"INSERT INTO bolumler VALUES(87, 'OFIS','ANKARA')",
//		      				"INSERT INTO bolumler VALUES(77, 'OFIS2', 'VAN')"};	
//		for(String each: sorgular1) {
//			st.addBatch(each);
//		}
//		int [] s3 = st.executeBatch(); //burada int [] array donduruyor.
//		System.out.println(s3.length + " ==> satir eklendi");
    	
    	// 3. YONTEM
    	//-----------------------------------------------------
    	// batch metoduyla birlikte PreparedStatement kullanmak en efektif yontemdir.
    	// bir sonraki ornekte bunu gerceklestirecegiz.
    	
		String sql4 = "INSERT INTO bolumler VALUES (?, ?, ?)";
		PreparedStatement pst = con.prepareStatement(sql4);
		
		pst.setString(1, "95");
		pst.setString(1, "85");
		pst.setString(1, "75");
		pst.setString(2, "YEMEKHANE");
		pst.setString(2, "OFIS");
		pst.setString(2, "OFIS2");
		pst.setString(3, "ISTANBUL");
		pst.setString(3, "ANKARA");
		pst.setString(3, "VAN");
		
		int result2 = pst.executeUpdate();
		System.out.println(result2);
 

    
    	//get all records from tha table
      ResultSet rs1 = st.executeQuery("SELECT * FROM bolumler");
      
      while(rs1.next()) {
          System.out.println("Bölüm ID:" + rs1.getString("bolum_id")+" "+"Bölüm Isim:" + rs1.getString("bolum_isim")+"\t"+"Konum:" + rs1.getString("konum"));
      }
      

		st.close();
		con.close();
		rs1.close();
	}
}
