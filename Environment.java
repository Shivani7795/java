public class Environment {
    public static void describeEnvironment() {
        System.out.println("The environment is the natural world around us, including air, water, land, and ecosystems.");
    }

    public static void describeEnvironment(String ecosystem) {
        System.out.println("The " + ecosystem + " is a vital part of the environment, supporting diverse life forms.");
    }

    public static void describeEnvironment(String ecosystem, String keyFeature) {
        System.out.println("The " + ecosystem + " is characterized by " + keyFeature + ".");
    }

    public static void describeEnvironment(String ecosystem, int numberOfSpecies) {
        System.out.println("The " + ecosystem + " is home to approximately " + numberOfSpecies + " species.");
    }

    public static void describeEnvironment(String ecosystem, boolean isThreatened) {
        System.out.println("The " + ecosystem + " is " + (isThreatened ? "currently under threat." : "not under immediate threat."));
    }

    public static void describeEnvironment(String resource, String usage) {
        System.out.println(resource + " is a crucial natural resource used for " + usage + ".");
    }

    public static void describeEnvironment(String[] ecosystems) {
        System.out.println("Here are some vital ecosystems: ");
        for (String ecosystem : ecosystems) {
            System.out.println("- " + ecosystem);
        }
    }

    public static void describeEnvironment(String ecosystem, double areaSize, String unit) {
        System.out.println("The " + ecosystem + " spans an area of " + areaSize + " " + unit + ".");
    }

    public static void describeEnvironment(String issue, String impact, String solution) {
        System.out.println("The issue of " + issue + " has significant impacts, including " + impact + ". A possible solution is " + solution + ".");
    }

    public static void describeEnvironment(String resource, boolean isRenewable) {
        System.out.println(resource + " is " + (isRenewable ? "a renewable resource." : "a non-renewable resource."));
    }

    // Additional methods
    public static void describeEnvironment(String ecosystem, String conservationEfforts, boolean isProtected) {
        System.out.println("The " + ecosystem + " has conservation efforts focused on " + conservationEfforts + " and it is " + (isProtected ? "a protected area." : "not yet protected."));
    }

    public static void describeEnvironment(String issue, int affectedRegions, String severity) {
        System.out.println(issue + " affects " + affectedRegions + " regions and is considered a " + severity + " issue.");
    }

    public static void describeEnvironment(String resource, double usageRate, String industry) {
        System.out.println(resource + " is used at a rate of " + usageRate + " units per year in the " + industry + " industry.");
    }

    public static void describeEnvironment(String climate, double avgTemperature, String region) {
        System.out.println("The " + climate + " climate has an average temperature of " + avgTemperature + "°C in the " + region + " region.");
    }

    public static void describeEnvironment(String pollutant, String source, boolean isHarmful) {
        System.out.println(pollutant + " is " + (isHarmful ? "a harmful pollutant" : "not very harmful") + " and is mainly caused by " + source + ".");
    }

    public static void describeEnvironment(String endangeredSpecies, int populationCount) {
        System.out.println("The " + endangeredSpecies + " has a population of around " + populationCount + " individuals remaining.");
    }

    public static void describeEnvironment(String event, String region, boolean isReoccurring) {
        System.out.println("The " + event + " occurs in the " + region + " and it is " + (isReoccurring ? "a reoccurring event." : "a rare event."));
    }

    public static void describeEnvironment(char startingLetter, String feature) {
        System.out.println("Environmental terms starting with '" + startingLetter + "' often include features like " + feature + ".");
    }

    public static void describeEnvironment(String topic, String importance, boolean requiresAction) {
        System.out.println("The topic of " + topic + " is important for " + importance + " and it " + (requiresAction ? "requires immediate action." : "does not require urgent action."));
    }

    public static void describeEnvironment(String species, String role, String habitat) {
        System.out.println("The " + species + " plays an important role in the " + habitat + " ecosystem by " + role + ".");
    }

    public static void main(String[] args) {
        describeEnvironment();
        describeEnvironment("Rainforest");
        describeEnvironment("Coral Reef", "colorful marine life");
        describeEnvironment("Wetlands", 150);
        describeEnvironment("Arctic", true);
        describeEnvironment("Freshwater", "drinking and irrigation");
        describeEnvironment(new String[]{"Forest", "Ocean", "Grassland", "Desert"});
        describeEnvironment("Savanna", 1000, "square kilometers");
        describeEnvironment("Deforestation", "loss of biodiversity", "reforestation initiatives");
        describeEnvironment("Solar Energy", true);
        describeEnvironment("Mangroves", "preserving coastlines", true);
        describeEnvironment("Air Pollution", 50, "critical");
        describeEnvironment("Coal", 5.2, "energy");
        describeEnvironment("Tropical", 28.5, "Amazon Basin");
        describeEnvironment("Carbon Dioxide", "burning fossil fuels", true);
        describeEnvironment("Snow Leopard", 4000);
        describeEnvironment("Monsoon", "South Asia", true);
        describeEnvironment('C', "climate and conservation");
        describeEnvironment("Climate Change", "sustainable living", true);
        describeEnvironment("Bees", "pollination", "flowering plants");
    }
}
