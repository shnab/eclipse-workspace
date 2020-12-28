package day04tulinhanim;

import java.util.ArrayList;
import java.util.List;
public class StudentTest {
	public static void main(String[] args) {
		List slist = new ArrayList<>();
		Student s = new Student("Sally");
		slist.add(s);
	   int f =  slist.indexOf(s);  //0
//		Student s = new Student ("Sally"));
//	    int f = slist.indexOf(s);

	   if (f>=0)
		System.out.println("Harry  meets Sally  ");
	}

}
