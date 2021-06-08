package day13constructorsstatickeyword;

public class Order2 {

	int a;
	int b;
	
	Order2 (int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("parametreli");
	}
	
	Order2(){
		System.out.println("buradan dolayi sonuc 0");
	}
		
	public static void main(String[] args) {
		Order2 or = new Order2(3,5); //8 eger alttaki constructor olmasaydi sonuc 8 idi
		or = new Order2(); // 0 ==> burada, yukaridaki constructor yeniden esitlenmis oluyor ve sonuc 0. default int degerine donulmus oldu
		
		System.out.println(or.a + or.b); //0
		
	}
}
