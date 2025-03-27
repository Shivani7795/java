public class DusterRunner {
    public static void main(String[] args) {
        Duster duster1 = new Duster(1, "CleanPlus", "Plastic", "Blue", "Rectangular", "Dry Cleaning",
                                    "Long Handle", "Rubber Grip", "Shivani", "Rahul", 15.0, 8.0, 0.5, 200.0,
                                    2, 18.0, "Floor Cleaning", "Fine Dust", "High", "In Stock");

        Duster duster2 = new Duster(2, "DustAway", "Metal", "Green", "Round", "Wet Cleaning",
                                    "Short Handle", "Foam Grip", "Ananya", "Aarav", 12.0, 6.0, 0.8, 300.0,
                                    3, 25.0, "Wall Cleaning", "Coarse Dust", "Medium", "Out of Stock");

        Duster duster3 = new Duster(3, "SupremeDuster", "Wood", "Red", "Square", "All Purpose",
                                    "Ergonomic Handle", "Textured Grip", "Kabir", "Kiara", 20.0, 10.0, 1.2, 400.0,
                                    5, 30.0, "Window Cleaning", "Liquid Spills", "Very High", "In Stock");

        duster1.dusterDetails();
        System.out.println("-------------------------------------------"); 
        duster2.dusterDetails();
        System.out.println("-------------------------------------------"); 
        duster3.dusterDetails();
    }
}