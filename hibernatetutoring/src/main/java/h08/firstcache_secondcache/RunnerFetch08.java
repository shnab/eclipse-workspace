package h08.firstcache_secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch08 {

	public static void main(String[] args) {

		Books08 book = new Books08();
		Configuration con = new Configuration().
							configure("hibernate.cfg.xml").
							addAnnotatedClass(Students08.class).
							addAnnotatedClass(Books08.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session1 = sf.openSession();
		Transaction tx1 = session1.beginTransaction();
		
		/*
		  					1st Level Cache
		  1st Scenario: If you fetch the same data multiple times, Hibernate will hit the 
		                database just once. Because, Hibernate uses 1st Level Cache as default
		*/
		
		book = session1.get(Books08.class, 101);
		System.out.println(book);
//		
//		book = session1.get(Books08.class, 101);
//		System.out.println(book);
		
		/*
		 					1st Level Cache
		 	2nd Scenario: If you fetch different data, Hibernate will hit the database twice. 
		 	              In 1st Level Cache, if you fetch different data, Hibernate hits the
		 	              database once for every data
		*/
		
//		book = session1.get(Books08.class, 101);
//		System.out.println(book);
//		
//		book = session1.get(Books08.class, 102);
//		System.out.println(book);
		
		tx1.commit();
		
		//session1.close();
		
		//=======================================================================================
		
		Session session2 = sf.openSession();
		
		Transaction tx2 = session2.beginTransaction();
		/*
					  2nd Level Cache
		1st Scenario: If you fetch the same data by using different sessions, Hibernate will hit the 
		              database just ONCE if you are using 2nd level cache. 
		              
		              If you fetch the same data by using different sessions, Hibernate will hit the
		              database multiple times if you do not use 2nd Level cache
		*/
		
		book = session2.get(Books08.class, 102);
		System.out.println(book);
		
		book = session2.get(Books08.class, 102);
		System.out.println(book);
		
		
		tx2.commit();
		
	}
	
}