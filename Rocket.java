public class Rocket {
     int id;
     String name;
     String organization;
     String country;
     double weight; 
     String fuelType;
     String reusability;
     String missionType;
     double payloadCapacity; 
     String designer;
     int launchYear;
     String launchOrientation;
     int numberOfStages;
     int numberOfBoosters;
     String engineType;
     String aerodynamicDesign;
     double launchCost; 
     String launchSite;
     double orbitalVelocity; 
     String primaryPurpose;

    public Rocket(int id, String name, String organization, String country, double weight, String fuelType,
                  String reusability, String missionType, double payloadCapacity, String designer, int launchYear,
                  String launchOrientation, int numberOfStages, int numberOfBoosters, String engineType,
                  String aerodynamicDesign, double launchCost, String launchSite, double orbitalVelocity,
                  String primaryPurpose) {
        this.id = id;
        this.name = name;
        this.organization = organization;
        this.country = country;
        this.weight = weight;
        this.fuelType = fuelType;
        this.reusability = reusability;
        this.missionType = missionType;
        this.payloadCapacity = payloadCapacity;
        this.designer = designer;
        this.launchYear = launchYear;
        this.launchOrientation = launchOrientation;
        this.numberOfStages = numberOfStages;
        this.numberOfBoosters = numberOfBoosters;
        this.engineType = engineType;
        this.aerodynamicDesign = aerodynamicDesign;
        this.launchCost = launchCost;
        this.launchSite = launchSite;
        this.orbitalVelocity = orbitalVelocity;
        this.primaryPurpose = primaryPurpose;
    }

    public void rocketDetails() {
        System.out.println("Rocket ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Organization: " + organization);
        System.out.println("Country: " + country);
        System.out.println("Weight (tons): " + weight);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Reusability: " + reusability);
        System.out.println("Mission Type: " + missionType);
        System.out.println("Payload Capacity (tons): " + payloadCapacity);
        System.out.println("Designer: " + designer);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Launch Orientation: " + launchOrientation);
        System.out.println("Number of Stages: " + numberOfStages);
        System.out.println("Number of Boosters: " + numberOfBoosters);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Aerodynamic Design: " + aerodynamicDesign);
        System.out.println("Launch Cost (Million USD): " + launchCost);
        System.out.println("Launch Site: " + launchSite);
        System.out.println("Orbital Velocity (km/h): " + orbitalVelocity);
        System.out.println("Primary Purpose: " + primaryPurpose);
    }
}