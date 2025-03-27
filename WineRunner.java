public class WineRunner {
    public static void main(String args[]) {
        Wine wine1 = new Wine("Chardonnay");
        wine1.info();
        Wine wine2 = new Wine("Chardonnay", "White");
        wine2.info();
        Wine wine3 = new Wine("Chardonnay", "White", 0.75);
        wine3.info();
        Wine wine4 = new Wine("Chardonnay", "White", 0.75, 20.0);
        wine4.info();
        Wine wine5 = new Wine("Chardonnay", "White", 0.75, 20.0, "Shivani");
        wine5.info();
        Wine wine6 = new Wine("Chardonnay", "White", 0.75, 20.0, "Shivani", "Aryan");
        wine6.info();
        Wine wine7 = new Wine("Chardonnay", "White", 0.75, 20.0, "Shivani", "Aryan", "Chardonnay Grapes");
        wine7.info();
        Wine wine8 = new Wine("Chardonnay", "White", 0.75, 20.0, "Shivani", "Aryan", "Chardonnay Grapes", "Napa Valley");
        wine8.info();
        Wine wine9 = new Wine("Chardonnay", "White", 0.75, 20.0, "Shivani", "Aryan", "Chardonnay Grapes", "Napa Valley", 2021);
        wine9.info();
    }
}
