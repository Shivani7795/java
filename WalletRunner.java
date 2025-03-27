public class WalletRunner {
    public static void main(String args[]) {
        Wallet wallet1 = new Wallet("Leather Wallet");
        wallet1.info();
        Wallet wallet2 = new Wallet("Leather Wallet", "Brown");
        wallet2.info();
        Wallet wallet3 = new Wallet("Leather Wallet", "Brown", "Bi-Fold");
        wallet3.info();
        Wallet wallet4 = new Wallet("Leather Wallet", "Brown", "Bi-Fold", 1000.0);
        wallet4.info();
        Wallet wallet5 = new Wallet("Leather Wallet", "Brown", "Bi-Fold", 1000.0, "Dobby");
        wallet5.info();
        Wallet wallet6 = new Wallet("Leather Wallet", "Brown", "Bi-Fold", 1000.0, "Dobby", "Shivani");
        wallet6.info();
        Wallet wallet7 = new Wallet("Leather Wallet", "Brown", "Bi-Fold", 1000.0, "Dobby", "Shivani", "Genuine Leather");
        wallet7.info();
        Wallet wallet8 = new Wallet("Leather Wallet", "Brown", "Bi-Fold", 1000.0, "Dobby", "Shivani", "Genuine Leather", "10x8 cm");
        wallet8.info();
        Wallet wallet9 = new Wallet("Leather Wallet", "Brown", "Bi-Fold", 1000.0, "Dobby", "Shivani", "Genuine Leather", "10x8 cm", 6);
        wallet9.info();
    }
}
