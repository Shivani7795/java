public class PlanetRunner {
    public static void main(String[] args) {
        Planet planet1 = new Planet(1, "Earth", "Solar System", 6371.0, 5.972E24, "Oxygen-Nitrogen", 
                                    "Terrestrial", true, 1, 365.25, "Sun", "Water", 21, 
                                    "Life-Supporting", "Day-Night Cycle", "Plate Tectonics", 
                                    "Moderate", "Greenhouse Effect", "Humans");

        Planet planet2 = new Planet(2, "Mars", "Solar System", 3389.5, 6.39E23, "Carbon Dioxide", 
                                    "Terrestrial", false, 2, 687.0, "Sun", "Iron Oxide", 0, 
                                    "Red Surface", "Dust Storms", "Polar Ice Caps", 
                                    "Cold", "Thin Atmosphere", "Exploration");

        Planet planet3 = new Planet(3, "Jupiter", "Solar System", 69911.0, 1.898E27, "Hydrogen-Helium", 
                                    "Gas Giant", false, 79, 4332.59, "Sun", "Storms", 0, 
                                    "Great Red Spot", "Strong Magnetic Field", "Fast Rotation", 
                                    "Extreme", "Radiation Belts", "Study of Gas Giants");

        planet1.planetDetails();
        System.out.println("-------------------------------------------");
        planet2.planetDetails();
        System.out.println("-------------------------------------------");
        planet3.planetDetails();
    }
}