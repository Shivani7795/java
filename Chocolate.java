public class Chocolate {
     int id;
     String name;
     String manufacturer;
     String countryOfOrigin;
     double weight; 
     String type;
     String shape;
     double thickness; 
     String creator;
     int yearIntroduced;
     String packagingColor;
     String flavor;
     String packagingType;
     double cocoaContent;
     String tasteType;
     String specialFeature;
     String storageConditions;
     boolean glutenFree;
     String dietType;
     String targetAudience;

    public Chocolate(int id, String name, String manufacturer, String countryOfOrigin, double weight, String type,
                     String shape, double thickness, String creator, int yearIntroduced, String packagingColor,
                     String flavor, String packagingType, double cocoaContent, String tasteType,
                     String specialFeature, String storageConditions, boolean glutenFree, String dietType,
                     String targetAudience) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.weight = weight;
        this.type = type;
        this.shape = shape;
        this.thickness = thickness;
        this.creator = creator;
        this.yearIntroduced = yearIntroduced;
        this.packagingColor = packagingColor;
        this.flavor = flavor;
        this.packagingType = packagingType;
        this.cocoaContent = cocoaContent;
        this.tasteType = tasteType;
        this.specialFeature = specialFeature;
        this.storageConditions = storageConditions;
        this.glutenFree = glutenFree;
        this.dietType = dietType;
        this.targetAudience = targetAudience;
    }

    public void chocolateDetails() {
        System.out.println("Chocolate ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Weight (grams): " + weight);
        System.out.println("Type: " + type);
        System.out.println("Shape: " + shape);
        System.out.println("Thickness (cm): " + thickness);
        System.out.println("Creator: " + creator);
        System.out.println("Year Introduced: " + yearIntroduced);
        System.out.println("Packaging Color: " + packagingColor);
        System.out.println("Flavor: " + flavor);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Cocoa Content (%): " + cocoaContent);
        System.out.println("Taste Type: " + tasteType);
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Storage Conditions: " + storageConditions);
        System.out.println("Gluten-Free: " + glutenFree);
        System.out.println("Diet Type: " + dietType);
        System.out.println("Target Audience: " + targetAudience);
    }
}