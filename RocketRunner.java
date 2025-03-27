public class RocketRunner {
    public static void main(String[] args) {
        Rocket rocket1 = new Rocket(1, "Falcon 9", "SpaceX", "USA", 70.0, "Liquid Oxygen", "Reusable",
                                    "Low Earth Orbit", 22.8, "Elon Musk", 2010, "Vertical", 9, 2, 
                                    "Merlin Engine", "Low Drag", 50.0, "Cape Canaveral", 380000.0, 
                                    "Satellite Deployment");

        Rocket rocket2 = new Rocket(2, "Ariane 5", "Arianespace", "Europe", 780.0, "Hydrogen", "Expendable",
                                    "Geostationary Orbit", 10.0, "Jean-Yves Le Gall", 1996, "Vertical", 10, 1, 
                                    "Vulcain Engine", "Stable", 120.0, "Guiana Space Centre", 430000.0, 
                                    "Payload Launch");

        Rocket rocket3 = new Rocket(3, "GSLV Mk III", "ISRO", "India", 640.0, "Kerosene", "Reusable",
                                    "Moon Orbit", 8.0, "K. Sivan", 2014, "Vertical", 4, 3, 
                                    "CE-20 Engine", "High Thrust", 85.0, "Sriharikota", 300000.0, 
                                    "Exploration Mission");

        rocket1.rocketDetails();
        System.out.println("-------------------------------------------");
        rocket2.rocketDetails();
        System.out.println("-------------------------------------------");
        rocket3.rocketDetails();
    }
}