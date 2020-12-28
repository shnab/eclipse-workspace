package practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class BookStore {

	static int id=1000;	
	static String name;
	static String author;
	static int year;
	static double price;
	
	static HashMap<Integer, String> books = new HashMap<>();

	public static void main(String[] args) {
		/* 	Let’s write an application for bookstores
			Rules
			You should create book id for every book. It should be start from 1000
			Every book should have some information like name, author, year of publication and price
			Program should start with a menu for user can pick any option
			1) add book
			2) search by book id
			3) search by any information
			4) delete by book id
			5) List all books
			6) Quit
		 */
		
		
		addSomeBooks();
		menu();
		
	}
	
	public static void listAllBooks() {
		if(!books.isEmpty())
			for (Integer keys : books.keySet())  
			{
			   System.out.println(keys + ":"+ books.get(keys));
			}
	    else
	    	System.out.println("There is no book in the store");
		
		menu();
 
		
	 }
	
	public static void searchById() {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please Enter your Book ID");
		int key = scan.nextInt();
		
		if(!books.containsKey(key))
			System.out.println("This book doesnt exist");
	    else
	    	System.out.println(books.get(key));
		
		menu();
		
	}
	public static void menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which option do you want to proceed");
		System.out.println("1) add book\r\n" + 
				"2) search by book id\r\n" + 
				"3) search by any information\r\n" + 
				"4) delete by book id\r\n" + 
				"5) List all books\r\n" + 
				"6) Quit");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			addBook();
			break;
		case 2:
			searchById();
			break;
		case 3:searchByInfo();
			break;
		case 4:
			deleteById();
			break;
		case 5:
			listAllBooks();
			break;
		case 6:
			Quit();
			break;
		default:
			System.out.println("Please choice 1,2,3,4,5,6");
		
	}
		
		
}
	public static void Quit() {
		System.out.println("Thank you for using our application");
		
	}
	public static void deleteById() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please Enter your Book ID");
		int key = scan.nextInt();
		
		if(!books.containsKey(key))
			System.out.println("We do not have this book in the store");
	    else
	    	System.out.println("You deleted " + books.remove(key));
		
		menu();
		
	}

	public static void searchByInfo() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any information about book");
		String searchInfo=scan.nextLine();
		int flag=0;
		
		for (Entry<Integer, String> entry : books.entrySet()) {     
			if (entry.getValue().contains(searchInfo)) {
				System.out.println("Id = " + entry.getKey() + ", Book Information= " + entry.getValue());
				flag++;
			}
			
		} if(flag==0) {
			System.out.println("we do not have that book");}
		System.out.println("============================");
		menu();
		}

	public String toString()
	{
		return "\n---BookInfo---\nName: " +name+"\nAuthor : "+author+"\nPrice: "+price+"\n--------------";
	}

	public static void addBook() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Book Name");
		name = scan.nextLine();
		
		System.out.println("Enter Author Name");
		author = scan.nextLine();
		
		System.out.println("Enter Year of Publication");
		year = scan.nextInt();
		
		System.out.println("Enter Price of Book");
		price = scan.nextDouble();
		
		String information = name + author + year + price;
		books.put(id, information);
		
		id++;
		menu();
		
		
		
	}
	
	public static void addSomeBooks() {
		books.put(9999, "Lords, John , 2001, 11");
		books.put(9998, "Countries, Ted, 2005, 10");
		books.put(9997, "Illness, Tulin, 2005, 21");
		books.put(9996, "Roads, Suzan, 2005, 30");		
	}

}
