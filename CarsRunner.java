public class CarsRunner{
	
	public static void main(String[] args){
		Cars.displayCars();

	}
}

/*public class CarsRunner {
    static String carName; 
    static String purchasePlace;
    static String colours[] = {"null", "null"};

    public static void displayCars() {
        carName = "Porsche"; // Corrected string literals
        purchasePlace = "Bangalore"; // Corrected string literals
        colours[0] = "pink"; // Corrected string literals
        colours[1] = "black"; // Corrected string literals

        // Print details
        System.out.println("Car Name: " + carName);
        System.out.println("Purchased Place: " + purchasePlace);
        for (String colour : colours) {
            System.out.println("Car Colour: " + colour); // Corrected variable name
        }
    }
}*/


/*public class CarsRunner {
    public static void main(String[] args) {
        Cars.carName = "Porsche"; // Corrected: Added quotes around string literals
        Cars.purchasePlace = "Bangalore"; // Corrected: Added quotes around string literals
        Cars.colours[0] = "pink"; // Corrected: Added quotes around string literals
        Cars.colours[1] = "black"; // Corrected: Added quotes around string literals

        // Print car details
        System.out.println("Car Name: " + Cars.carName);
        System.out.println("Purchased Place: " + Cars.purchasePlace);
        for (String colour : Cars.colours) { // Corrected loop variable and array access
            System.out.println("Car Colour: " + colour);
        }
    }
}*/
