package day28interface;


	/*
	 go package name, click on it then choose interface
	 1) By using Interface  we can use multiple inheritance in Java ***
	 2) Interface is not a class, interface is just interface
	 3) Abstract classes may have abstract and concerete method, 
	 	but interfaces may have JUST abstract methods
	 4)For interfaces all methods are abstract as default. 
	 	Because of that no need to use "abstract " keyword
	 	for methods in an interface.
	 	"public void seat(); " is same with "public abstarct void seat();"
	 5) When you work in a class, if you remove access modifier it will be "default"
	 	but when you work in an interface access modifiers of all methods will be public 
	 	everYtime even you type access modifier or not
	 	==> "public void seat(); " is same with "void seat ();"
	 6) For concrete and abstract classes we use "extends" keyword but for interfaces we use 
	 	"implements" keyword. Both "extends " and "implements " can be used at the same time for a class 
	 	to achieve multiple inheritance
	 7) All methods in an interface must be "abstract", because of that interfaces are called "Fully Abstraction",
	 	, abstract classes are called "Partial Abstraction".(Kismi)
	 8) When we have abstraction we cannot create objects
	 	because of that we cannot create object by using interfaces.
	 9) Class ===> Interface use "implements"
	 	Class ===> Class use "extends" to make child
	 	Interface ===> Interface use "extends" for child interface
	 	Interface ===> Class !!! A Class cannot be parent for an interface !!!
	
	 10) If  a concrete class have 2 interface parents when you create a method with same method signature
	  in parent interfaces, do not use different return types otherwise java cannot decide which one to override
	  and starts to complain.  ==> void clean(); yerine int clean();  farkli farkli kullanilmaz
	  
	 
	 */
	public interface Inside { //interface is different from class
		
	int PRICE = 20000; // Every variable in interface are public, final and static
	
	public abstract void seat (); //all methods are abstract method no body
	
	public abstract void steerinWheel();
	
	public abstract void radio();
	
	void clean(); //return type cannot be difFERENT. If we same name as a method.
	//int clean(); yazsak olmuyor.
	
	//public void add(); //abstract yazsak da yazmasak da default olarak abstract kabul ediliyor.
	

}
