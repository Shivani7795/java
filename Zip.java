public class Zip {
     int id;
     String brand;
     String countryOfOrigin;
     String material;
     String type;
     String color;
     double length; 
     double width; 
     String mechanism;
     String inventor;
     int yearIntroduced;
     boolean reusable;
     String flexibility;
     String pullerType;
     double strength; 
     String usage;
     String specialFeature;
     String durability;
     String ecoFriendly;
     String category;

    public Zip(int id, String brand, String countryOfOrigin, String material, String type, String color, double length, 
               double width, String mechanism, String inventor, int yearIntroduced, boolean reusable, 
               String flexibility, String pullerType, double strength, String usage, String specialFeature, 
               String durability, String ecoFriendly, String category) {
        this.id = id;
        this.brand = brand;
        this.countryOfOrigin = countryOfOrigin;
        this.material = material;
        this.type = type;
        this.color = color;
        this.length = length;
        this.width = width;
        this.mechanism = mechanism;
        this.inventor = inventor;
        this.yearIntroduced = yearIntroduced;
        this.reusable = reusable;
        this.flexibility = flexibility;
        this.pullerType = pullerType;
        this.strength = strength;
        this.usage = usage;
        this.specialFeature = specialFeature;
        this.durability = durability;
        this.ecoFriendly = ecoFriendly;
        this.category = category;
    }

    public void zipDetails() {
        System.out.println("Zip ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Material: " + material);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Length (cm): " + length);
        System.out.println("Width (cm): " + width);
        System.out.println("Mechanism: " + mechanism);
        System.out.println("Inventor: " + inventor);
        System.out.println("Year Introduced: " + yearIntroduced);
        System.out.println("Reusable: " + (reusable ? "Yes" : "No"));
        System.out.println("Flexibility: " + flexibility);
        System.out.println("Puller Type: " + pullerType);
        System.out.println("Strength (kg): " + strength);
        System.out.println("Usage: " + usage);
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Durability: " + durability);
        System.out.println("Eco-Friendly: " + ecoFriendly);
        System.out.println("Category: " + category);
    }
}