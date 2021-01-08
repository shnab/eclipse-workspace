package h03dt.onetoone_joins;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch03 {
	
	public static void main(String[] args) {
		
		Students03 std1 = new Students03();
		Diary d1 = new Diary();
		
		Configuration con = new Configuration().
									configure("hibernate.cfg.xml").
									addAnnotatedClass(Students03.class).
									addAnnotatedClass(Diary.class);

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		//Fetch the student whose id is 101 by using get()
//		std1 = session.get(Students03.class, 101);
//		System.out.println(std1);
		
		//Fetch the diary details of a student whose id is 101 by using get()
//		d1 = session.get(Diary.class, 11);
//		System.out.println(d1);
		
		//Fetch common records from Students03 and Diary tables
		
		//1.Way: By using SQL Queries
//		String sqlQuery1 = "SELECT s.std_name, d.diary_name, s.grade   \n"
//							+ "FROM Students03 s \n"
//							+ "INNER JOIN Diary d ON s.id = d.student_id";
//		List<Object[]> resultList1 = session.createSQLQuery(sqlQuery1).getResultList();
//		for(Object[] w : resultList1) {
//			System.out.println(Arrays.toString(w));
//		}
		
		//2.Way: By using HQL Queries
//		String hqlQuery1 = "FROM Students03 s INNER JOIN FETCH s.diary";
//		List<Object> resultList2 = session.createQuery(hqlQuery1).getResultList();
//		for(Object w : resultList2) {
//			System.out.println(w);
//		}
//		
//		String hqlQuery2 = "FROM Diary d INNER JOIN FETCH d.student";
//		List<Object> resultList3 = session.createQuery(hqlQuery2).getResultList();
//		for(Object w : resultList3) {
//			System.out.println(w);
//		}
		
//		String hqlQuery3 = "FROM Diary d LEFT JOIN FETCH d.student";
//		List<Object> resultList4 = session.createQuery(hqlQuery3).getResultList();
//		for(Object w : resultList4) {
//			System.out.println(w);
//		}
		
		//Example : Fetch student name, student grade, diary name of all records from Students03 and Diary tables
		//1 way : USE SQL
		
//		String sqlQuery = "SELECT s.std_name, s.grade, d.diary_name "
//							+ "FROM Students03 s "
//							+ "FULL JOIN Diary d ON s.id = d.student_id";
//		
//		List<Object[]> resultList = session.createSQLQuery(sqlQuery).getResultList();
//		for(Object[] w: resultList) {
//			System.out.println(Arrays.toString(w));
//		}
		
		////1 way : USE HQL==> SQL ile HQL arasinda 3 fark var. s.std_name .., d.student_id,, FETCH
		String hqlQuery = "SELECT s.name, s.grade, d.diary_name \n"
						+ "FROM Students03 s \n"
						+ "RIGHT JOIN FETCH Diary d ON s.id = d.student";
		List<Object[]> resultList = session.createQuery(hqlQuery).getResultList();
		for(Object[] w: resultList) {
			System.out.println(Arrays.toString(w));
		}
		
		
		
		
		
		
		tx.commit();

	}
	
}
