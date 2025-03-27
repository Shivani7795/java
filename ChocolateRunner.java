public class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate chocolate1 = new Chocolate(1, "Dairy Milk", "Cadbury", "India", 150.0, "Milk Chocolate", 
                                             "Rectangle", 2.0, "John Cadbury", 1905, "Purple", 
                                             "Hazelnut", "Plastic Wrapper", 100.0, "Sweet", 
                                             "High Quality", "Room Temperature", true, 
                                             "Vegetarian", "Children");

        Chocolate chocolate2 = new Chocolate(2, "KitKat", "Nestle", "Switzerland", 45.0, "Wafer Chocolate", 
                                             "Bar", 1.0, "Henri Nestle", 1935, "Red", 
                                             "Crunchy", "Foil Wrapper", 70.0, "Sweet", 
                                             "Crispy Layers", "Room Temperature", true, 
                                             "Vegetarian", "Snack Lovers");

        Chocolate chocolate3 = new Chocolate(3, "Lindt", "Lindt & Sprüngli", "Switzerland", 200.0, "Dark Chocolate", 
                                             "Sphere", 3.0, "Rodolphe Lindt", 1845, "Gold", 
                                             "Bitter", "Luxury Box", 90.0, "Semi-Sweet", 
                                             "Smooth Finish", "Cool Temperature", false, 
                                             "Non-Vegetarian", "Gourmet Enthusiasts");

        chocolate1.chocolateDetails();
        System.out.println("-------------------------------------------");
        chocolate2.chocolateDetails();
        System.out.println("-------------------------------------------");
        chocolate3.chocolateDetails();
    }
}