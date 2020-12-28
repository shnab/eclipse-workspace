package Day01;

import java.util.Scanner;

public class Practise06 {

	public static void main(String[] args) {


		/*
		 Write a Java program to calculate Body Mass Index (BMI)
		Ask to user height and weight
		Calculate BMI
		Hint : BMI = weight / (height * height)
	Print on the console:
     If BMI is less then 18,49  “Below ideal Weight”,
            between the 18,5 and 24,99  “ideal Weight”,
            more then 25   “Much Above ideal Weight”
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your height");
		double height = scan.nextDouble();
		
		System.out.println("Enter your weight");
		double weight = scan.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.println("BMI is " + BMI);
		if(BMI<18.49) {
			System.out.println("Below ideal Weight");
		}else if(BMI >= 18.5 && BMI <=24.99) {
			System.out.println("ideal Weight");
		}else {
			System.out.println("Much Above ideal Weight");
		}
	}
}