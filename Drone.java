public class Drone {
     int id;
     String name;
     String manufacturer;
     String country;
     double weight; 
     String powerSource;
     String type;
     String primaryUse;
     double flightTime; 
     String designer;
     int releaseYear;
     String color;
     String navigationSystem;
     int numberOfRotors;
     String batteryType;
     double maxSpeed;
     String specialFeature;
     String controlType;
     double range; 
     String cameraFeatures;
     String droneCategory;

    public Drone(int id, String name, String manufacturer, String country, double weight, String powerSource, 
                 String type, String primaryUse, double flightTime, String designer, int releaseYear, String color, 
                 String navigationSystem, int numberOfRotors, String batteryType, double maxSpeed, 
                 String specialFeature, String controlType, double range, String cameraFeatures, 
                 String droneCategory) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.country = country;
        this.weight = weight;
        this.powerSource = powerSource;
        this.type = type;
        this.primaryUse = primaryUse;
        this.flightTime = flightTime;
        this.designer = designer;
        this.releaseYear = releaseYear;
        this.color = color;
        this.navigationSystem = navigationSystem;
        this.numberOfRotors = numberOfRotors;
        this.batteryType = batteryType;
        this.maxSpeed = maxSpeed;
        this.specialFeature = specialFeature;
        this.controlType = controlType;
        this.range = range;
        this.cameraFeatures = cameraFeatures;
        this.droneCategory = droneCategory;
    }

    public void droneDetails() {
        System.out.println("Drone ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Weight (kg): " + weight);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Type: " + type);
        System.out.println("Primary Use: " + primaryUse);
        System.out.println("Flight Time (minutes): " + flightTime);
        System.out.println("Designer: " + designer);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Color: " + color);
        System.out.println("Navigation System: " + navigationSystem);
        System.out.println("Number of Rotors: " + numberOfRotors);
        System.out.println("Battery Type: " + batteryType);
        System.out.println("Max Speed (km/h): " + maxSpeed);
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Control Type: " + controlType);
        System.out.println("Range (km): " + range);
        System.out.println("Camera Features: " + cameraFeatures);
        System.out.println("Drone Category: " + droneCategory);
    }
}