package javadevelopmentntDay01;

import java.util.List;
import java.util.Set;
	
	/*
	 * GENERIC CONCEPT ON A METHOD
	    Type parameters have naming convention, it is commonly used
	    do not try to use different naming convention
	    T -> Type
	    E -> Element
	    K -> Key
	    V -> Value
	    N -> Number
	 */

	public class Generic02 {
		
		public static void main(String[] args) {
		
		Generic02Nt01<String, Integer> obj1 = new Generic02Nt01<>("Ali", 33);
		//display() method has restriction(type bounded) for second parameter.
		//It is Numbers so when you use arguments in different data types from Numbers
		//you will get CTE like ==> obj1.display(true, 'C');==> 2. parameter must number
		obj1.display("A", 0.2);
		obj1.display('X', 123);
		
		obj1.print("Ali");
		obj1.print(123);
		obj1.print('C');
		
	}
		}
	class Generic02Nt01<K, V>{
	
	private K key;
	private V value;
	
	public Generic02Nt01(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Generic02Nt01 [key=" + key + ", value=" + value + "]";
	}
	//After "N extends" you can use just one class/abstract class and it should be the first
	//If you use "interface" you can use multiple interfaces.
	//If you use interfaces together with a class, class should be first interfaces should be after
	//the class.
	public <E, N extends Number> void display(E element, N number) {//Generic concept on a method
		System.out.println("Element:" + element + " Number:" + number);
	}
	public <E> void print(E element) {// we can use every data type. Flexibility
		System.out.println("Element:" + element);
	}
	}