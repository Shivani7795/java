public class Tab{
    int id;
    int ramSize;
    int numberOfPorts;
    int price;
    double screenSize;
    double memorySize; 
    double batteryCapacity;
    String brand;
    String operatingSystem;
    String processorType;
    String color;
    String connectivityType;
    String displayType;
    String material;
    String cameraType;
    String buildQuality;
    String warrantyType;
    String modelName;
    String storageType;
    String ownerName;
    String buyerName;
    
    public Tab(int id, double screenSize, double memorySize, double batteryCapacity, String brand, String operatingSystem,
               String processorType, String color, String connectivityType, String displayType, String material, 
               String cameraType, String buildQuality, String warrantyType, String modelName, String storageType, 
               String ownerName, String buyerName, int ramSize, int numberOfPorts, int price) {
        this.id = id;
        this.screenSize = screenSize;
        this.memorySize = memorySize;
        this.batteryCapacity = batteryCapacity;
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.processorType = processorType;
        this.color = color;
        this.connectivityType = connectivityType;
        this.displayType = displayType;
        this.material = material;
        this.cameraType = cameraType;
        this.buildQuality = buildQuality;
        this.warrantyType = warrantyType;
        this.modelName = modelName;
        this.storageType = storageType;
        this.ownerName = ownerName;
        this.buyerName = buyerName;
        this.ramSize = ramSize;
        this.numberOfPorts = numberOfPorts;
        this.price = price;
    }

    public void tabDetails() {
        System.out.println("Tab Details:");
        System.out.println("ID: " + id);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Memory Size: " + memorySize);
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Brand: " + brand);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Processor Type: " + processorType);
        System.out.println("Color: " + color);
        System.out.println("Connectivity Type: " + connectivityType);
        System.out.println("Display Type: " + displayType);
        System.out.println("Material: " + material);
        System.out.println("Camera Type: " + cameraType);
        System.out.println("Build Quality: " + buildQuality);
        System.out.println("Warranty Type: " + warrantyType);
        System.out.println("Model Name: " + modelName);
        System.out.println("Storage Type: " + storageType);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Buyer Name: " + buyerName);
        System.out.println("RAM Size: " + ramSize);
        System.out.println("Number of Ports: " + numberOfPorts);
        System.out.println("Price: " + price);
    }
}