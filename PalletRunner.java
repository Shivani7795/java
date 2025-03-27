public class PalletRunner {
    public static void main(String args[]) {
        Pallet pallet1 = new Pallet("Wooden pallet");
        pallet1.info();
        Pallet pallet2 = new Pallet("Wooden pallet", 100);
        pallet2.info();
        Pallet pallet3 = new Pallet("Wooden pallet", 100, "Wooden");
        pallet3.info();
        Pallet pallet4 = new Pallet("Wooden pallet", 100, "Wooden", "Brown");
        pallet4.info();
        Pallet pallet5 = new Pallet("Wooden pallet", 100, "Wooden", "Brown", 5000.0);
        pallet5.info();
        Pallet pallet6 = new Pallet("Wooden pallet", 100, "Wooden", "Brown", 5000.0, "Dobby");
        pallet6.info();
        Pallet pallet7 = new Pallet("Wooden pallet", 100, "Wooden", "Brown", 5000.0, "Dobby", "Shivani");
        pallet7.info();
        Pallet pallet8 = new Pallet("Wooden pallet", 100, "Wooden", "Brown", 5000.0, "Dobby", "Shivani", "Pine Wood");
        pallet8.info();
        Pallet pallet9 = new Pallet("Wooden pallet", 100, "Wooden", "Brown", 5000.0, "Dobby", "Shivani", "Pine Wood", "120x100x15 cm");
        pallet9.info();
        Pallet pallet10 = new Pallet("Wooden pallet", 100, "Wooden", "Brown", 5000.0, "Dobby", "Shivani", "Pine Wood", "120x100x15 cm", 2000.0);
        pallet10.info();
    }
}
