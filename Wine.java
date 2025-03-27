public class Wine {
    String name;
    String type;
    double volume;
    double price;
    String producerName;
    String buyerName;
    String grapeVariety;
    String region;
    int vintage;

    public Wine() {

    }

    public Wine(String name) {
        this.name = name;
    }

    public Wine(String name, String type) {
        this(name);
        this.type = type;
    }

    public Wine(String name, String type, double volume) {
        this(name, type);
        this.volume = volume;
    }

    public Wine(String name, String type, double volume, double price) {
        this(name, type, volume);
        this.price = price;
    }

    public Wine(String name, String type, double volume, double price, String producerName) {
        this(name, type, volume, price);
        this.producerName = producerName;
    }

    public Wine(String name, String type, double volume, double price, String producerName, String buyerName) {
        this(name, type, volume, price, producerName);
        this.buyerName = buyerName;
    }

    public Wine(String name, String type, double volume, double price, String producerName, String buyerName, String grapeVariety) {
        this(name, type, volume, price, producerName, buyerName);
        this.grapeVariety = grapeVariety;
    }

    public Wine(String name, String type, double volume, double price, String producerName, String buyerName, String grapeVariety, String region) {
        this(name, type, volume, price, producerName, buyerName, grapeVariety);
        this.region = region;
    }

    public Wine(String name, String type, double volume, double price, String producerName, String buyerName, String grapeVariety, String region, int vintage) {
        this(name, type, volume, price, producerName, buyerName, grapeVariety, region);
        this.vintage = vintage;
    }

    public void info() {
        System.out.println("Wine Details:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Volume: " + volume + " liters");
        System.out.println("Price: $" + price);
        System.out.println("Producer Name: " + producerName);
        System.out.println("Buyer Name: " + buyerName);
        System.out.println("Grape Variety: " + grapeVariety);
        System.out.println("Region: " + region);
        System.out.println("Vintage: " + vintage);
        System.out.println("---------------------");
    }
}

