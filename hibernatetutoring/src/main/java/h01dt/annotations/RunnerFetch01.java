package h01dt.annotations;

import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class RunnerFetch01 {
	public static void main(String[] args) {
		
		Students01 std1 = new Students01();
		Students01 std2 = new Students01();
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students01.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession(); 
		
		Transaction tx = session.beginTransaction();
		
		//How to get a single record from database
		//To fetch record from database by using get(), you have to use primary key values as second parameter
//		std1 = session.get(Students01.class, 101);
		
		//How to get multiple records from database
		//1.Way: Not Recommended
//		std1 = session.get(Students01.class, 101);
//		std2 = session.get(Students01.class, 102);
		
		//2.Way: Recommended but we used SQL Query. 
		//       In Hibernate, SQL Queries can be used but not recommended 
//		String sqlQuery1 = "SELECT * FROM students_table";
//		List<Object[]> resultList1 = session.createSQLQuery(sqlQuery1).getResultList();
//		for(Object[] w : resultList1) {
//			System.out.println(Arrays.toString(w));
//		}
		
		//3.Way: The most Recommended. We will use HQL Queries
//		String hqlQuery1 = "FROM Students01";
//		List<Object> resultList2 = session.createQuery(hqlQuery1).getResultList();
//		for(Object w : resultList2) {
//			System.out.println(w);
//		}
		
		//Fetch data by using students name
		//1.Way: Use SQL Query
		String sqlQuery2 = "SELECT * FROM students_table WHERE std_name = 'Ali Can'";
		//a)You may use getResultList() because std_name is not unique, maybe there are more tha 1 Ali Can
//		List<Object[]> resultList3 = session.createSQLQuery(sqlQuery2).getResultList();
//		for(Object[] w : resultList3) {
//			System.out.println(Arrays.toString(w));
//		}
		//b)If you are sure, you will get just a single record use uniqueResult()
//		Object[] result1 = (Object[]) session.createSQLQuery(sqlQuery2).uniqueResult();
//		System.out.println(Arrays.toString(result1));
		
		//2.Way: Use HQL Query
		//a)Fetch the data as a List
		String hqlQuery2 = "FROM Students01 s WHERE s.name = 'Ali Can'";
//		List<Object> resultList2 = session.createQuery(hqlQuery2).getResultList();
//		for(Object w : resultList2) {
//			System.out.println(w);
//		}
		//b)If you are sure, you will get just a single record use uniqueResult()
		Object result2 = session.createQuery(hqlQuery2).uniqueResult();
		System.out.println(result2);
			
		tx.commit();
		
//		System.out.println(std1);
//		System.out.println(std2);
		
		session.close();

	}
	}
