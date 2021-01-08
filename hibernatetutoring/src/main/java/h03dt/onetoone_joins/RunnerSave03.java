package h03dt.onetoone_joins;


import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerSave03 {
	
	
	public static void main(String[] args) {
		
		Diary d1 = new Diary();
		Diary d2 = new Diary();
		
		Students03 std1 =  new Students03();
		Students03 std2 =  new Students03();
		
		std1.setId(101);
		std1.setName("Ali Can");
		std1.setGrade(11);
		std1.setDiary(d1);
		
		std2.setId(102);
		std2.setName("Veli Han");
		std2.setGrade(9);
		
		d1.setId(11);
		d1.setDiary_name(std1.getName() + "'s diary");
		d1.setStudent(std1);
		
		d2.setId(12);
		d2.setDiary_name("Nobody's diary");
		
	
		Configuration con = new Configuration().
								configure("hibernate.cfg.xml").
								addAnnotatedClass(Students03.class).
								addAnnotatedClass(Diary.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(std1);
		session.save(std2);
		
		session.save(d1);
		session.save(d2);
			
		tx.commit();
}
	
}
