public class Computers {
    public static void describeComputer() {
        System.out.println("Computers are electronic devices capable of processing and storing data.");
    }

    public static void describeComputer(String type) {
        System.out.println("A " + type + " is a type of computer with specific use cases.");
    }

    public static void describeComputer(String type, String purpose) {
        System.out.println("A " + type + " is designed specifically for " + purpose + ".");
    }

    public static void describeComputer(String brand, int releaseYear) {
        System.out.println("The " + brand + " computer was released in the year " + releaseYear + ".");
    }

    public static void describeComputer(String type, String processor, int ram) {
        System.out.println("This " + type + " computer has a " + processor + " processor and " + ram + "GB of RAM.");
    }

    public static void describeComputer(String type, boolean isPortable) {
        System.out.println("The " + type + " is " + (isPortable ? "a portable device." : "not portable."));
    }

    public static void describeComputer(String type, String operatingSystem, boolean isUserFriendly) {
        System.out.println("The " + type + " runs on " + operatingSystem + " and it is " + (isUserFriendly ? "user-friendly." : "not very user-friendly."));
    }

    public static void describeComputer(String[] types) {
        System.out.println("Different types of computers include: ");
        for (String type : types) {
            System.out.println("- " + type);
        }
    }

    public static void describeComputer(String model, double screenSize, String resolution) {
        System.out.println("The " + model + " computer has a " + screenSize + "-inch screen with " + resolution + " resolution.");
    }

    public static void describeComputer(String processor, int cores, double clockSpeed) {
        System.out.println("The computer has a " + processor + " processor with " + cores + " cores running at " + clockSpeed + " GHz.");
    }

    // Additional methods
    public static void describeComputer(String type, double storage, String storageType) {
        System.out.println("This " + type + " computer has " + storage + "GB of " + storageType + " storage.");
    }

    public static void describeComputer(String type, boolean hasDedicatedGPU, String gpuName) {
        System.out.println("The " + type + " computer " + (hasDedicatedGPU ? "has a dedicated GPU: " + gpuName + "." : "does not have a dedicated GPU."));
    }

    public static void describeComputer(String type, String connectivity, int ports) {
        System.out.println("The " + type + " computer supports " + connectivity + " connectivity and has " + ports + " ports.");
    }

    public static void describeComputer(String type, int batteryLife) {
        System.out.println("The " + type + " has a battery life of " + batteryLife + " hours.");
    }

    public static void describeComputer(String brand, boolean isGaming, double weight) {
        System.out.println("The " + brand + " computer is " + (isGaming ? "a gaming computer." : "not designed for gaming.") + " It weighs " + weight + "kg.");
    }

    public static void describeComputer(String type, double price, String currency) {
        System.out.println("This " + type + " computer costs " + price + " " + currency + ".");
    }

    public static void describeComputer(String model, int warrantyYears) {
        System.out.println("The " + model + " computer comes with a warranty of " + warrantyYears + " years.");
    }

    public static void describeComputer(String type, String coolingSystem, boolean isEfficient) {
        System.out.println("The " + type + " computer uses a " + coolingSystem + " cooling system which is " + (isEfficient ? "efficient." : "not very efficient."));
    }

    public static void describeComputer(String type, char startingLetter) {
        System.out.println("The " + type + " computer's model starts with the letter '" + startingLetter + "'.");
    }

    public static void main(String[] args) {
        describeComputer();
        describeComputer("Desktop");
        describeComputer("Laptop", "personal and professional use");
        describeComputer("Apple", 2020);
        describeComputer("Gaming PC", "Intel i9", 16);
        describeComputer("Tablet", true);
        describeComputer("Server", "Linux", true);
        describeComputer(new String[]{"Desktop", "Laptop", "Tablet", "Server"});
        describeComputer("MacBook Pro", 13.3, "Retina 2560x1600");
        describeComputer("Ryzen 7", 8, 3.6);
        describeComputer("Ultrabook", 512, "SSD");
        describeComputer("Workstation", true, "NVIDIA RTX 3080");
        describeComputer("All-in-One", "Wi-Fi 6", 5);
        describeComputer("Hybrid Laptop", 10);
        describeComputer("Dell", false, 2.5);
        describeComputer("Chromebook", 499.99, "USD");
        describeComputer("Surface Pro", 2);
        describeComputer("Gaming Laptop", "liquid cooling", true);
        describeComputer("Desktop", 'D');
    }
}
