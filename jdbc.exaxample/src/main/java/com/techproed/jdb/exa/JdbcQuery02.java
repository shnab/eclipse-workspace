package com.techproed.jdb.exa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import java.sql.*; ==> tum Sql metotlarini import etmek icin

public class JdbcQuery02 {

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
    	
    	//4. Bolumler tablosundaki tum kayitlari listeleyen bir sorgu
    	String selectQuery = "SELECT * FROM bolumler";
    	ResultSet tablo1 = st.executeQuery(selectQuery);
    	
    	//5.
    	while(tablo1.next()) {
    		System.out.println(tablo1.getInt(1)+ " " 
    						  + tablo1.getString(2) + " "
    						  +tablo1.getString(3));
    	}
    	
    	System.out.println("=========================");
    	/*=======================================================================
    			 ORNEK2: SATIS ve MUHASABE bolumlerinde calisan personelin isimlerini ve 
    	  		 maaslarini maas sirali olarak listeleyiniz
    			========================================================================*/
    	String q2 = "SELECT personel_isim, maas"
    			+ " FROM personel"
    			+ " WHERE bolum_id IN(10,30)"
    			+ " ORDER BY maas DESC";
    	
    	ResultSet tablo2 = st.executeQuery(q2);
 
    	while(tablo2.next()) {
    		System.out.println("Isim: " + tablo2.getString(1)+ "\t" 
    						+ "Maas : " + tablo2.getInt(2));
    	} 	
    	
System.out.println("=========================================");
		
		/*=======================================================================
		 ORNEK 3: Tüm bolumlerde calisan personelin isimlerini, bolum isimlerini 
		 ve maaslarini, bolum ve maas siraali listeleyiniz. NOT: calisani olmasa 
		 bile bolum ismi gosterilmelidir.
		========================================================================*/
		
		String q3 = "SELECT b.bolum_isim, p.personel_isim, p.maas"
				+ " FROM personel p"
				+ " FULL JOIN bolumler b"
				+ " ON b.bolum_id = p.bolum_id"
				+ " ORDER BY b.bolum_isim, p.maas";
		ResultSet sonuc1 = st.executeQuery(q3);
		
		while(sonuc1.next()) {
			System.out.println(sonuc1.getString(1)+ "\t" + sonuc1.getString(2) + "\t" + sonuc1.getInt(3));
		}
				
		System.out.println("=====================================================");
		
		
		/*=======================================================================
				 ORNEK 4: Maasi en yuksek 10 kisinin bolumunu,adini ve maasini listeyiniz
		========================================================================*/

		String q4 ="SELECT b.bolum_isim, p.personel_isim, p.maas"
				+ " FROM personel p"
				+ " JOIN bolumler b"
				+ " ON b.bolum_id = p.bolum_id"
				+ " ORDER BY p.maas DESC"
				+ " FETCH NEXT 10 ROWS ONLY";
		
		
		ResultSet sonuc2 = st.executeQuery(q4);
		
		while(sonuc2.next()) {
			System.out.println(sonuc2.getString(1)+ " " + sonuc2.getString(2) + " " + sonuc2.getInt(3));
		}
    	
      	//6. Olusturlan nesneleri silelim
		con.close();
		st.close();
		tablo1.close();
		sonuc1.close();
		sonuc2.close();
    	tablo2.close();
    	

	}

}
