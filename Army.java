public class Army {
    String name;
    int personnel;
    String type;
    String country;
    double budget;
    String commanderName;
    String deputyName;
    String rank;
    String division;
    String mission;

    public Army() {

    }

    public Army(String name) {
        this.name = name;
    }

    public Army(String name, int personnel) {
        this(name);
        this.personnel = personnel;
    }

    public Army(String name, int personnel, String type) {
        this(name, personnel);
        this.type = type;
    }

    public Army(String name, int personnel, String type, String country) {
        this(name, personnel, type);
        this.country = country;
    }

    public Army(String name, int personnel, String type, String country, double budget) {
        this(name, personnel, type, country);
        this.budget = budget;
    }

    public Army(String name, int personnel, String type, String country, double budget, String commanderName) {
        this(name, personnel, type, country, budget);
        this.commanderName = commanderName;
    }

    public Army(String name, int personnel, String type, String country, double budget, String commanderName, String deputyName) {
        this(name, personnel, type, country, budget, commanderName);
        this.deputyName = deputyName;
    }

    public Army(String name, int personnel, String type, String country, double budget, String commanderName, String deputyName, String rank) {
        this(name, personnel, type, country, budget, commanderName, deputyName);
        this.rank = rank;
    }

    public Army(String name, int personnel, String type, String country, double budget, String commanderName, String deputyName, String rank, String division) {
        this(name, personnel, type, country, budget, commanderName, deputyName, rank);
        this.division = division;
    }

    public Army(String name, int personnel, String type, String country, double budget, String commanderName, String deputyName, String rank, String division, String mission) {
        this(name, personnel, type, country, budget, commanderName, deputyName, rank, division);
        this.mission = mission;
    }

    public void info() {
        System.out.println("Army Details:");
        System.out.println("Name: " + name);
        System.out.println("Personnel: " + personnel);
        System.out.println("Type: " + type);
        System.out.println("Country: " + country);
        System.out.println("Budget: $" + budget + " million");
        System.out.println("Commander Name: " + commanderName);
        System.out.println("Deputy Name: " + deputyName);
        System.out.println("Rank: " + rank);
        System.out.println("Division: " + division);
        System.out.println("Mission: " + mission);
        System.out.println("---------------------");
    }
}

