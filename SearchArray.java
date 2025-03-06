//Write a method to search if the given productName is present in the array or not.
public class SearchArray{
	static String []productName={null,null,null,null};
	static int index;

	public static void productNames(String name){		
		if (productName != null){
			if (index < productName.length){
				productName[index] = name;
				index++;
				System.out.println("product is addesd successfully");
			}else {
            System.out.println("no space to add the product");
        }
        }else{
        	System.out.println("list is empty");
        }
    }
	public static void displayName(){
		System.out.println();
		System.out.println(" the product names are:" );
		for (int i = 0; i < productName.length;i++){
			System.out.println(productName[i]);
		}
    }
    public static void searchName(String name){
		System.out.println();
		for(int i = 0; i < index;i++){
			if(productName[i].equalsIgnoreCase(name)){
			System.out.println(name + " the product name is found" + (i + 1));
			return;
		}
	}
	System.out.println(name + "the product is not present");
    }
}