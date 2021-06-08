package day13constructorsstatickeyword;

public class Static02 {

	public static void main(String[] args) {
	
		// bunu baska bi class'tan aldik. ilk defa cunku bu deger intance idi
		Static01 obj1 = new Static01();
		System.out.println(obj1.age); //23
		//obj1.subtract(11, 3); //8 ==> by using object
		//you can access static things by using objects  but it is not recommended
		//obj1.add(12,11); //23

		System.out.println(Static01.height); // (Static01.height) static oldugu icin dogrudan gacirabildik kullaniyoruz. Using yani not transfering
		Static01.add(4, 15); //19 ==> add method static oldugu icin class name ile ulastik

		Static01 obj2 = new Static01();
		
		//update static variables. bu deger yukseltilince degeri 7 oluyor ve tum objectler icin gecerli 
		Static01.height++;
		System.out.println(obj1.height); //7
		System.out.println(obj2.height); //7
		
		//UPDATE instance variables. burada age update ediliyor ve sadece update yapilan obj icin gecerli
		obj1.age++;
		System.out.println(obj1.age); //24
		
		System.out.println(obj2.age); //23
	}
	
	


}
