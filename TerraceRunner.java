public class TerraceRunner{
	public static void main(String Args[]){
	
	Terrace terrace=new Terrace();
	
	System.out.println("the default Size of the terrace is:" + terrace.size);
	System.out.println("the default material of the terrace is:" + terrace.material);
	System.out.println("the default Boundary of the terrace is:" + terrace.boundary);
	System.out.println("default type of the activity can be made is:" + terrace.activitySpaces);

	terrace.size = "300x300";
    terrace.material = "marble";
    terrace.boundary = "steel railing";
    terrace.activitySpaces = "gym";
    System.out.println("the updated Size of the terrace is:" + terrace.size);
	System.out.println("the updated material of the terrace is:" + terrace.material);
	System.out.println("the updated Boundary of the terrace is:" + terrace.boundary);
	System.out.println("the updated type of the activity can be made is:" + terrace.activitySpaces);


	}
}