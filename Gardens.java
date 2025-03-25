public class Gardens {
    public static void describeGarden() {
        System.out.println("Gardens are peaceful spaces full of plants, flowers, and natural beauty.");
    }

    public static void describeGarden(String gardenName) {
        System.out.println(gardenName + " is a beautifully maintained garden.");
    }

    public static void describeGarden(String gardenName, double area) {
        System.out.println(gardenName + " covers an area of " + area + " acres.");
    }

    public static void describeGarden(String gardenName, String primaryPlantType) {
        System.out.println(gardenName + " is known for its vibrant display of " + primaryPlantType + ".");
    }

    public static void describeGarden(String gardenName, boolean isPublic) {
        System.out.println(gardenName + " is " + (isPublic ? "a public garden open to everyone." : "a private garden."));
    }

    public static void describeGarden(String gardenName, String location, int numberOfVisitors) {
        System.out.println(gardenName + " is located in " + location + " and attracts about " + numberOfVisitors + " visitors annually.");
    }

    public static void describeGarden(String[] gardenNames) {
        System.out.println("Here are some popular gardens: ");
        for (String garden : gardenNames) {
            System.out.println("- " + garden);
        }
    }

    public static void describeGarden(String gardenName, int numberOfPlants) {
        System.out.println(gardenName + " is home to over " + numberOfPlants + " different plants.");
    }

    public static void describeGarden(String gardenName, String notableFeature, String bestSeasonToVisit) {
        System.out.println(gardenName + " features " + notableFeature + " and is best visited in the " + bestSeasonToVisit + " season.");
    }

    public static void describeGarden(String gardenName, double entryFee, boolean hasGuidedTours) {
        System.out.println(gardenName + " has an entry fee of " + entryFee + " and " + (hasGuidedTours ? "offers guided tours." : "does not offer guided tours."));
    }

    // Additional methods
    public static void describeGarden(String gardenName, String gardenStyle) {
        System.out.println(gardenName + " is designed in the " + gardenStyle + " style.");
    }

    public static void describeGarden(String gardenName, boolean hasFountains, int numberOfFountains) {
        System.out.println(gardenName + " " + (hasFountains ? "has " + numberOfFountains + " fountains." : "does not have any fountains."));
    }

    public static void describeGarden(String gardenName, String wildlife, boolean attractsWildlife) {
        System.out.println(gardenName + " " + (attractsWildlife ? "attracts wildlife such as " + wildlife + "." : "does not typically attract wildlife."));
    }

    public static void describeGarden(String gardenName, int age) {
        System.out.println(gardenName + " has been around for " + age + " years.");
    }

    public static void describeGarden(String gardenName, boolean hasPlayArea, String additionalFacilities) {
        System.out.println(gardenName + " " + (hasPlayArea ? "has a dedicated play area." : "does not have a play area.") + " Additional facilities include: " + additionalFacilities + ".");
    }

    public static void describeGarden(String gardenName, String waterFeature, boolean hasWaterBody) {
        System.out.println(gardenName + " " + (hasWaterBody ? "features a water body like " + waterFeature + "." : "does not have any water bodies."));
    }

    public static void describeGarden(String gardenName, char startingLetter) {
        System.out.println(gardenName + " starts with the letter '" + startingLetter + "'.");
    }

    public static void describeGarden(String gardenName, String specialEvents, int annualEvents) {
        System.out.println(gardenName + " hosts " + annualEvents + " special events annually, including " + specialEvents + ".");
    }

    public static void describeGarden(String gardenName, String gardenTheme, String maintenanceLevel) {
        System.out.println(gardenName + " is themed around " + gardenTheme + " and requires " + maintenanceLevel + " maintenance.");
    }

    public static void main(String[] args) {
        describeGarden();
        describeGarden("Botanical Garden");
        describeGarden("Rose Garden", 5.2);
        describeGarden("Lily Garden", "lilies");
        describeGarden("Central Park Garden", true);
        describeGarden("Japanese Garden", "Tokyo", 500000);
        describeGarden(new String[]{"Zen Garden", "Mughal Garden", "Tropical Garden"});
        describeGarden("Palm Garden", 300);
        describeGarden("Cherry Blossom Park", "cherry blossoms", "spring");
        describeGarden("National Garden", 10.5, true);
        describeGarden("Versailles Garden", "French");
        describeGarden("Royal Garden", true, 15);
        describeGarden("Wildlife Sanctuary Garden", "birds and butterflies", true);
        describeGarden("Historic Garden", 150);
        describeGarden("Children's Park", true, "cafes, picnic spots");
        describeGarden("Lotus Pond Garden", "lotus pond", true);
        describeGarden("Floral Paradise", 'F');
        describeGarden("Eventful Garden", "flower shows", 12);
        describeGarden("Sustainable Garden", "eco-friendliness", "low");
    }
}
