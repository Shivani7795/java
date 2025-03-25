public class Seasons {

    public static void describeSeason() {
        System.out.println("Seasons are beautiful transitions in nature.");
    }

    public static void describeSeason(String seasonName) {
        System.out.println(seasonName + " is a unique season with its own charm.");
    }

    public static void describeSeason(String seasonName, int avgTemperature) {
        System.out.println(seasonName + " typically has an average temperature of " + avgTemperature + "°C.");
    }

    public static void describeSeason(String seasonName, String activity) {
        System.out.println(seasonName + " is perfect for " + activity + ".");
    }

    public static void describeSeason(String seasonName, double rainfall, boolean isRainy) {
        System.out.println(seasonName + " brings " + rainfall + " mm of rain. " + (isRainy ? "It's the rainy season!" : "It's usually dry."));
    }

    public static void describeSeason(String seasonName, int avgTemperature, String drink) {
        System.out.println(seasonName + " with an average temperature of " + avgTemperature + "°C is great for enjoying " + drink + ".");
    }

    public static void describeSeason(String seasonName, String location, String feature) {
        System.out.println(seasonName + " in " + location + " is known for its " + feature + ".");
    }

    public static void describeSeason(String seasonName, String vibe, String activity, int humidity) {
        System.out.println(seasonName + " is " + vibe + " and great for " + activity + " with a humidity of " + humidity + "%.");
    }

    public static void describeSeason(String[] seasonNames) {
        System.out.println("Here are the seasons: ");
        for (String season : seasonNames) {
            System.out.println("- " + season);
        }
    }

    public static void describeSeason(String seasonName, int[] monthlyTemperatures) {
        System.out.print("In " + seasonName + ", temperatures are: ");
        for (int temp : monthlyTemperatures) {
            System.out.print(temp + "°C ");
        }
        System.out.println();
    }

    public static void describeSeason(int days, String seasonName) {
        System.out.println(seasonName + " lasts for around " + days + " days on average.");
    }

    public static void describeSeason(String seasonName, boolean isHolidaySeason) {
        System.out.println(seasonName + " is " + (isHolidaySeason ? "a holiday season!" : "not typically a holiday season."));
    }

    public static void describeSeason(String seasonName, String popularFood, double avgRainfall) {
        System.out.println(seasonName + " is known for " + popularFood + " and an average rainfall of " + avgRainfall + " mm.");
    }

    public static void describeSeason(char seasonInitial, String notableFeature) {
        System.out.println("The season starting with " + seasonInitial + " is known for " + notableFeature + ".");
    }

    public static void describeSeason(String seasonName, int avgTemperature, boolean isSunny) {
        System.out.println(seasonName + " has an average temperature of " + avgTemperature + "°C and it is " + (isSunny ? "sunny." : "not always sunny."));
    }

    public static void describeSeason(String seasonName, double windSpeed) {
        System.out.println(seasonName + " brings winds that can reach speeds up to " + windSpeed + " km/h.");
    }

    public static void describeSeason(String seasonName, int avgHumidity, String recommendedClothing) {
        System.out.println(seasonName + " with an average humidity of " + avgHumidity + "% calls for wearing " + recommendedClothing + ".");
    }

    public static void describeSeason(int startMonth, int endMonth, String seasonName) {
        System.out.println(seasonName + " usually starts in month " + startMonth + " and ends in month " + endMonth + ".");
    }

    public static void describeSeason(String seasonName, double snowfall, String activity) {
        System.out.println(seasonName + " brings " + snowfall + " cm of snowfall, perfect for " + activity + ".");
    }

    public static void describeSeason(String seasonName, String localTradition, int avgRainyDays) {
        System.out.println(seasonName + " in some regions is associated with " + localTradition + " and typically has " + avgRainyDays + " rainy days.");
    }

    public static void main(String[] args) {
        describeSeason();
        describeSeason("Spring");
        describeSeason("Summer", 35);
        describeSeason("Autumn", "hiking");
        describeSeason("Rainy Season", 300.5, true);
        describeSeason("Winter", -5, "hot chocolate");
        describeSeason("Monsoon", "India", "lush greenery");
        describeSeason("Foggy Season", "calm", "strolling", 80);
        describeSeason(new String[] {"Spring", "Summer", "Autumn", "Winter"});
        describeSeason("Summer", new int[] {30, 32, 35, 36, 33});
        describeSeason(90, "Spring");
        describeSeason("Winter", true);
        describeSeason("Autumn", "pumpkin pie", 50.2);
        describeSeason('S', "blooming flowers");
        describeSeason("Rainy Season", 28, true);
        describeSeason("Windy Season", 25.0);
        describeSeason("Summer", 65, "light clothes");
        describeSeason(3, 5, "Spring");
        describeSeason("Snowy Season", 100.5, "skiing");
        describeSeason("Rainy Season", "festivals", 40);
    }
}
