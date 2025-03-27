public class Cab {
    int cabNumber;
    String cabType; 
    String brand;
    String color;
    String licensePlate;
    String driverName;
    String fuelType;
    String transmissionType;
    String availabilityStatus;
    String rating;
    int seatingCapacity;
    int luggageCapacity;
    double pricePerKm;
    double mileage;
    double tax;
    double insuranceCost;
    String location;
    String destination;
    String ownerName;
    String buyerName;

    public Cab(int cabNumber, String cabType, String brand, String color, String licensePlate, String driverName,
               String fuelType, String transmissionType, String availabilityStatus, String rating,
               int seatingCapacity, int luggageCapacity, double pricePerKm, double mileage, double tax, 
               double insuranceCost, String location, String destination, String ownerName, String buyerName) {
        this.cabNumber = cabNumber;
        this.cabType = cabType;
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
        this.driverName = driverName;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.availabilityStatus = availabilityStatus;
        this.rating = rating;
        this.seatingCapacity = seatingCapacity;
        this.luggageCapacity = luggageCapacity;
        this.pricePerKm = pricePerKm;
        this.mileage = mileage;
        this.tax = tax;
        this.insuranceCost = insuranceCost;
        this.location = location;
        this.destination = destination;
        this.ownerName = ownerName;
        this.buyerName = buyerName;
    }

    public void cabDetails() {
        System.out.println("Cab Details:");
        System.out.println("Cab Number: " + cabNumber);
        System.out.println("Cab Type: " + cabType);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println("Availability Status: " + availabilityStatus);
        System.out.println("Rating: " + rating);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Luggage Capacity: " + luggageCapacity);
        System.out.println("Price Per Km: " + pricePerKm);
        System.out.println("Mileage: " + mileage);
        System.out.println("Tax: " + tax);
        System.out.println("Insurance Cost: " + insuranceCost);
        System.out.println("Location: " + location);
        System.out.println("Destination: " + destination);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Buyer Name: " + buyerName);
    }
}