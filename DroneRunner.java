public class DroneRunner {
    public static void main(String[] args) {
        Drone drone1 = new Drone(1, "DJI Phantom 4", "DJI", "China", 1.4, "Electric", "Quadcopter", 
                                 "Photography", 28.0, "John Doe", 2016, "White", "GPS", 4, 
                                 "LiPo Battery", 72.0, "Obstacle Avoidance", "Remote", 
                                 20.0, "3-axis Gimbal", "Consumer Drone");

        Drone drone2 = new Drone(2, "Parrot Anafi", "Parrot", "France", 0.32, "Electric", "Quadcopter", 
                                 "Surveillance", 25.0, "Jane Smith", 2018, "Black", "GPS & GLONASS", 4, 
                                 "Li-Ion Battery", 55.0, "Compact Design", "Remote", 
                                 15.0, "180° Tilt Camera", "Compact Drone");

        Drone drone3 = new Drone(3, "MQ-9 Reaper", "General Atomics", "USA", 2223.0, "Hybrid", "Fixed-wing", 
                                 "Military Operations", 27.0, "Samuel Johnson", 2007, "Gray", "Autonomous", 0, 
                                 "Turbo Engine", 482.0, "Advanced Sensors", "Autonomous", 
                                 18500.0, "ISR Capabilities", "Military Drone");

        drone1.droneDetails();
        System.out.println("-------------------------------------------");
        drone2.droneDetails();
        System.out.println("-------------------------------------------");
        drone3.droneDetails();
    }
}