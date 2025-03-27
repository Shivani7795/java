public class ZipRunner {
    public static void main(String[] args) {
        Zip zip1 = new Zip(1, "YKK", "Japan", "Metal", "Closed End", "Silver", 15.0, 0.5, 
                           "Universal", "John Yamanobe", 1934, true, "Heavy Duty", 
                           "Plastic Puller", 50.0, "Jacket", "Durable", "Smooth Glide", 
                           "Eco-Friendly", "Apparel");

        Zip zip2 = new Zip(2, "IDEAL", "USA", "Plastic", "Open End", "Black", 20.0, 0.4, 
                           "Two-Way", "Alex Ideal", 1950, true, "Flexible", 
                           "Metal Puller", 30.0, "Bag", "Waterproof", "Rust Resistant", 
                           "High Strength", "Luggage");

        Zip zip3 = new Zip(3, "OPTI", "Germany", "Nylon", "Invisible", "White", 25.0, 0.3, 
                           "Lightweight", "Karl Opti", 1965, false, "Aesthetic", 
                           "Plastic Tab", 20.0, "Dress", "Seamless", "Soft Finish", 
                           "Eco-Friendly", "Fashion");

        zip1.zipDetails();
        System.out.println("-------------------------------------------");
        zip2.zipDetails();
        System.out.println("-------------------------------------------");
        zip3.zipDetails();
    }
}