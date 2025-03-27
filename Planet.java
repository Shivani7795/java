public class Planet {
     int id;
     String name;
     String system;
     double radius; 
     double mass; 
     String atmosphere;
     String type;
     boolean supportsLife;
     int numberOfMoons;
     double orbitalPeriod;
     String star;
     String surfaceComposition;
     int percentageWater; 
     String specialFeature;
     String climaticPattern;
     String geologicalActivity;
     String temperatureRange;
     String atmosphericEffect;
     String notableFor;

    public Planet(int id, String name, String system, double radius, double mass, String atmosphere, String type, 
                  boolean supportsLife, int numberOfMoons, double orbitalPeriod, String star, 
                  String surfaceComposition, int percentageWater, String specialFeature, 
                  String climaticPattern, String geologicalActivity, String temperatureRange, 
                  String atmosphericEffect, String notableFor) {
        this.id = id;
        this.name = name;
        this.system = system;
        this.radius = radius;
        this.mass = mass;
        this.atmosphere = atmosphere;
        this.type = type;
        this.supportsLife = supportsLife;
        this.numberOfMoons = numberOfMoons;
        this.orbitalPeriod = orbitalPeriod;
        this.star = star;
        this.surfaceComposition = surfaceComposition;
        this.percentageWater = percentageWater;
        this.specialFeature = specialFeature;
        this.climaticPattern = climaticPattern;
        this.geologicalActivity = geologicalActivity;
        this.temperatureRange = temperatureRange;
        this.atmosphericEffect = atmosphericEffect;
        this.notableFor = notableFor;
    }

    public void planetDetails() {
        System.out.println("Planet ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("System: " + system);
        System.out.println("Radius (km): " + radius);
        System.out.println("Mass (kg): " + mass);
        System.out.println("Atmosphere: " + atmosphere);
        System.out.println("Type: " + type);
        System.out.println("Supports Life: " + (supportsLife ? "Yes" : "No"));
        System.out.println("Number of Moons: " + numberOfMoons);
        System.out.println("Orbital Period (days): " + orbitalPeriod);
        System.out.println("Star: " + star);
        System.out.println("Surface Composition: " + surfaceComposition);
        System.out.println("Percentage of Water (%): " + percentageWater);
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Climatic Pattern: " + climaticPattern);
        System.out.println("Geological Activity: " + geologicalActivity);
        System.out.println("Temperature Range: " + temperatureRange);
        System.out.println("Atmospheric Effect: " + atmosphericEffect);
        System.out.println("Notable For: " + notableFor);
    }
}