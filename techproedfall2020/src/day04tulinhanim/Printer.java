package day04tulinhanim;

	 class  Printer {
		 void declare() {
			System.out.println("Declared");
		}
		
		 void assign() {
		 declare();
		 System.out.println("Assigned");
		}

	 }
	 class TestPrint{
		public static void main(String[] args) {
		 Printer p = new Printer ();
		 p.assign();     // n1
		 p.declare();   // n2
	}

}
