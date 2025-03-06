public class User{
	static String []name={null,null,null,null};
	static int index;

	public static void UserNameList(String abc){
		if (name !=null){
			if(index < name.length){
				name[index]=abc;
				index++;
				System.out.println("user name added succesfully ");                
			}
			else{
				System.out.println("names ");
			}
		}
		else{
			System.out.println("can't add names");
		}			
	}
}