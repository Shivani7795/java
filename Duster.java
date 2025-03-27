public class Duster {
     int dusterId;
     String brand;
     String material;
     String color;
     String shape;
     String usageType;
     String handleType;
     String gripType;
     String ownerName;
     String buyerName;
     double length;
     double width;
     double weight;
     double price;
     double warrantyYears;
     double tax;
     String cleaningType;
     String dustType;
     String durability;
     String availability;

    public Duster(int dusterId, String brand, String material, String color, String shape, String usageType,
                  String handleType, String gripType, String ownerName, String buyerName, double length,
                  double width, double weight, double price, double warrantyYears, double tax,
                  String cleaningType, String dustType, String durability, String availability) {
        this.dusterId = dusterId;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.usageType = usageType;
        this.handleType = handleType;
        this.gripType = gripType;
        this.ownerName = ownerName;
        this.buyerName = buyerName;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.price = price;
        this.warrantyYears = warrantyYears;
        this.tax = tax;
        this.cleaningType = cleaningType;
        this.dustType = dustType;
        this.durability = durability;
        this.availability = availability;
    }

    public void dusterDetails() {
        System.out.println("Duster Details:");
        System.out.println("Duster ID: " + dusterId);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Handle Type: " + handleType);
        System.out.println("Grip Type: " + gripType);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Buyer Name: " + buyerName);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Tax: " + tax);
        System.out.println("Cleaning Type: " + cleaningType);
        System.out.println("Dust Type: " + dustType);
        System.out.println("Durability: " + durability);
        System.out.println("Availability: " + availability);
    }
}