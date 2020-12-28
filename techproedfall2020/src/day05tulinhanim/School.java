package day05tulinhanim;

import day06tulinhanim.*;
public class School {

	public static void main(String[] args) {
	System.out.println(Classroom.globalKey); // It is not public 
	Classroom room = new Classroom (101,"Mr.Anderson"); // constructor is default so I haveto chnge the midifier.
	System.out.println(room.roomNumber);
	System.out.println(room.floor);
	System.out.println(room.teacherName);

	}

}
