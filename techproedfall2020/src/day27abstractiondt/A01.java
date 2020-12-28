package day27abstractiondt;

public abstract class A01 {
	
	/*
	1) Sometimes we need to methods without body, that kind of methods are 
	 called "abstract method". The methods which have body are called "concrete methods". 
	2) If a method is "abstract ", concrete child classes MUST override them.
	3) To make a method "abstract " you have to type "abstract " between  access modifier
	and return type //public abstract void
	4) You can not create abstract method inside an 
	"concrete class" . You can create "abstract method " just in "abstract classes"
	5) To make a class abstract type "abstract " between access modifier ans class keyword.
	6) You can not create an object from an "abstract class"
	7) You can create "concrete  and abstract methods" in "abstarct classes" 
	but for concrete classes you can use just "concrete methods"
	8) If you use abstact keyword for a method you cannot use method body.
	 iF you do it CTE
	 9) Concrete child classes of an abstract classes MUST implemet/override abstract methods from
	 parent abstract class otherwise you get CTE. But if the child class is abstarctas well, it is optional to override 
	 abstarct methods
	 10) For concrete and abstacrt child classes of an abstract parent class, it is optional to override 
	 concrete methods.
	 11) mULTIPLE inheritance canot be used for abstract classes as well. 
	 12) as you should know, Final calsses cannot have child classes. But when we create an abstract we use it 
	 as a method storage fora child classes. So when i create an abstract class i need child classes. 
	 Because of that Java does not let an abstract class to make "final".
	 13) As yuou know, final method can not be overridden but abstract methods are created to be overridden.
	 If you make an abstract method "final", it means it cannot be overridden. This is  contradiction. 
	 Because of that Java doen not let an anstract method to be final.
	 14) "Private " methods cannot be accessed from other classes. We create abstract methods to access from the child classes.\
	 Because of that if you make an abstract class "private" Java will give CTE
	 15) Abstract methods cannot be "static " because we create abstract methods to override 
	 but static methods cannot be overridden.
	 */

	
	public abstract void engine(); //this is abstract method and have no method body yani  {  } .
	
	public void price () { //7) You can create also concrete method in "abstract classes" 
		
	}
	
}