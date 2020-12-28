package day3435Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda09 { // with Objects

	public static void main(String[] args) {

		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
		
		List<Course> courseList = new ArrayList<>();
		courseList.add(courseTurkishDay);
		courseList.add(courseTurkishNight);
		courseList.add(courseEnglishDay);
		courseList.add(courseEnglishNight);
		System.out.println(courseList);
		
		
		System.out.println(checkAvgScr(courseList)); //true
		System.out.println(checkNumOfStudent(courseList)); //true
		System.out.println(checkSeasonSpring(courseList)); //false
		System.out.println( Arrays.toString(sortNumOfStudent1 (courseList).toArray()));
		//[Summer/ Turkish Day/ 97/ 128, Spring/ English Day/ 95/ 132, Winter/ English Night/ 93/ 144, Winter/ Turkish Night/ 98/ 154]

		System.out.println(sortNumOfStudent2(courseList)); //bu yukaridaki ile ayni
		
		System.out.println(sortSeasonAvgScr(courseList));
		
		System.out.println(sortNumOfStdLimitByTwo(courseList)); //[Summer/ Turkish Day/ 97/ 128, Spring/ English Day/ 95/ 132]
		
		System.out.println(sortAvgScoreSkipThree (courseList)); //[Winter/ Turkish Night/ 98/ 154]

		System.out.println(sortNumOfStdSkip1Limit2 (courseList)); //[Spring/ English Day/ 95/ 132, Winter/ English Night/ 93/ 144]
		
		System.out.println(getCourseMaxAvgScr1 (courseList)); //Optional[Winter/ Turkish Night/ 98/ 154]
		System.out.println(getCourseMaxAvgScr2 (courseList)); //[Winter/ Turkish Night/ 98/ 154]
		System.out.println(getCourseMaxAvgScr3 (courseList)); //Optional[Winter/ Turkish Night/ 98/ 154]
	
		System.out.println(getCoursenNumberStdMini (courseList)); //Optional[Summer/ Turkish Day/ 97/ 128]
	
		
		System.out.println(sumOfStdntAvgScrMoreThan95 (courseList)); //282
		
		System.out.println(avgNumOfStudentsAvgScrMoreThan93(courseList)); //OptionalDouble[138.0]
	
	}
	
	//Create a method to check if all average scores are greater than 91
	
	public static boolean checkAvgScr(List<Course> courseList) {
		return courseList.stream().allMatch(t->t.getAverageScore()>91);
	}
	
	//Check if any number of Students is equal to 154
	
	public static boolean checkNumOfStudent(List<Course> courseList) {
		return courseList.stream().anyMatch(t->t.getNumberOfStudents()==154);
		
	}
	
	//Check if no season contains Spring
	
	public static boolean checkSeasonSpring (List<Course> courseList) {
		
		return courseList.stream().noneMatch(t->t.getSeason().equals("Spring"));
		
	}
	
	//Sort the list elements according to the number of students
	
	public static Stream<Course> sortNumOfStudent1 (List<Course> courseList) { //
		return courseList.stream().sorted(Comparator.comparing(t->t.getNumberOfStudents()));
		
	}
	
	public static List<Course> sortNumOfStudent2 (List<Course> courseList) { //
		return courseList.
				stream().
				sorted(Comparator.comparing(t->t.getNumberOfStudents())).
				collect(Collectors.toList());
		
	}
	
	//Sort the list elements according to the season and average score
	
    public static List<Course> sortSeasonAvgScr(List<Course> courseList){
        return   courseList.
                     stream().
                     sorted(Comparator.comparing(Course::getSeason).thenComparing(Course::getAverageScore)).
                     collect(Collectors.toList());
	
}
	
	//Sort the list elements according to the number of students and limit the elements by 2
	
	public static List<Course> sortNumOfStdLimitByTwo (List<Course> courseList) {
		return  courseList.
				stream().
				sorted(Comparator.comparing(Course::getNumberOfStudents)).
				limit(2).
				collect(Collectors.toList());
	
	}
	
	//Sort the list elements according to the average score and skip first 3 elements
	
	public static List<Course> sortAvgScoreSkipThree (List<Course> courseList) {
		return  courseList.
				stream().sorted(Comparator.comparing(Course::getAverageScore)).
				skip(3).
				collect(Collectors.toList());
								
	}	
	
	//Sort the list elements according to the number of students and skip first the first element and limt by 2
	
	public static List<Course> sortNumOfStdSkip1Limit2 (List<Course> courseList) {
		return  courseList.
				stream().
				sorted(Comparator.comparing(Course::getNumberOfStudents)).
				skip(1).
				limit(2).
				collect(Collectors.toList());

	}
	
	//Get the course whose average score is maximum
	public static Optional<Course> getCourseMaxAvgScr1 (List<Course> courseList) {
		return  courseList.
				stream().
				sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst();
	}
	
	//Get the course whose average score is maximum
	public static List<Course> getCourseMaxAvgScr2 (List<Course> courseList) {
		return  courseList.
				stream().
				sorted(Comparator.comparing(Course::getAverageScore).reversed()).
				limit(1).collect(Collectors.toList());
		
	}
	
	//Get the course whose average score is maximum	
	public static Optional<Course> getCourseMaxAvgScr3 (List<Course> courseList) {
		return  courseList.
				stream().max(Comparator.comparing(Course::getAverageScore));
		
	}
	//Get the course whose number of students is minimum
	
	public static Optional<Course> getCoursenNumberStdMini (List<Course> courseList) {
		return  courseList.
				stream().min(Comparator.comparing(Course::getNumberOfStudents));

	}	
	
	//Find the sum of the number of students whose average grades are more than 95
		public static int sumOfStdntAvgScrMoreThan95 (List<Course> courseList) {
		return courseList.stream().filter(t->t.getAverageScore()>95).mapToInt(t->t.getNumberOfStudents()).sum(); //Hier we can use reduce mathods
		
	}
	
	
	//Find the average of the number of students whose average scores are more than 93
	public static OptionalDouble avgNumOfStudentsAvgScrMoreThan93(List<Course> courseList) {
		return courseList.stream().filter(t->t.getAverageScore()>93).mapToDouble(t->t.getNumberOfStudents()).average();
	
	}
	
	//1) intStream and 2)How to work with Files in Lambda
	
	
}
