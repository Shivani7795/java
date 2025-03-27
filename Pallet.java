public class Pallet {
    String name;
    int quantity;
    String type;
    String color;
    double price;
    String ownerName;
    String buyerName;
    String material;
    String dimensions;
    double loadCapacity;

    public Pallet() {

    }

    public Pallet(String name) {
        this.name = name;
    }

    public Pallet(String name, int quantity) {
        this(name);
        this.quantity = quantity;
    }

    public Pallet(String name, int quantity, String type) {
        this(name, quantity);
        this.type = type;
    }

    public Pallet(String name, int quantity, String type, String color) {
        this(name, quantity, type);
        this.color = color;
    }

    public Pallet(String name, int quantity, String type, String color, double price) {
        this(name, quantity, type, color);
        this.price = price;
    }

    public Pallet(String name, int quantity, String type, String color, double price, String ownerName) {
        this(name, quantity, type, color, price);
        this.ownerName = ownerName;
    }

    public Pallet(String name, int quantity, String type, String color, double price, String ownerName, String buyerName) {
        this(name, quantity, type, color, price, ownerName);
        this.buyerName = buyerName;
    }

    public Pallet(String name, int quantity, String type, String color, double price, String ownerName, String buyerName, String material) {
        this(name, quantity, type, color, price, ownerName, buyerName);
        this.material = material;
    }

    public Pallet(String name, int quantity, String type, String color, double price, String ownerName, String buyerName, String material, String dimensions) {
        this(name, quantity, type, color, price, ownerName, buyerName, material);
        this.dimensions = dimensions;
    }

    public Pallet(String name, int quantity, String type, String color, double price, String ownerName, String buyerName, String material, String dimensions, double loadCapacity) {
        this(name, quantity, type, color, price, ownerName, buyerName, material, dimensions);
        this.loadCapacity = loadCapacity;
    }

    public void info() {
        System.out.println("Pallet Details:");
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Buyer Name: " + buyerName);
        System.out.println("Material: " + material);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Load Capacity: " + loadCapacity + " kg");
        System.out.println("---------------------");
    }
}

public class PalletRunner {
    public static void main(String args[]) {
        Pallet pallet = new Pallet("Heavy-Duty", 100, "Wooden", "Brown", 5000.0, "Shivani", "Aryan", "Pine Wood", "120x100x15 cm", 2000.0);

        pallet.info();
    }
}