public class Cosmetics{
	static String name = {null,null,null,null};
	static index;
	public static void type(String names){
        if (name != null) {
            if (index < name.length) {
                name[index] = name; 
                index++;
                System.out.println("product name added to the list successfully");
            } else {
                System.out.println("list is full.Product name not added to the list, ");
            }
        } else {
            System.out.println("List is null");
        }
    }

    public static void search(String names){
        System.out.println();
        for (int i = 0; i < index; i++) {
            if (name[i].equalsIgnoreCase(name)) {
                System.out.println(name + " found at position " + (i + 1));
                return;
            }
        }
        System.out.println(name + " not found in the list.");

    }
/*    public static boolean isPresent(String name){
    	for  ;
    	System.out.println("the product is present")
    	return true;
    }
    public static String product(String name){
        if(!present){
        	System.out.println();
        }  */


        public static boolean isPresent(String productName) {
        for (int i = 0; i < index; i++) {
            if (name[i] != null && name[i].equalsIgnoreCase(productName)) {
                System.out.println("The product is present");
                return true;
            }
        }
        System.out.println("The product is not present");
        return false;
    }

    // Method to perform an action with a product name
    public static void product(String productName) {
        if (isPresent(productName)) {
            System.out.println("Performing action with the product: " + productName);
        } else {
            System.out.println("Product not found for action.");
        }
    }     
}
