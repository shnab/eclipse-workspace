package day08;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Students {
	
	private static int id =1000;
	private String studentId;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses="";
	private static int costOfCourse = 600 ;
	private int tutionBalance ;
	
	public void setStudentId () {
		id++;
		//studentId = id +""+ gradeYear;
		this.studentId =gradeYear+""+id; // 2 1003--- 21003
	}
	
	public Students() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter student's first name:");
		this.firstName = scan.nextLine();
		System.out.println("Enter student's last name:");
		this.lastName = scan.nextLine();
		System.out.println("Enter student's class level :");
		System.out.println("1 - Freshmen");
		System.out.println("2 - Sophmore");
		System.out.println("3 - Junior");
		System.out.println("4 - Senior");
		this.gradeYear = scan.nextInt();
		setStudentId();
		
	}
	
	public void enroll() {
		do {
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter course to enroll (Q to quit)");
			String course = scan.nextLine();
			if (!course.equals("Q")) {
				courses=courses+"\n"+course;
				tutionBalance+= costOfCourse;
			}
			else {
				break;
			}
			
		}while(true);
		System.out.println("You Enrolled in: "+ courses);
	}
	
	public void payTuition() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Your balance: $"+ tutionBalance);
		System.out.println("How much do you want to pay ?");
		int payment = scan.nextInt();
		tutionBalance = tutionBalance - payment ;
		System.out.println("Thanks for payment of $" + payment);
		//System.out.println("Your new tuition balance $" + tutionBalance);
	}
	
	public String toString () {
		return 
		"STUDENT ID: " + studentId +
		"\nSTUDENT NAME: " + firstName+" "+ lastName+
		"\nGRADE LEVEL: " + gradeYear +
		"\nCOURSES ENROLLED: " + courses+
		"\nREMAINING BALANCE: " + tutionBalance;
		
	}
			// key,Value
	static Map<String,String> studentInfo = new HashMap<>();
	
	public static void addStudentsMap() {
		Scanner scan = new Scanner (System.in);
		String stop = "";
		while (!stop.equals("S")) {
			Students s = new Students();
			s.enroll();
			s.payTuition();
			studentInfo.put(s.studentId, s.toString());
			System.out.println("Press 'S' to stop entrance.");
			System.out.println("Press Enter to go on  entrance.");
			stop=scan.nextLine().toUpperCase();
		}
	
		selectOptions();		
	}
	
	public static void getStudentInformation() {
		Scanner scan = new Scanner (System.in);
		String idOfStudent ;
		String result;
		do {
			System.out.println("Enter student id to get information");
			System.out.println("Enter X to end the program");
			idOfStudent=scan.nextLine();
			result = studentInfo.get(idOfStudent);
			if (!idOfStudent.equals("X")) {
				System.out.println(result);
			}
			
		}while(!idOfStudent.equals("X"));
		selectOptions();
		
	}
	
	public static void removeStudent() {
		Scanner scan = new Scanner (System.in);
		String idOfStudent;
		String result;
		
		do {
			System.out.println("Enter student id to remove!");
			System.out.println("Press 'X' to end the program");
			idOfStudent=scan.nextLine();
			result = studentInfo.remove(idOfStudent); // remove method returns the value when I used key.
			if(!idOfStudent.equals("X")) {
				System.out.println(result);
				System.out.println("The student above is removed from the list");
			}
			
		}while(!idOfStudent.equals("X"));
		
		selectOptions();
	}
	
	public static void selectOptions() {
		System.out.println("Select the options:");
		System.out.println("1- Add students::");
		System.out.println("2- Get the student's information by id:");
		System.out.println("3- Remove student by id:");
		
		Scanner scan = new Scanner (System.in);
		int option = scan.nextInt();
		
		switch(option) {
		
		case 1:
			addStudentsMap();
			break;
		case 2:
			getStudentInformation();
			break;
		case 3:
			removeStudent();
			break;
		default:
			System.out.println("Invalid selection just enter 1,2 or 3!!");
		}
		selectOptions();
		
	}

		/*
	 Select the options:
1- Add students:
2- Get the student's information by id:
3- Remove student by id:
1
Enter student's first name:
Ali
Enter student's last name:
Can
Enter student's class level:
1 - Freshmen
2 - Sophmore
3 - Junior
4 - Senior
2
Enter course to enroll (Q to quit)
Math
Enter course to enroll (Q to quit)
Science
Enter course to enroll (Q to quit)
Art
Enter course to enroll (Q to quit)
@
Enter course to enroll (Q to quit)
Q
You Enrolled in:
MATH
SCIENCE
ART
@
Your balance: $2400
How much do you want to pay ?
1000
Thanks for payment of $ 1400
Press 'S' to stop entrance.
Press Enter to go on  entrance.
Enter student's first name:
Tulin
Enter student's last name:
Mungan
Enter student's class level:
1 - Freshmen
2 - Sophmore
3 - Junior
4 - Senior
3
Enter course to enroll (Q to quit)
Music
Enter course to enroll (Q to quit)
Art
Enter course to enroll (Q to quit)
Q
You Enrolled in:
MUSIC
ART
Your balance: $1200
How much do you want to pay ?
500
Thanks for payment of $ 700
Press 'S' to stop entrance.
Press Enter to go on  entrance.
S
Select the options:
1- Add students:
2- Get the student's information by id:
3- Remove student by id:
2
Enter student id to get information
Enter X to end the program
31002
STUDENT ID: 31002
STUDENT NAME: Tulin Mungan
GRADE LEVEL: 3
COURSES ENROLLED:
MUSIC
ART
REMAINING BALANCE: 700
Enter student id to get information
Enter X to end the program
null
Enter student id to get information
Enter X to end the program
X
Select the options:
1- Add students:
2- Get the student's information by id:
3- Remove student by id:
3
Enter student id to remove!
Press 'X' to end the program
21001
STUDENT ID: 21001
STUDENT NAME: Ali Can
GRADE LEVEL: 2
COURSES ENROLLED:
MATH
SCIENCE
ART
@
REMAINING BALANCE: 1400
Removed from the list
Enter student id to remove!
Press 'X' to end the program
X
Select the options:
1- Add students:
2- Get the student's information by id:
3- Remove student by id:
2
Enter student id to get information
Enter X to end the program
21001
null
Enter student id to get information
Enter X to end the program
	 */
}
