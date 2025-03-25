public class Sports {
    public static void describeSport() {
        System.out.println("Sports are physical activities that promote fitness, teamwork, and competition.");
    }

    public static void describeSport(String sportName) {
        System.out.println(sportName + " is a popular sport enjoyed by many worldwide.");
    }

    public static void describeSport(String sportName, String type) {
        System.out.println(sportName + " is a " + type + " sport.");
    }

    public static void describeSport(String sportName, int numberOfPlayers) {
        System.out.println(sportName + " typically involves " + numberOfPlayers + " players per team.");
    }

    public static void describeSport(String sportName, boolean isOlympicSport) {
        System.out.println(sportName + " is " + (isOlympicSport ? "an Olympic sport." : "not an Olympic sport."));
    }

    public static void describeSport(String sportName, String equipment) {
        System.out.println(sportName + " requires equipment such as " + equipment + ".");
    }

    public static void describeSport(String[] sports) {
        System.out.println("Here are some exciting sports: ");
        for (String sport : sports) {
            System.out.println("- " + sport);
        }
    }

    public static void describeSport(String sportName, String origin, int yearOriginated) {
        System.out.println(sportName + " originated in " + origin + " around the year " + yearOriginated + ".");
    }

    public static void describeSport(String sportName, String skill, String physicalBenefit) {
        System.out.println(sportName + " enhances " + skill + " and provides physical benefits such as " + physicalBenefit + ".");
    }

    public static void describeSport(String sportName, boolean hasTeamPlay, String famousEvent) {
        System.out.println(sportName + " " + (hasTeamPlay ? "involves team play and is highlighted in events like " + famousEvent + "." : "is an individual sport with no team play."));
    }

    // Additional methods
    public static void describeSport(String sportName, String scoringSystem) {
        System.out.println(sportName + " uses a scoring system based on " + scoringSystem + ".");
    }

    public static void describeSport(String sportName, double averageDuration, String timeUnit) {
        System.out.println(sportName + " typically lasts for about " + averageDuration + " " + timeUnit + ".");
    }

    public static void describeSport(String sportName, boolean isPopular, String region) {
        System.out.println(sportName + " is " + (isPopular ? "highly popular" : "not very popular") + " in the region of " + region + ".");
    }

    public static void describeSport(String sportName, String famousPlayer, String achievement) {
        System.out.println(famousPlayer + " is a renowned player in " + sportName + " and is known for " + achievement + ".");
    }

    public static void describeSport(String sportName, int fitnessLevel, String idealAgeGroup) {
        System.out.println(sportName + " requires a fitness level of " + fitnessLevel + " and is ideal for " + idealAgeGroup + ".");
    }

    public static void describeSport(String sportName, String competition, boolean isInternational) {
        System.out.println(sportName + " features competitions such as " + competition + " and it is " + (isInternational ? "played internationally." : "mainly played locally."));
    }

    public static void describeSport(String sportName, int fieldSize, String unit) {
        System.out.println(sportName + " is played on a field with a size of " + fieldSize + " " + unit + ".");
    }

    public static void describeSport(String sportName, char startingLetter) {
        System.out.println("The sport \"" + sportName + "\" starts with the letter '" + startingLetter + "'.");
    }

    public static void describeSport(String sportName, String strategy, String mentalBenefit) {
        System.out.println(sportName + " involves " + strategy + " and promotes mental benefits like " + mentalBenefit + ".");
    }

    public static void describeSport(String sportName, String seasonalPreference, boolean isYearRound) {
        System.out.println(sportName + " is typically played in " + seasonalPreference + " and it is " + (isYearRound ? "played year-round." : "not played year-round."));
    }

    public static void main(String[] args) {
        describeSport();
        describeSport("Soccer");
        describeSport("Tennis", "individual");
        describeSport("Basketball", 5);
        describeSport("Swimming", true);
        describeSport("Cricket", "bats and balls");
        describeSport(new String[]{"Football", "Hockey", "Badminton", "Golf"});
        describeSport("Baseball", "USA", 1839);
        describeSport("Martial Arts", "self-defense", "improved flexibility");
        describeSport("Volleyball", true, "Olympics");
        describeSport("Rugby", "tries and conversions");
        describeSport("Hockey", 60.0, "minutes");
        describeSport("Kabaddi", true, "India");
        describeSport("Tennis", "Serena Williams", "winning 23 Grand Slam titles");
        describeSport("Boxing", 7, "young adults");
        describeSport("Snooker", "World Championship", true);
        describeSport("Golf", 500, "yards");
        describeSport("Archery", 'A');
        describeSport("Chess", "strategic planning", "critical thinking");
        describeSport("Skiing", "winter", true);
    }
}
