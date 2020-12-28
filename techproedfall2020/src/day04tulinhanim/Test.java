package day04tulinhanim;

public class Test {

	public static void main(String[] args) {
		 Product prt = new Product();
		 prt.price =200;
		 double newPrice =100;
		 
		 Test t = new Test();
		 t.updatePrice(prt, newPrice);  
		
		 System.out.println(prt.price+" : "+newPrice);  // pass by value
		 }

	//200			//100
	public void updatePrice (Product product, double price) { // String str
			price = price*2; //100*2 =200
			product.price = product.price + price;   // 200 + 200 400
	}

}
