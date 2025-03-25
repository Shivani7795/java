public class CosmeticsRunner{
    public static void main(String[] args) {
        Cosmetics.type("Lipstic");
        Cosmetics.type("primer");
        Cosmetics.type("foundation");
        Cosmetics.type("sunscreen");
        Cosmetics.search("Eye linear");
        boolean value = Cosmetics.isPresent();
        System.out.println("the product" + value +"is present");
        Cosmetics.product("kajal");
    }
}
