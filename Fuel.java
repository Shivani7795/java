//Write a Java program to determine the type of fuel needed for a vehicle based on the engine type (Petrol, Diesel, Electric).
public class Fuel{
	public static void main(String args[]){
		String vehicle ="Electrical";
		
		if (vehicle.equals("Diesel Engine")){
			System.out.println("The Fuel needed for this Vehicle is Diesel");
		}
		
		else if(vehicle.equals("petrol Engine")){
			System.out.println("The Fuel needed for this Vehicle is petrol");
		}
		else{
			System.out.println("Fuel not needed");
		}
	}
}

