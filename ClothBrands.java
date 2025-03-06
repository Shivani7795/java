public class ClothBrands{
    static String []names ={null,null,null,null};
    static int index;
    public static void addBrand(String name){
        if (names != null) {
            if (index < names.length) {
                names[index] = name; 
                index++;
                System.out.println("Brand Name added to the list successfully");
            } else {
                System.out.println("Brand Name not added to the list, as list is full");
            }
        } else {
            System.out.println("List is null");
        }
    }
    
    public static void displayBrand(){
        System.out.println();
        System.out.println("The Brand Names stored in the array are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void searchBrand(String name){
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