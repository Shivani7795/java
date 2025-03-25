public class Months {
    public static void describeMonth() {
        System.out.println("Months represent the 12 divisions of a year.");
    }

    public static void describeMonth(String monthName) {
        System.out.println(monthName + " is a special month of the year.");
    }

    public static void describeMonth(String monthName, int numberOfDays) {
        System.out.println(monthName + " has " + numberOfDays + " days.");
    }

    public static void describeMonth(String monthName, String season) {
        System.out.println(monthName + " is part of the " + season + " season.");
    }

    public static void describeMonth(String monthName, double avgTemperature, boolean isHot) {
        System.out.println(monthName + " usually has an average temperature of " + avgTemperature + "°C. " + (isHot ? "It is a hot month." : "It is a cool month."));
    }

    public static void describeMonth(String monthName, String event, boolean isHolidayMonth) {
        System.out.println(monthName + " is known for " + event + " and is " + (isHolidayMonth ? "a holiday month." : "not a typical holiday month."));
    }

    public static void describeMonth(String monthName, String famousFestival, int avgRainfall) {
        System.out.println(monthName + " is known for the " + famousFestival + " and experiences an average rainfall of " + avgRainfall + " mm.");
    }

    public static void describeMonth(String monthName, String vibe, String activity, int avgTemperature) {
        System.out.println(monthName + " feels " + vibe + " and is great for " + activity + " with an average temperature of " + avgTemperature + "°C.");
    }

    public static void describeMonth(String[] monthNames) {
        System.out.println("Here are the months of the year: ");
        for (String month : monthNames) {
            System.out.println("- " + month);
        }
    }

    public static void describeMonth(String monthName, int[] dailyTemperatures) {
        System.out.print("In " + monthName + ", daily temperatures are: ");
        for (int temp : dailyTemperatures) {
            System.out.print(temp + "°C ");
        }
        System.out.println();
    }

    public static void describeMonth(int monthNumber, String monthName) {
        System.out.println("Month " + monthNumber + " is " + monthName + ".");
    }

    public static void describeMonth(String monthName, boolean isStartOfQuarter) {
        System.out.println(monthName + " is " + (isStartOfQuarter ? "the start of a quarter." : "not the start of a quarter."));
    }

    public static void describeMonth(String monthName, String birthstone, String zodiacSign) {
        System.out.println(monthName + " is associated with the birthstone " + birthstone + " and the zodiac sign " + zodiacSign + ".");
    }

    public static void describeMonth(String monthName, char initial) {
        System.out.println("The month " + monthName + " starts with the letter '" + initial + "'.");
    }

    public static void describeMonth(String monthName, double avgRainfall, boolean isRainyMonth) {
        System.out.println(monthName + " has an average rainfall of " + avgRainfall + " mm. " + (isRainyMonth ? "It is a rainy month." : "It is a dry month."));
    }

    public static void describeMonth(String monthName, String popularFood, String activity) {
        System.out.println(monthName + " is perfect for enjoying " + popularFood + " while " + activity + ".");
    }

    public static void describeMonth(String monthName, double avgSnowfall) {
        System.out.println(monthName + " brings an average snowfall of " + avgSnowfall + " cm.");
    }

    public static void describeMonth(String monthName, String celebration, int days) {
        System.out.println(monthName + " is celebrated with " + celebration + ", lasting for " + days + " days.");
    }

    public static void describeMonth(String monthName, String culturalEvent, String uniqueFeature) {
        System.out.println(monthName + " is known for " + culturalEvent + " and its unique feature: " + uniqueFeature + ".");
    }

    public static void main(String[] args) {
        describeMonth();
        describeMonth("January");
        describeMonth("February", 28);
        describeMonth("March", "spring");
        describeMonth("April", 25.5, false);
        describeMonth("May", "Labor Day", true);
        describeMonth("June", "International Yoga Day", 120);
        describeMonth("July", "warm", "swimming", 30);
        describeMonth(new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"});
        describeMonth("August", new int[]{29, 30, 31, 32, 33});
        describeMonth(9, "September");
        describeMonth("October", true);
        describeMonth("November", "Topaz", "Scorpio");
        describeMonth("December", 'D');
        describeMonth("July", 300.5, true);
        describeMonth("October", "pumpkin spice latte", "harvest festivals");
        describeMonth("January", 50.0);
        describeMonth("December", "Christmas", 25);
        describeMonth("April", "Cherry Blossom Festival", "blooming flowers");
    }
}
