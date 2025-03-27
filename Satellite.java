public class Satellite {
     int id;
     String name;
     String organization;
     String countryOfOrigin;
     double weight;
     String primaryFunction;
     int launchYear;
     String orbitType;
     String payloadType;
     double orbitAltitude; 
     String powerSource;
     String specialFeature;
     boolean operationalStatus;
     double orbitalSpeed;
     double eccentricity;
     String launchSite;
     String signalType;
     String purpose;

    public Satellite(int id, String name, String organization, String countryOfOrigin, double weight, 
                     String primaryFunction, int launchYear, String orbitType, String payloadType, 
                     double orbitAltitude, String powerSource, String specialFeature, boolean operationalStatus, 
                     double orbitalSpeed, double eccentricity, String launchSite, String signalType, 
                     String purpose) {
        this.id = id;
        this.name = name;
        this.organization = organization;
        this.countryOfOrigin = countryOfOrigin;
        this.weight = weight;
        this.primaryFunction = primaryFunction;
        this.launchYear = launchYear;
        this.orbitType = orbitType;
        this.payloadType = payloadType;
        this.orbitAltitude = orbitAltitude;
        this.powerSource = powerSource;
        this.specialFeature = specialFeature;
        this.operationalStatus = operationalStatus;
        this.orbitalSpeed = orbitalSpeed;
        this.eccentricity = eccentricity;
        this.launchSite = launchSite;
        this.signalType = signalType;
        this.purpose = purpose;
    }

    public void satelliteDetails() {
        System.out.println("Satellite ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Organization: " + organization);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Weight (kg): " + weight);
        System.out.println("Primary Function: " + primaryFunction);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Payload Type: " + payloadType);
        System.out.println("Orbit Altitude (km): " + orbitAltitude);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Operational Status: " + (operationalStatus ? "Active" : "Inactive"));
        System.out.println("Orbital Speed (km/s): " + orbitalSpeed);
        System.out.println("Eccentricity: " + eccentricity);
        System.out.println("Launch Site: " + launchSite);
        System.out.println("Signal Type: " + signalType);
        System.out.println("Purpose: " + purpose);
    }
}