package day06tulinhanim;

import day05.School;
public class Classroom abstract School {
private int roomNumber; 
protected  String teacherName;
public static int globalKey = 54321;
public int floor = 3;
public Classroom(int r, String t) {
roomNumber = r;
teacherName = t;
	}

}
