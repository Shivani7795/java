public class PaintBrush {
     int id;
     String name;
     String manufacturer;
     String countryOfOrigin;
     String bristleType;
     String shape;
     double length; 
     String creator;
     int yearIntroduced;
     String handleColor;
     String tipFeature;
     String handleMaterial;
     double price; 
     String paintType;
     String specialFeature;
     boolean washable;
     String productionType;
     String handleFeature;
     String targetAudience;

    public PaintBrush(int id, String name, String manufacturer, String countryOfOrigin, String bristleType,
                      String shape, double length, String creator, int yearIntroduced, String handleColor,
                      String tipFeature, String handleMaterial, double price, String paintType,
                      String specialFeature, boolean washable, String productionType, String handleFeature,
                      String targetAudience) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.bristleType = bristleType;
        this.shape = shape;
        this.length = length;
        this.creator = creator;
        this.yearIntroduced = yearIntroduced;
        this.handleColor = handleColor;
        this.tipFeature = tipFeature;
        this.handleMaterial = handleMaterial;
        this.price = price;
        this.paintType = paintType;
        this.specialFeature = specialFeature;
        this.washable = washable;
        this.productionType = productionType;
        this.handleFeature = handleFeature;
        this.targetAudience = targetAudience;
    }

    public void paintBrushDetails() {
        System.out.println("PaintBrush ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Bristle Type: " + bristleType);
        System.out.println("Shape: " + shape);
        System.out.println("Length (cm): " + length);
        System.out.println("Creator: " + creator);
        System.out.println("Year Introduced: " + yearIntroduced);
        System.out.println("Handle Color: " + handleColor);
        System.out.println("Tip Feature: " + tipFeature);
        System.out.println("Handle Material: " + handleMaterial);
        System.out.println("Price: " + price);
        System.out.println("Paint Type: " + paintType);
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Washable: " + (washable ? "Yes" : "No"));
        System.out.println("Production Type: " + productionType);
        System.out.println("Handle Feature: " + handleFeature);
        System.out.println("Target Audience: " + targetAudience);
    }
}