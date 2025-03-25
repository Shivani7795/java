public class AnchorRunner{
	public static void main(String Args[]){
	
	Anchor anchor=new Anchor();
	
	System.out.println("the default Language of the anchor is:" + anchor.language);
	System.out.println("the default Gender of the anchor is:" + anchor.gender);
	System.out.println("the default showtype of the anchor is:" + anchor.showtype);
	System.out.println("the default dresscode of the anchor is:" + anchor.dresscode);

	anchor.language = "kannada";
    anchor.gender = "Female";
    anchor.showtype = "maja talkies";
    anchor.dresscode = "any type";
    System.out.println("the updated Language of the anchor is:" + anchor.language);
	System.out.println("the updated Gender of the anchor is:" + anchor.gender);
	System.out.println("the updated showtype of the anchor is:" + anchor.showtype);
	System.out.println("the updated dresscode of the anchor is:" + anchor.dresscode);


	}
}