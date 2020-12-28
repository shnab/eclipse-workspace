package day27abstractiondt;

public class Crv extends Honda{

	@Override
	public void engine() {
		System.out.println("2.5 super Turbo");

		
	}

	@Override
	public void ac() {
		System.out.println("Climate AC");
		
	}

	@Override
	public void leather() {
		System.out.println("Genuine leather seats");
	}

}
