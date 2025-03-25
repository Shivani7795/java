public class BedRunner{
	public static void main(String Args[]){
	
	Bed bed=new Bed();
	
	System.out.println("the default Size of the Bed is:" + bed.size);
	System.out.println("the default mattress of the bed is:" + bed.mattress);
	System.out.println("the default brand of the bed is:" + bed.brand);
	System.out.println("the default colour of the bed is:" + bed.colour);

	bed.size = "30x30";
    bed.mattress = "Spring";
    bed.brand = "SleepWell";
    bed.colour = "White";
    System.out.println("the updated Size of the bed is:" + bed.size);
	System.out.println("the updated mattress of the bed is:" + bed.mattress);
	System.out.println("the updated brand of the bed is:" + bed.brand);
	System.out.println("the updated colour of the bed is:" + bed.colour);


	}
}