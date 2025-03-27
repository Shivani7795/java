public class Poster {
    String name;
    int quantity;
    String type;
    String color;
    double price;
    String ownerName;
    String buyerName;
    String material;
    String dimensions;
    String theme;

    public Poster() {

    }

    public Poster(String name) {
        this.name = name;
    }

    public Poster(String name, int quantity) {
        this(name);
        this.quantity = quantity;
    }

    public Poster(String name, int quantity, String type) {
        this(name, quantity);
        this.type = type;
    }

    public Poster(String name, int quantity, String type, String color) {
        this(name, quantity, type);
        this.color = color;
    }

    public Poster(String name, int quantity, String type, String color, double price) {
        this(name, quantity, type, color);
        this.price = price;
    }

    public Poster(String name, int quantity, String type, String color, double price, String ownerName) {
        this(name, quantity, type, color, price);
        this.ownerName = ownerName;
    }

    public Poster(String name, int quantity, String type, String color, double price, String ownerName, String buyerName) {
        this(name, quantity, type, color, price, ownerName);
        this.buyerName = buyerName;
    }

    public Poster(String name, int quantity, String type, String color, double price, String ownerName, String buyerName, String material) {
        this(name, quantity, type, color, price, ownerName, buyerName);
        this.material = material;
    }

    public Poster(String name, int quantity, String type, String color, double price, String ownerName, String buyerName, String material, String dimensions) {
        this(name, quantity, type, color, price, ownerName, buyerName, material);
        this.dimensions = dimensions;
    }

    public Poster(String name, int quantity, String type, String color, double price, String ownerName, String buyerName, String material, String dimensions, String theme) {
        this(name, quantity, type, color, price, ownerName, buyerName, material, dimensions);
        this.theme = theme;
    }

    public void info() {
        System.out.println("Poster Details:");
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Buyer Name: " + buyerName);
        System.out.println("Material: " + material);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Theme: " + theme);
        System.out.println("---------------------");
    }
}

