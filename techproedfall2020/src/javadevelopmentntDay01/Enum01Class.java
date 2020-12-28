package javadevelopmentntDay01;

public class Enum01Class {

	public static void main(String[] args) {
		
		Enum01 browserName = Enum01.CHROME;
		
		switch (browserName) {
		case CHROME:
			System.out.println("Chrome Browser is running..args.");
			break;
		case SAFARI:
			System.out.println("SAFARI Browser is running..args.");
			break;
		case IE:
			System.out.println("IE Browser is running..args.");
			break;
		case FIREFOX:
			System.out.println("FIREFOX Browser is running..args.");
			break;
		case OPERA:
			System.out.println("OPERA Browser is running..args.");
			break;
		default:
			System.out.println("Invalid Browser name");
			
		}

	}

}
