public class SatelliteRunner {
    public static void main(String[] args) {
        Satellite satellite1 = new Satellite(1, "Hubble Space Telescope", "NASA", "USA", 11110.0, 
                                             "Earth Observation", 1990, "Low Earth Orbit", 
                                             "Optical Telescope", 569.0, "Solar Power", 
                                             "High-Resolution Images", true, 7.5, 0.025, 
                                             "Cape Canaveral", "Visible Light", "Scientific Research");

        Satellite satellite2 = new Satellite(2, "NAVIC IRNSS-1A", "ISRO", "India", 1425.0, 
                                             "Navigation", 2013, "Geostationary Orbit", 
                                             "Communication Payload", 35800.0, "Solar Power", 
                                             "Regional Positioning", false, 0.0, 0.0, 
                                             "Sriharikota", "Microwave Signals", "Geolocation Services");

        Satellite satellite3 = new Satellite(3, "Starlink-1000", "SpaceX", "USA", 260.0, 
                                             "Broadband Communication", 2020, "Low Earth Orbit", 
                                             "Antenna Array", 550.0, "Solar Power", 
                                             "Global Internet Coverage", true, 7.66, 0.001, 
                                             "Vandenberg", "Ku/Ka-band", "Commercial Internet");

        satellite1.satelliteDetails();
        System.out.println("-------------------------------------------");
        satellite2.satelliteDetails();
        System.out.println("-------------------------------------------");
        satellite3.satelliteDetails();
    }
}