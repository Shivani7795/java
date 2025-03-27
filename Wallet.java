public class Wallet {
    String name;
    String color;
    String type;
    double price;
    String ownerName;
    String buyerName;
    String material;
    String dimensions;
    int compartments;

    public Wallet() {

    }

    public Wallet(String name) {
        this.name = name;
    }

    public Wallet(String name, String color) {
        this(name);
        this.color = color;
    }

    public Wallet(String name, String color, String type) {
        this(name, color);
        this.type = type;
    }

    public Wallet(String name, String color, String type, double price) {
        this(name, color, type);
        this.price = price;
    }

    public Wallet(String name, String color, String type, double price, String ownerName) {
        this(name, color, type, price);
        this.ownerName = ownerName;
    }

    public Wallet(String name, String color, String type, double price, String ownerName, String buyerName) {
        this(name, color, type, price, ownerName);
        this.buyerName = buyerName;
    }

    public Wallet(String name, String color, String type, double price, String ownerName, String buyerName, String material) {
        this(name, color, type, price, ownerName, buyerName);
        this.material = material;
    }

    public Wallet(String name, String color, String type, double price, String ownerName, String buyerName, String material, String dimensions) {
        this(name, color, type, price, ownerName, buyerName, material);
        this.dimensions = dimensions;
    }

    public Wallet(String name, String color, String type, double price, String ownerName, String buyerName, String material, String dimensions, int compartments) {
        this(name, color, type, price, ownerName, buyerName, material, dimensions);
        this.compartments = compartments;
    }

    public void info() {
        System.out.println("Wallet Details:");
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Buyer Name: " + buyerName);
        System.out.println("Material: " + material);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Compartments: " + compartments);
        System.out.println("---------------------");
    }
}

