package javadevelopmentdtDay05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationOfObjects {

	public static void main(String[] args) {
		
		//to good read, we use Serialization, otherwise we  can see some characters in the file

		Vehicle bike = new Vehicle ("Bike", 1234);//IV
		Vehicle car = new Vehicle ("Car", 9876);
		Vehicle bus = new Vehicle ("Bus", 5678);
		
		try (FileOutputStream fos = new  FileOutputStream("src/Vehicle.dat")){//V
			
			try (ObjectOutputStream obj = new ObjectOutputStream(fos)) {//VII
				obj.writeObject(bike);
				obj.writeObject(car);
				obj.writeObject(bus);
				System.out.println("Objects are written into the file..");
			}
			
		} catch (FileNotFoundException e) {//VI
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

//If you want to write the objects of any class, the class has to  implement "Serializable" interface from the class
// Otherwise, you can get runTime Exception which is NotSerializableException:

class Vehicle implements Serializable{//I

	private static final long serialVersionUID = 1L;//VIII==> This is version ID
	
	
	private String type; 
	private int number;
	public Vehicle(String type, int number) {//II
		this.type = type;
		this.number = number;
	}
	@Override
	public String toString() {//III
		return "Vehicle [type=" + type + ", number=" + number + "]";
	} 
	
}

class readObject {
	
	public static void main(String[] args) throws ClassNotFoundException {
		try(FileInputStream fis = new FileInputStream("src/Vehicle.dat")) {
			
			try(ObjectInputStream obj = new ObjectInputStream(fis)) {
				
				Vehicle vBike = (Vehicle) obj.readObject();
				Vehicle vCar = (Vehicle) obj.readObject();
				Vehicle vBus = (Vehicle) obj.readObject();
				
				System.out.println(vBike);
				System.out.println(vCar);
				System.out.println(vBus);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


















