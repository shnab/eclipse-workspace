package h02dt.embedded_annotation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class RunnerSave02 {
	
	public static void main(String[] args) {
		
		Courses02 courses = new Courses02();
		courses.setElective("Art, Music, PE");
		courses.setMandatory("English, Math");
		
		Students02 std1 = new Students02();
		std1.setStd_id(101);
		std1.setName("Ali Can");
		std1.setGrade(11);
		std1.setCourse(courses);
		
		Students02 std2 = new Students02();
		std2.setStd_id(102);
		std2.setName("Veli Han");
		std2.setGrade(10);
	
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students02.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		//session.save(std1);
		session.save(std2);
		
		tx.commit();
		
		sf.close();
		session.close();
	}
}
