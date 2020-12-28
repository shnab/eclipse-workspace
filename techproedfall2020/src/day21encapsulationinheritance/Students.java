package day21encapsulationinheritance;

public class Students {
	
	private String address = "Miami, Florida"; //getter + setter
	private String name= "Ali Can"; //getter + setter
	private String ssn = "123456789"; //getter + setter

	public static void main(String[] args) {

		
	}
	public String getAddress() {
		return address;
		
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return "*****" + ssn.substring(5);
	}
	
	public void setSsn(String ssn) {
	this.ssn = ssn;
}
	

}
