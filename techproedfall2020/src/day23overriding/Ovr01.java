package day23overriding;

public class Ovr01 {

	
	
	

	/*
	 1) If you change body of a method which is in parent class when you use 
	 it in child class, it means you are overiding the method.
	 2) When you override a method if you need you can change the return type ans
	 access modifier, it is accepted in overriding BUT you CANNOT change
	 the Method Signature (method name and the parameters).
	 3) Making method specifiek voor the child.
	 3) I fyou use @Override annotation before the overriding method, 
	 Java will check if the overriding is done correctly or not
	 4) The methos which is overridden from parent class is called "Overridden" method.
	 When you override the method which is created in Child class is called "
	 "Overriding Method"
	 5) Overriding is done so that a child class can give its own implementation 
	 to the  method which is provided by the parent class. 
	 6) We can use different "access modifiers" for "Overridden" and "Overriding" method. 
	 But "Overiding" method's access modifier sholud be same or wider 
	 than "Overridden " method's access modifier
	 7) We ca n use diffrent return types in "Overridden" and "Overriding" methods
	  but return type of overriding method 
	  should be same of smaller (Child) then the return type of Overridden method. 
	  8) If you are usung primitives a sreturn type in overriding, you canNOT 
	  use different return types for "Overriding and Overridden methods"
	  9)  If you are usung  Wrapper Classes return type in overriding, you canNOT 
	  use different return types for "Overriding and Overridden methods", there is no child relationship 
	  between Wrapper Classes.
	  As a conclusion; In Overriding , Overriding method can use the same 
	  							return type with the Overridden method
	  							or can use child classes as a return type. In overridding you should have "IS-A" relationship 
	  							from  Overriding method to Overridden method for return types.

	 */
	
	


}
