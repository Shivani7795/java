public class Plants {
    public static void describePlant() {
        System.out.println("Plants are essential to life, providing oxygen, food, and beauty to our world.");
    }

    public static void describePlant(String plantName) {
        System.out.println(plantName + " is a type of plant known for its unique characteristics.");
    }

    public static void describePlant(String plantName, String plantType) {
        System.out.println(plantName + " is classified as a " + plantType + ".");
    }

    public static void describePlant(String plantName, double height) {
        System.out.println(plantName + " can grow up to a height of " + height + " meters.");
    }

    public static void describePlant(String plantName, boolean isIndoor) {
        System.out.println(plantName + " is " + (isIndoor ? "an indoor plant." : "an outdoor plant."));
    }

    public static void describePlant(String plantName, String habitat, int lifespan) {
        System.out.println(plantName + " thrives in " + habitat + " and has a lifespan of around " + lifespan + " years.");
    }

    public static void describePlant(String[] plantNames) {
        System.out.println("Here are some plants: ");
        for (String plant : plantNames) {
            System.out.println("- " + plant);
        }
    }

    public static void describePlant(String plantName, boolean hasFlowers) {
        System.out.println(plantName + (hasFlowers ? " produces beautiful flowers." : " does not produce flowers."));
    }

    public static void describePlant(String plantName, String growthRate, String soilType) {
        System.out.println(plantName + " grows at a " + growthRate + " rate and prefers " + soilType + " soil.");
    }

    public static void describePlant(String plantName, String usage, String benefit) {
        System.out.println(plantName + " is often used for " + usage + " and provides benefits like " + benefit + ".");
    }

    // Additional methods
    public static void describePlant(String plantName, double waterRequirement, String frequency) {
        System.out.println(plantName + " requires " + waterRequirement + " liters of water " + frequency + ".");
    }

    public static void describePlant(String plantName, String leafShape, boolean isEvergreen) {
        System.out.println(plantName + " has " + leafShape + " shaped leaves and it is " + (isEvergreen ? "an evergreen plant." : "not an evergreen plant."));
    }

    public static void describePlant(String plantName, int numberOfSpecies, String genus) {
        System.out.println(plantName + " belongs to the genus " + genus + " and includes over " + numberOfSpecies + " species.");
    }

    public static void describePlant(String plantName, boolean attractsPollinators, String pollinators) {
        System.out.println(plantName + (attractsPollinators ? " attracts pollinators like " + pollinators + "." : " does not attract pollinators."));
    }

    public static void describePlant(String plantName, String origin, boolean isNative) {
        System.out.println(plantName + " originates from " + origin + " and is " + (isNative ? "native to the region." : "not native to the region."));
    }

    public static void describePlant(String plantName, String medicinalUse, boolean isMedicinal) {
        System.out.println(plantName + " is " + (isMedicinal ? "used in medicine for " + medicinalUse + "." : "not used in medicinal applications."));
    }

    public static void describePlant(String plantName, String climate, String temperatureRange) {
        System.out.println(plantName + " thrives in " + climate + " climates with a temperature range of " + temperatureRange + ".");
    }

    public static void describePlant(String plantName, char startingLetter) {
        System.out.println("The plant name \"" + plantName + "\" starts with the letter '" + startingLetter + "'.");
    }

    public static void describePlant(String plantName, String fertilizer, boolean requiresFertilizer) {
        System.out.println(plantName + " " + (requiresFertilizer ? "requires fertilizer like " + fertilizer + "." : "does not require fertilizer."));
    }

    public static void describePlant(String plantName, String symbolicMeaning, String occasions) {
        System.out.println(plantName + " symbolizes " + symbolicMeaning + " and is often used for " + occasions + ".");
    }

    public static void main(String[] args) {
        describePlant();
        describePlant("Rose");
        describePlant("Cactus", "succulent");
        describePlant("Bamboo", 12.5);
        describePlant("Aloe Vera", true);
        describePlant("Pine", "forests", 50);
        describePlant(new String[]{"Fern", "Orchid", "Palm", "Tulip"});
        describePlant("Daisy", true);
        describePlant("Sunflower", "fast", "well-drained");
        describePlant("Mint", "culinary uses", "enhancing digestion");
        describePlant("Hydrangea", 1.5, "weekly");
        describePlant("Maple", "lobed", false);
        describePlant("Oak", 600, "Quercus");
        describePlant("Lavender", true, "bees and butterflies");
        describePlant("Neem", "India", true);
        describePlant("Chamomile", "making herbal teas", true);
        describePlant("Lily", "tropical", "10-25°C");
        describePlant("Mango", 'M');
        describePlant("Tomato", "organic compost", true);
        describePlant("Lotus", "purity", "religious ceremonies");
    }
}
