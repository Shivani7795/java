public class IronBoxRunner{
	public static void main(String Args[]){
	
	IronBox ironbox=new IronBox();
	
	System.out.println("the default length of the ironbox is:" + ironbox.length);
	System.out.println("the default type of the ironbox is:" + ironbox.type);
	System.out.println("the default weight of the ironbox is:" + ironbox.weight);
	System.out.println("the default price of the ironbox is:" + ironbox.price);

	ironbox.length = "5 m";
    ironbox.type = "Steam";
    ironbox.weight = "5 Kg";
    ironbox.price = "1500";
    System.out.println("the updated length of the ironbox is:" + ironbox.length);
	System.out.println("the updated type of the ironbox is:" + ironbox.type);
	System.out.println("the updated weight of the ironbox is:" + ironbox.weight);
	System.out.println("the updated price of the ironbox is:" + ironbox.price);


	}
}