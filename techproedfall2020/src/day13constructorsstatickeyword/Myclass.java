
package day13constructorsstatickeyword;

public class Myclass {
	
	int x = 3;
	int y = 5; 
	
	Myclass(){
		x+=1;
		System.out.print("-x" + x);
	}
	
	Myclass(int i){
		this();
		this.y=i;              
		x+=y;
		System.out.print("-x" + x);
	}
	
	Myclass(int i , int i2){
		this(3);
		this.x -=4;
		System.out.print("-x" + x);
	}
	
	public static void main(String[] args) {
		Myclass mc1 = new Myclass(4,3);
	}
	
}