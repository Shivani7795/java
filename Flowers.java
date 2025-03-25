public class Flowers {
    public static void describeFlower() {
        System.out.println("Flowers are beautiful and diverse plants that brighten up our world.");
    }

    public static void describeFlower(String flowerName) {
        System.out.println(flowerName + " is a lovely flower admired for its beauty.");
    }

    public static void describeFlower(String flowerName, String color) {
        System.out.println(flowerName + " is known for its stunning " + color + " color.");
    }

    public static void describeFlower(String flowerName, String fragrance, boolean isFragrant) {
        System.out.println(flowerName + " has " + (isFragrant ? "a delightful fragrance: " + fragrance + "." : "no noticeable fragrance."));
    }

    public static void describeFlower(String flowerName, int petalCount) {
        System.out.println(flowerName + " typically has " + petalCount + " petals.");
    }

    public static void describeFlower(String flowerName, String bloomingSeason, boolean bloomsYearRound) {
        System.out.println(flowerName + " blooms in " + bloomingSeason + " and it " + (bloomsYearRound ? "blooms all year round." : "does not bloom year round."));
    }

    public static void describeFlower(String[] flowerNames) {
        System.out.println("Here are some flowers: ");
        for (String flower : flowerNames) {
            System.out.println("- " + flower);
        }
    }

    public static void describeFlower(String flowerName, String origin, boolean isNative) {
        System.out.println(flowerName + " originates from " + origin + " and it is " + (isNative ? "a native plant." : "not a native plant."));
    }

    public static void describeFlower(String flowerName, double height, String unit) {
        System.out.println(flowerName + " grows to an average height of " + height + " " + unit + ".");
    }

    public static void describeFlower(String flowerName, String symbolism, String occasion) {
        System.out.println(flowerName + " symbolizes " + symbolism + " and is often used for " + occasion + ".");
    }

    // Additional methods
    public static void describeFlower(String flowerName, String soilType, boolean requiresFrequentWatering) {
        System.out.println(flowerName + " thrives in " + soilType + " soil and " + (requiresFrequentWatering ? "requires frequent watering." : "does not require frequent watering."));
    }

    public static void describeFlower(String flowerName, double lifespan, String lifespanUnit) {
        System.out.println(flowerName + " has a lifespan of approximately " + lifespan + " " + lifespanUnit + ".");
    }

    public static void describeFlower(String flowerName, String preferredClimate, boolean growsIndoors) {
        System.out.println(flowerName + " prefers a " + preferredClimate + " climate and " + (growsIndoors ? "can grow indoors." : "requires outdoor conditions."));
    }

    public static void describeFlower(String flowerName, boolean attractsBees, boolean attractsButterflies) {
        System.out.println(flowerName + " " + (attractsBees ? "attracts bees" : "does not attract bees") + " and " + (attractsButterflies ? "attracts butterflies." : "does not attract butterflies."));
    }

    public static void describeFlower(String flowerName, String scientificName) {
        System.out.println(flowerName + " is scientifically known as " + scientificName + ".");
    }

    public static void describeFlower(String flowerName, boolean isMedicinal, String medicinalUse) {
        System.out.println(flowerName + " is " + (isMedicinal ? "known for its medicinal properties." : "not medicinal.") + " It is often used for " + medicinalUse + ".");
    }

    public static void describeFlower(String flowerName, String floralArrangement, boolean isUsedInBouquets) {
        System.out.println(flowerName + " is commonly seen in " + floralArrangement + " and is " + (isUsedInBouquets ? "frequently used in bouquets." : "rarely used in bouquets."));
    }

    public static void describeFlower(String flowerName, char initial) {
        System.out.println("The flower name \"" + flowerName + "\" begins with the letter '" + initial + "'.");
    }

    public static void describeFlower(String flowerName, String culturalSignificance, String region) {
        System.out.println(flowerName + " has cultural significance in " + region + " as it represents " + culturalSignificance + ".");
    }

    public static void main(String[] args) {
        describeFlower();
        describeFlower("Rose");
        describeFlower("Tulip", "red");
        describeFlower("Jasmine", "sweet", true);
        describeFlower("Sunflower", 20);
        describeFlower("Lotus", "summer", false);
        describeFlower(new String[]{"Lily", "Orchid", "Daffodil"});
        describeFlower("Cherry Blossom", "Japan", true);
        describeFlower("Marigold", 30.5, "cm");
        describeFlower("Daisy", "innocence", "weddings");
        describeFlower("Hibiscus", "well-drained", true);
        describeFlower("Carnation", 2.5, "weeks");
        describeFlower("Lavender", "mild", true);
        describeFlower("Buttercup", true, false);
        describeFlower("Poppy", "Papaver rhoeas");
        describeFlower("Chamomile", true, "soothing tea");
        describeFlower("Peony", "table centerpieces", true);
        describeFlower("Azalea", 'A');
        describeFlower("Magnolia", "dignity", "southern USA");
    }
}
