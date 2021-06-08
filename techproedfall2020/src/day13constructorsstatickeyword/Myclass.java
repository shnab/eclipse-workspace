package day13constructorsstatickeyword;

public class Myclass {
	
	int x = 3;
	int y = 5; 
	
	//Constructors update the values inside the class. 
	//Burda 3 constructor var ama sanki tek constructor gibi calisiyorlar. birbirine this ile bagladigimiz icin update yapiyorlar.
	//Ondan dolayi value x updae ediliyor.
	//but methods dont update
	Myclass(){
		x+=1; //x=4 burada 4 olarak update edildi. Asagida 4 olarak kullanacagiz
		System.out.print("-x" + x); //-x4
	}
	
	Myclass(int i){
		this();
		this.y=i;              
		x+=y; //x= x+y; 4+3 /==> yuikarida 4 olarak update edilmisti
		System.out.print("-x" + x); //-x7
	}
	
	Myclass(int i , int i2){
		this(3);
		this.x -=4; // x=3
		System.out.print("-x" + x); //-x3
	}
	
	public static void main(String[] args) {
		Myclass mc1 = new Myclass(4,3);
	}
	
}