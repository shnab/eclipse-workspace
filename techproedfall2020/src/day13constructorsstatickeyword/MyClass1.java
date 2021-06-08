package day13constructorsstatickeyword;

public class MyClass1 {
	
	int x;
	static int y;
	
	MyClass1(int i){
		x+=i;
		y+=i;
	}

	public static void main(String[] args) {
		
		new MyClass1(2);
		
		MyClass1 mc = new MyClass1(3);
		System.out.println(mc.x + "-" + mc.y);
		
		
	}

}
