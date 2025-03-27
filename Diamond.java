public class Diamond {
    String name;
    double carat;
    String color;
    String clarity;
    double price;
    String ownerName;
    String buyerName;
    String origin;
    String cutType;
    boolean certified;

    public Diamond() {

    }

    public Diamond(String name) {
        this.name = name;
    }

    public Diamond(String name, double carat) {
        this(name);
        this.carat = carat;
    }

    public Diamond(String name, double carat, String color) {
        this(name, carat);
        this.color = color;
    }

    public Diamond(String name, double carat, String color, String clarity) {
        this(name, carat, color);
        this.clarity = clarity;
    }

    public Diamond(String name, double carat, String color, String clarity, double price) {
        this(name, carat, color, clarity);
        this.price = price;
    }

    public Diamond(String name, double carat, String color, String clarity, double price, String ownerName) {
        this(name, carat, color, clarity, price);
        this.ownerName = ownerName;
    }

    public Diamond(String name, double carat, String color, String clarity, double price, String ownerName, String buyerName) {
        this(name, carat, color, clarity, price, ownerName);
        this.buyerName = buyerName;
    }

    public Diamond(String name, double carat, String color, String clarity, double price, String ownerName, String buyerName, String origin) {
        this(name, carat, color, clarity, price, ownerName, buyerName);
        this.origin = origin;
    }

    public Diamond(String name, double carat, String color, String clarity, double price, String ownerName, String buyerName, String origin, String cutType) {
        this(name, carat, color, clarity, price, ownerName, buyerName, origin);
        this.cutType = cutType;
    }

    public Diamond(String name, double carat, String color, String clarity, double price, String ownerName, String buyerName, String origin, String cutType, boolean certified) {
        this(name, carat, color, clarity, price, ownerName, buyerName, origin, cutType);
        this.certified = certified;
    }

    public void info() {
        System.out.println("Diamond Details:");
        System.out.println("Name: " + name);
        System.out.println("Carat: " + carat);
        System.out.println("Color: " + color);
        System.out.println("Clarity: " + clarity);
        System.out.println("Price: " + price);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Buyer Name: " + buyerName);
        System.out.println("Origin: " + origin);
        System.out.println("Cut Type: " + cutType);
        System.out.println("Certified: " + (certified ? "Yes" : "No"));
        System.out.println("---------------------");
    }
}

