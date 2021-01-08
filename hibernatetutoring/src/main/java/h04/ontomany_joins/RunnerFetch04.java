package h04.ontomany_joins;

import java.util.Arrays;
import java.util.List;

import javax.persistence.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch04 {

	public static void main(String[] args) {
		
		Students04 student = new Students04();
		
		Books04 book = new Books04();

		Configuration con = new Configuration().
							configure("hibernate.cfg.xml").
							addAnnotatedClass(Students04.class)
							.addAnnotatedClass(Books04.class);
		
		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		

		//Example 1: Fetch all books of a student whose id is 1001 by using get() method
//		student = session.get(Students04.class, 1001);
//		for (Books04 w : student.getBooksList()) {
//			System.out.println(w);
//		}
		
		//Example 1: Fetch the owner of a book  whose id is 101 by using get() method
//		book = session.get(Books04.class, 101);
//		student = session.get(Students04.class, book.getStudent().getStd_id());
//		System.out.println(student);
//		
		
		//Example 3: Fetch student name, book name of common records from Students04 and Books04 tables (INNER JOIN)
		//1. way : SQL
//		String sqlQuery1 = "SELECT s.name, b.book_name\r\n"
//						+ "	FROM students04 s INNER JOIN books04 b\r\n"
//						+ "	ON s.std_id = b.student_id ";
//		
//	List<Object[]> resultList1 = session.createSQLQuery(sqlQuery1).getResultList();
//	for (Object [] w : resultList1) {
//		System.out.println(Arrays.toString(w));
//	}

	
	//2. way : HQL
		//*********HQL is case sensitive in class names ********
//	String hqlQuery1 = "SELECT s.name, b.book_name \r\n"
//					+ "	FROM Students04 s INNER JOIN FETCH Books04 b\r\n"
//					+ "	ON s.std_id = b.student";
//	
//	List<Object[]> resultList2 = session.createQuery(hqlQuery1).getResultList();
//	for (Object[] w : resultList2) {
//	System.out.println(Arrays.toString(w));
//	}

	//Example 4: Fetch student name, book name of records from Students04 table (LEFT JOIN)
	//1 way: use SQL
//	String sqlQuery2 = " SELECT s.name, b.book_name, b.book_id\r\n"
//			+ "FROM students04 s LEFT JOIN books04 b\r\n"
//			+ "ON s.std_id = b.student_id";
//	
//	List <Object[]> resultList3 = session.createSQLQuery(sqlQuery2).getResultList();
//	for (Object[] w : resultList3) {
//	System.out.println(Arrays.toString(w));
//	}
	
	//2 way: use HQL
//	String hqlQuery2 = "SELECT s.name, b.book_name, b.book_id \r\n"
//			+ "FROM Students04 s LEFT JOIN FETCH Books04 b\r\n"
//			+ "ON s.std_id = b.student";
//	
//	List <Object[]> resultList4 = session.createQuery(hqlQuery2).getResultList();
//	for (Object[] w : resultList4) {
//	System.out.println(Arrays.toString(w));
//	}
	
	
	//Example 5: Fetch student name, book name of records from Books04 table (RIGHT JOIN)
	//1 way: use SQL
//	String sqlQuery3 = " SELECT s.name, b.book_name, b.book_id\r\n"
//			+ "FROM students04 s RIGHT JOIN books04 b\r\n"
//			+ "ON s.std_id = b.student_id";
//	
//	List <Object[]> resultList5 = session.createSQLQuery(sqlQuery3).getResultList();
//	for (Object[] w : resultList5) {
//	System.out.println(Arrays.toString(w));
//	}
	
	//2 way: use HQL
//	String hqlQuery3 = "SELECT s.name, b.book_name, b.book_id \r\n"
//			+ "FROM Students04 s RIGHT JOIN FETCH Books04 b\r\n"
//			+ "ON s.std_id = b.student";
//	
//	List <Object[]> resultList6 = session.createQuery(hqlQuery3).getResultList();
//	for (Object[] w : resultList6) {
//	System.out.println(Arrays.toString(w));
//	}
//		
	
	//Example 6: Fetch student name, book name of all records from Students04 table (LEFT JOIN)
	//1 way: use SQL
//	String sqlQuery4 = " SELECT s.name, b.book_name, b.book_id\r\n"
//			+ "FROM students04 s FULL JOIN books04 b\r\n"
//			+ "ON s.std_id = b.student_id";
//	
//	List <Object[]> resultList7 = session.createSQLQuery(sqlQuery4).getResultList();
//	for (Object[] w : resultList7) {
//	System.out.println(Arrays.toString(w));
//	}
	
	//2 way: use HQL
//	String hqlQuery5 = "SELECT s.name, b.book_name, b.book_id \r\n"
//			+ "FROM Students04 s FULL JOIN FETCH Books04 b\r\n"
//			+ "ON s.std_id = b.student";
//	
//	List <Object[]> resultList8 = session.createQuery(hqlQuery5).getResultList();
//	for (Object[] w : resultList8) {
//	System.out.println(Arrays.toString(w));
//	}
	
					//How to delete all records from a table
					//You can delete records from child table 
		//1 way SQL
//		String sqlQuery5 = "DELETE FROM books04";
//		int numOfRec1 = session.createSQLQuery(sqlQuery5).executeUpdate();
//		System.out.println(numOfRec1); //3
		
		//2 way HQL
//		String hqlQuery6 = "DELETE FROM Books04";
//		int numOfRec2 = session.createQuery(hqlQuery6).executeUpdate();
//		System.out.println("The number of deleted records " + numOfRec2); //0
		
//		the shortest way to delete a records in HQL
//		session.delete(student);

				//How to delete a record by using delete(<Object Name>) method.
		// 1. way Use delete <object Name>
//		book = session.get(Books04.class, 101);
//		session.delete(book);
		
		//2. way: use delete <Entity name as a STRING>, <Object name>
//		book = session.get(Books04.class, 102);
//		session.delete("Books04", book);
		
		
					//You can delete records from PARENT TABLE (sTUDENTS04)
		//Delete the record whose id is 1003 from Students table
		//iF a table is parent of another table in a database , you can not DROP parent table
		//without dropping child table
		
		//if a record has a child record, you cannot delete the parent record without deleting child recordd
		//the code will throw a "ConstraintViolationException" at runtime
//		String hqlQuery8 = "DELETE FROM Students04 s WHERE s.std_id = 1002";
//		int numofRec4 = session.createQuery(hqlQuery8).executeUpdate();
//		System.out.println("The number of deleted records " + numofRec4);
		
		
		//If a record has no any child record, it can be deleted from parent table 
//		String hqlQuery9 = "DELETE FROM Students04 s WHERE s.std_id = 1003";
//		int numofRec5 = session.createQuery(hqlQuery9).executeUpdate();
//		System.out.println("The number of deleted records " + numofRec5);
		
		//Delete the record whose id is 1003 from Students table without getting any exception
		//1 way is not recommended
			//1.step: Delete the child record of 1002
//			book = session.get(Books04.class, 103);
//			session.delete(book);
//		
//			//2.step: Delete the parent record of 1002
//			student = session.get(Students04.class, 1002);
//			session.delete(student);
		
		//2. way
			//1. step a) Go to parent class
			//        b) change @OneToMany (mappedBy = "student") to
			//       ==>@OneToMany(mappedBy = "student", orphanRemoval = true, cascade = CascadeType.ALL)
		
//			student = session.get(Students04.class, 1001);
//			session.delete(student);
			
		
		
		
		
		
		tx.commit();
		sf.close();
		session.close();
		
		
	}

}
