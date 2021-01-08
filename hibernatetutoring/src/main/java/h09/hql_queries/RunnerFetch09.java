package h09.hql_queries;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch09 {
	
	public static void main(String[] args) {
		
		Students09 student = new Students09();
		
			
	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students09.class);
	SessionFactory sf = con.buildSessionFactory();
	Session session = sf.openSession();
	
	Transaction tx = session.beginTransaction();
	
	/*
	 CRUD ==> Create Table : @Entity + @Id + Create RunnerSave + Execute
	 	  ==> Create records: Create Object + save()
	 	  
	 	  ==>Read Data: get()
	 	  ==>Read Data: HQL Queries + createQuery() 
	 	  
	 	  ==>Update Data: We will learn it today
	 	  
	 	  ==>Delete Data: 1. HQL Query + createQuery()
	 	  ==>Delete Data: delete(<objectname>), delete (<"Entity name">, <Object name>)
 	  	 	  
 	  	 	  
 	  	 	  ===> Altering tables : we will learn it today
	 */
	
	//we can update a data in 2 ways
	//1.way ==> by using HQL queries
	
	//1)Update the name of the student whose id is 11 to Ali Can
	
//	String hqlQuery1 = "UPDATE Students09 s SET s.name = 'Ali Can' WHERE s.id = 11";
//	int numOfRec1 = session.createQuery(hqlQuery1).executeUpdate();
//	System.out.println("The number of effected records: " + numOfRec1);
	
	//2. way : By using session methods
	//2)Update the name of the student whose id is 12 to Ali Can
//	student = session.get(Students09.class, 12);
//	student.setName("Veli Han");
//	session.update(student);
	
	//3)Update the math grades of the students to 100 whose mathGrades are more than 90
	
//	String hqlQuery2 = "UPDATE Students09 s SET s.mathGrade = 100 "
//						+ "WHERE s.mathGrade > 90";
//	int numOfRec2 = session.createQuery(hqlQuery2).executeUpdate();
//	System.out.println("Number of affected record:" + numOfRec2);
	
	//4)Update the math grades of the students to 50 whose mathGrades are less than 30
//	for(int i=1; i<=50; i++) {	
//		student = session.get(Students09.class, i);
//		if (student.getMathGrade()<30) {
//			student.setMathGrade(50);
//			session.update(student);
//		}
//	}
	
			//INSERT A NEW DATA
	//5)Insert a record whose id is 51, name is "Kemal Kuzu", and mathGrade is 97
	//1 way By using HQL query ==> no usage
	//2. way: 
	Students09 std= new Students09();
	std.setId(51);
	std.setName("Kemal Kuzu");
	std.setMathGrade(97);
	
	session.save(std);
	
			//ALTERING
	
	

	
	
	
	
	
	
	tx.commit();
	
	}
}
