public class AK47 {
    int id;
    String colour;
    int bullets;
    String producerName;
    String buyerName;
    double weight;
    double length;
    String holderType;
    int warranty;
    int usedIn;

    public AK47() {

    }

    public AK47(int id) {
        this.id = id;
    }

    public AK47(int id, String colour) {
        this(id);
        this.colour = colour;
    }

    public AK47(int id, String colour, int bullets) {
        this(id, colour);
        this.bullets = bullets;
    }

    public AK47(int id, String colour, int bullets, String producerName) {
        this(id, colour, bullets);
        this.producerName = producerName;
    }

    public AK47(int id, String colour, int bullets, String producerName, String buyerName) {
        this(id, colour, bullets, producerName);
        this.buyerName = buyerName;
    }

    public AK47(int id, String colour, int bullets, String producerName, String buyerName, double weight) {
        this(id, colour, bullets, producerName, buyerName);
        this.weight = weight;
    }

    public AK47(int id, String colour, int bullets, String producerName, String buyerName, double weight, double length) {
        this(id, colour, bullets, producerName, buyerName, weight);
        this.length = length;
    }

    public AK47(int id, String colour, int bullets, String producerName, String buyerName, double weight, double length, String holderType) {
        this(id, colour, bullets, producerName, buyerName, weight, length);
        this.holderType = holderType;
    }

    public AK47(int id, String colour, int bullets, String producerName, String buyerName, double weight, double length, String holderType, int warranty) {
        this(id, colour, bullets, producerName, buyerName, weight, length, holderType);
        this.warranty = warranty;
    }

    public AK47(int id, String colour, int bullets, String producerName, String buyerName, double weight, double length, String holderType, int warranty, int usedIn) {
        this(id, colour, bullets, producerName, buyerName, weight, length, holderType, warranty);
        this.usedIn = usedIn;
    }

    public void info() {
        System.out.println("AK47 Details:");
        System.out.println("ID: " + id);
        System.out.println("Colour: " + colour);
        System.out.println("Bullets: " + bullets);
        System.out.println("Producer Name: " + producerName);
        System.out.println("Buyer Name: " + buyerName);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Length: " + length + " cm");
        System.out.println("Holder Type: " + holderType);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Used In: " + usedIn);
        System.out.println("---------------------");
    }
}

