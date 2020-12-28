package day05tulinhanim;

public class Book {
	 int pages;
	
	}

class App{ // ayri bir class
	int count;

	//obj.Book   //count
public void method (Book x, int k) {
	x.pages =100;  // 
	k =200;
	
	
}
public static void main(String[] args) {
	App obj = new App();
	Book objBook = new Book ();
	System.out.print(objBook.pages + ":"+ obj.count+" "); // 0:0
	obj.method(objBook, obj.count);  // 100 200
	System.out.print(objBook.pages + ":" + obj.count);  //100 :0
	}

}
