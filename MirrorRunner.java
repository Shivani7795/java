public class MirrorRunner {
    public static void main(String[] args) {
        Mirror mirror1 = new Mirror(1, 150.0, 70.0, 0.5, "Dell", "Wood", "Oval", "Black",
                                    "Vanity", "Modern", 3.0, "Bedroom", 5, "Rounded", "Wall Fixed", 2000.0, 180.0,
                                    "flipkart", "Shivani", "Arnav");

        Mirror mirror2 = new Mirror(2, 180.0, 80.0, 0.8, "Lenovo", "Metal", "Rectangular", "Silver",
                                    "Decorative", "Vintage", 5.0, "Bathroom", 7, "Sharp Edges", "Floor Mounted", 3500.0, 300.0,
                                    "Amazon", "Ananya", "Aarav");

        Mirror mirror3 = new Mirror(3, 200.0, 100.0, 1.0, "Asus", "Plastic", "Circular", "White",
                                    "Utility", "Minimal", 2.5, "Living Room", 3, "Flat Corners", "Ceiling Mounted", 1500.0, 100.0,
                                    "any website", "Kabir", "Kiara");

        mirror1.mirrorDetails();
        System.out.println("-------------------------------------------"); 
        mirror2.mirrorDetails();
        System.out.println("-------------------------------------------"); 
        mirror3.mirrorDetails();
    }
}