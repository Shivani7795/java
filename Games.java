public class Games{
	static String[] gameNames={null,null,null};
	static int index=0;
	public static void saveGameNames(String gameName){
	if (gameNames != null) {
            if (index < gameNames.length) {
                gameNames[index] = gameName; 
                index++;
                System.out.println("Game name added to the list successfully");
            } else {
                System.out.println("list is full.Game name not added to the list, ");
            }
        } else {
            System.out.println("List is null");
        }
    } 
    public static void search(String gameName){
        System.out.println();
        for (int i = 0; i < index; i++) {
            if (gameNames[i].equalsIgnoreCase(gameName)) {
                System.out.println(gameName + " found");
                return;
            }
        }
    }
    
    public static boolean checkDuplicate(String gameName){
    for (int i = 0; i < index; i++) {
        if (gameNames[i].equalsIgnoreCase(gameName)) {
            System.out.println("The game is present");
            return true;
            }
        }
    System.out.println("The game is not present");
    return false;
    }
    public static void displayGamesInUpperCase() {
        System.out.println("Games in uppercase:");
        for (int i = 0; i < index; i++) {
            if (gameNames[i] != null) {
                System.out.println(gameNames[i].toUpperCase());
            }
        }
    }    
    public static void displayGamesInLowerCase() {
        System.out.println("Games in lowercase:");
        for (int i = 0; i < index; i++) {
            if (gameNames[i] != null) {
                System.out.println(gameNames[i].toLowerCase());
            }
        }
    }
    public static void displayFirstGame() {
        if (index > 0) {
            System.out.println("First game: " + gameNames[0]);
        } else {
            System.out.println("No games saved.");
        }
    }
    public static void method1(int a){
        Sysytem.out.println("")
    }  
}
