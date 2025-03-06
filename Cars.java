public class Cars{
	static String carName ; 
	static String purchasePlace;
	static String colours[] = {"null","null"};

	public static void displayCars(){
		carName = "Porsche";
		purchasePlace = "Bengalore";
		colours[0] = "pink";
		colours[1] = "black";
			System.out.println("Car Name:"+carName);
			System.out.println("Purchased Place:" +purchasePlace);
		for(String colour : colours){
			System.out.println("cars Colours:" +colour);
		}
	}
}

/*public class Cars {
    public static void main(String[] args) {
        CarsRunner.displayCars(); // Correct method name and call
    }
}*/

/*public class Cars {
    static String carName; 
    static String purchasePlace; 
    static String colours[] = {"null", "null"};

    public static void displayCarsRunner() {
        CarsRunner.displayCarsRunner(); // Corrected method call
    }
}*/

