public class Fruits {
    public static void describeFruit() {
        System.out.println("Fruits are delicious and nutritious food items that come in various shapes and flavors.");
    }

    public static void describeFruit(String fruitName) {
        System.out.println(fruitName + " is a popular fruit enjoyed by many.");
    }

    public static void describeFruit(String fruitName, String color) {
        System.out.println(fruitName + " is known for its vibrant " + color + " color.");
    }

    public static void describeFruit(String fruitName, String taste, String season) {
        System.out.println(fruitName + " tastes " + taste + " and is typically available during the " + season + " season.");
    }

    public static void describeFruit(String fruitName, boolean isCitrus) {
        System.out.println(fruitName + " is " + (isCitrus ? "a citrus fruit." : "not a citrus fruit."));
    }

    public static void describeFruit(String fruitName, double averageWeight) {
        System.out.println(fruitName + " has an average weight of " + averageWeight + " grams.");
    }

    public static void describeFruit(String fruitName, int numberOfSeeds) {
        System.out.println(fruitName + " contains approximately " + numberOfSeeds + " seeds.");
    }

    public static void describeFruit(String fruitName, boolean isTropical, String origin) {
        System.out.println(fruitName + " is " + (isTropical ? "a tropical fruit" : "not a tropical fruit") + " and originates from " + origin + ".");
    }

    public static void describeFruit(String[] fruitNames) {
        System.out.println("Here are some fruits: ");
        for (String fruit : fruitNames) {
            System.out.println("- " + fruit);
        }
    }

    public static void describeFruit(String fruitName, int calories, String benefit) {
        System.out.println(fruitName + " has around " + calories + " calories and is known for " + benefit + ".");
    }

    public static void describeFruit(String fruitName, String texture, boolean isJuicy) {
        System.out.println(fruitName + " has a " + texture + " texture and is " + (isJuicy ? "very juicy." : "not very juicy."));
    }

    public static void describeFruit(String fruitName, String vitaminContent, int dailyValuePercentage) {
        System.out.println(fruitName + " is rich in " + vitaminContent + " and provides " + dailyValuePercentage + "% of your daily value.");
    }

    public static void describeFruit(String fruitName, boolean isExotic, double pricePerKg) {
        System.out.println(fruitName + " is " + (isExotic ? "an exotic fruit" : "a common fruit") + " and costs " + pricePerKg + " per kilogram.");
    }

    public static void describeFruit(String fruitName, char initialLetter) {
        System.out.println(fruitName + " starts with the letter '" + initialLetter + "'.");
    }

    public static void describeFruit(String fruitName, double sugarContent) {
        System.out.println(fruitName + " contains around " + sugarContent + " grams of sugar per serving.");
    }

    public static void describeFruit(String fruitName, String uniqueFeature) {
        System.out.println(fruitName + " is known for its unique feature: " + uniqueFeature + ".");
    }

    public static void describeFruit(String fruitName, String pairWith, String preparationStyle) {
        System.out.println(fruitName + " pairs well with " + pairWith + " and is often enjoyed by " + preparationStyle + ".");
    }

    public static void describeFruit(String fruitName, String season, double averageYield) {
        System.out.println(fruitName + " is usually grown in " + season + " and produces an average yield of " + averageYield + " kilograms per tree.");
    }

    public static void describeFruit(String fruitName, String taste, boolean isGoodForJuice) {
        System.out.println(fruitName + " has a " + taste + " taste and is " + (isGoodForJuice ? "great" : "not ideal") + " for making juice.");
    }

    public static void main(String[] args) {
        describeFruit();
        describeFruit("Apple");
        describeFruit("Banana", "yellow");
        describeFruit("Mango", "sweet", "summer");
        describeFruit("Orange", true);
        describeFruit("Pineapple", 1500.0);
        describeFruit("Papaya", 50);
        describeFruit("Coconut", true, "tropical regions");
        describeFruit(new String[]{"Grapes", "Watermelon", "Cherry", "Peach"});
        describeFruit("Strawberry", 30, "being rich in antioxidants");
        describeFruit("Kiwi", "soft", true);
        describeFruit("Guava", "Vitamin C", 80);
        describeFruit("Durian", true, 500.0);
        describeFruit("Blueberry", 'B');
        describeFruit("Fig", 5.3);
        describeFruit("Avocado", "its creamy texture");
        describeFruit("Lemon", "sugar", "being made into lemonade");
        describeFruit("Pomegranate", "autumn", 20.5);
        describeFruit("Lychee", "sweet", true);
    }
}
