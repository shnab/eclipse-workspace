package javadevelopmentntDay01;

/*
1)Enum is like a special class.
2)Enum is used to store "public", "static", "final" variables 
3)The difference between Enum and Class is variables.
  a)In a class you can create every kind of variables for example; private variables,
    instance variables, static variables etc. But for Enum you can have just 
    "public", "static", "final" variables.
  b)You cannot create objects by using Enums but you can create objects from classes
  c)Enums cannot extend to any class but they can implement interfaces.
    But you can extend to any class from a class and you can implement any interface from a class  
4)Varaiable names in an Enum are typed in uppercases, if you create multiple variables
  separate them with comma, do not use ";" at the end. 
*/
public enum Enum01 {
	
//JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER

CHROME, SAFARI, IE, OPERA, FIREFOX //"public", "static", "final"
}
