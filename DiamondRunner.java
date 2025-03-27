public class DiamondRunner {
    public static void main(String args[]) {
        Diamond diamond1 = new Diamond("Kohinoor");
        diamond1.info();
        Diamond diamond2 = new Diamond("Kohinoor", 2.5);
        diamond2.info();
        Diamond diamond3 = new Diamond("Kohinoor", 2.5, "Blue");
        diamond3.info();
        Diamond diamond4 = new Diamond("Kohinoor", 2.5, "Blue", "IF");
        diamond4.info();
        Diamond diamond5 = new Diamond("Kohinoor", 2.5, "Blue", "IF", 15000.0);
        diamond5.info();
        Diamond diamond6 = new Diamond("Kohinoor", 2.5, "Blue", "IF", 15000.0, "Dobby");
        diamond6.info();
        Diamond diamond7 = new Diamond("Kohinoor", 2.5, "Blue", "IF", 15000.0, "Dobby", "Shivani");
        diamond7.info();
        Diamond diamond8 = new Diamond("Kohinoor", 2.5, "Blue", "IF", 15000.0, "Dobby", "Shivani", "South Africa");
        diamond8.info();
        Diamond diamond9 = new Diamond("Kohinoor", 2.5, "Blue", "IF", 15000.0, "Dobby", "Shivani", "South Africa", "Round");
        diamond9.info();
        Diamond diamond10 = new Diamond("Kohinoor", 2.5, "Blue", "IF", 15000.0, "Dobby", "Shivani", "South Africa", "Round", true);
        diamond10.info();
    }
}
