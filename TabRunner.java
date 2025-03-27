public class TabRunner {
    public static void main(String[] args) {
        Tab tab1 = new Tab(1, 10.5, 256.0, 6000, "Samsung", "Android", "Octa-Core", "Black",
                           "Wi-Fi", "AMOLED", "Metal", "Rear", "Premium", "Extended", "GalaxyTab S7",
                           "SSD", "Shivani", "Rahul", 8, 2, 50000);

        Tab tab2 = new Tab(2, 11.0, 128.0, 8000, "Apple", "iOS", "A12 Bionic", "Silver",
                           "Wi-Fi + Cellular", "Liquid Retina", "Aluminum", "Dual", "Compact", 
                           "Limited", "iPad Air", "Flash", "Ananya", "Aarav", 4, 1, 60000);

        Tab tab3 = new Tab(3, 9.5, 64.0, 5000, "Lenovo", "Windows", "Quad-Core", "Gray",
                           "Wi-Fi", "IPS", "Plastic", "Single", "Sturdy", "Standard", "YogaTab 11",
                           "HDD", "Kabir", "Kiara", 2, 3, 30000);

        tab1.tabDetails();
        System.out.println("-------------------------------------------"); 
        tab2.tabDetails();
        System.out.println("-------------------------------------------");
        tab3.tabDetails();
    }
}