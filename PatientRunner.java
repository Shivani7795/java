public class PatientRunner{
	public static void main(String Args[]){
	
	Patient patient=new Patient();
	
	System.out.println("the default name of the patient is:" + patient.name);
	System.out.println("the default age of the patient is:" + patient.age);
	System.out.println("the default gender of the patient is:" + patient.gender);
	System.out.println("the default type of the patient is:" + patient.type);

	patient.name = "Vidya";
    patient.age = 25;
    patient.gender = "female";
    patient.type = "fever";
    System.out.println("the updated name of the patient is:" + patient.name);
	System.out.println("the updated age of the patient is:" + patient.age);
	System.out.println("the updated gender of the patient is:" + patient.gender);
	System.out.println("the updated type of the patient is:" + patient.type);


	}
}