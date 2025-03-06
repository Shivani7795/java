public class College{
    static String []names ={null,null,null,null};
    static int index;
    public static void add(String name){
        if (names != null) {
            if (index < names.length) {
                names[index] = name; 
                index++;
                System.out.println("college Name added to the list successfully");
            } else {
                System.out.println("college Name not added to the list, as list is full");
            }
        } else {
            System.out.println("List is null");
        }
    }
    
    public static void read(){
        System.out.println();
        System.out.println("The college Names stored in the array are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void search(String name){
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