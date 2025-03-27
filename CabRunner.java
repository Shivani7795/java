public class CabRunner {
    public static void main(String[] args) {
        Cab cab1 = new Cab(101, "Sedan", "Toyota", "White", "KA01AB1234", "Rajesh", "Petrol",
                           "Automatic", "Available", "4.5 Stars", 4, 2, 15.5, 18.0, 500.0, 2500.0,
                           "Bengaluru", "Mysuru", "Shivani", "Arnav");

        Cab cab2 = new Cab(102, "SUV", "Hyundai", "Black", "KA02CD5678", "Anil", "Diesel",
                           "Manual", "Unavailable", "4.0 Stars", 7, 4, 20.0, 15.5, 600.0, 3000.0,
                           "Bengaluru", "Coorg", "Kabir", "Kiara");

        Cab cab3 = new Cab(103, "Hatchback", "Maruti Suzuki", "Red", "KA03EF9101", "Suresh", "CNG",
                           "Automatic", "Available", "3.8 Stars", 5, 3, 12.0, 25.0, 300.0, 2000.0,
                           "Bengaluru", "Ooty", "Ananya", "Aarav");

        cab1.cabDetails();
        System.out.println("-------------------------------------------"); 
        cab2.cabDetails();
        System.out.println("-------------------------------------------"); 
        cab3.cabDetails();
    }
}