public class CricketTeam{
    static String []names ={null,null,null,null};
    static int index;
    public static void storeTeam(String name){
        if (names != null) {
            if (index < names.length) {
                names[index] = name; 
                index++;
                System.out.println("Team Name added to the list successfully");
            } else {
                System.out.println("Team Name not added to the list, as list is full");
            }
        } else {
            System.out.println("List is null");
        }
    }
    
    public static void readTeam(){
        System.out.println();
        System.out.println("The Team Names stored in the array are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void searchTeam(String name){
        System.out.println();
        for (int i = 0; i < index; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                System.out.println(name + " found at position " + (i + 1));
                return;
            }
        }
        System.out.println(name + " not found in the list.");
    }
}