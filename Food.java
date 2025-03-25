public class Food {
    private static String[] foodArray = new String[100]; 
    private static int foodCount = 0; 

    public static void saveFood(String foodName) {
        for (int i = 0; i < foodCount; i++) {
            if (foodArray[i].equals(foodName)) {
                System.out.println("The food name \"" + foodName + "\" is already saved.");
                return;
            }
        }
        if (foodCount < foodArray.length) {
            foodArray[foodCount] = foodName;
            foodCount++;
            System.out.println("The food name \"" + foodName + "\" has been successfully saved.");
        } else {
            System.out.println("Unable to save food name. Storage is full.");
        }
    }
    public static void displayAllFoods() {
        if (foodCount == 0) {
            System.out.println("No food names saved.");
        } else {
            System.out.println("Saved Food Names:");
            for (int i = 0; i < foodCount; i++) {
                System.out.println("- " + foodArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        saveFood("Pizza");
        saveFood("Burger");
        saveFood("Pasta");
        saveFood("Pizza"); 
        displayAllFoods();
    }
}
