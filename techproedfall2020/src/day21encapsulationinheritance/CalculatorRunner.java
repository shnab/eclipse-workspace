package day21encapsulationinheritance;

public class CalculatorRunner {

	public static void main(String[] args) { // Main class olamdan diger class'lardan deger cagiramayiz.
											// Ayrica runner direkt  calismasi icin diger classlari static yaptik. 
											// Yoksa runner icerisinde object olusturmamiz gerekirdi

		SimpleCalculator.add(3, 5, 7); //The sum is 15.0


		NormalCalculator.absolute(-12); //12.0
		NormalCalculator.sqrRood(16); //4.0
		NormalCalculator.divide(12,4); //The result is 3.0
		
		AdvancedCalculator.exponent(2, 3); //8
		AdvancedCalculator.sqrRood(-16); //Square root does not with negative number
		AdvancedCalculator.subtract(2, 1.2); //The result is 0.8
	}

}
