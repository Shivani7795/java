public class CompanyDetails {

    static String companyName = "Amazon";
    static String ceoName = "ABC";
    static String baName = "EFG";
    static int no_ofemployee = 50;
    static String employee1 = "XYZ";
    static String address1 = "Bangalore";
    static String department1 = "HIJ";
    static String employee2 = "WXYZ";
    static String address2 = "Mangalore";
    static String department2 = "HIJK";
    static String startDate = "24/02/2025";
    static long contact = 1234567890L; 
    static int salary = 50000;
    static boolean workFromHome = true;


    public static void main(String[] args) {
        if (companyName.equals("Amazon")) {
            System.out.println("The name of the Company is: " + companyName);
        }
        if (ceoName.equals("ABC")) {
            System.out.println("CEO name of the Company: " + ceoName);
        }
        if (baName.equals("EFG")) {
            System.out.println("Brand Ambassador name of the Company: " + baName);
        }
        if (no_ofemployee == 50) {
            System.out.println("Number of Employees of the Company: " + no_ofemployee);
        }
        if (employee1.equals("XYZ")) {
            System.out.println("Name of 1st Employee of the Company: " + employee1);
        }
        if (address1.equals("Bangalore")) {
            System.out.println("Address of the Employee 1: " + address1);
        }
        if (department1.equals("HIJ")) {
            System.out.println("Department of the Employee: " + department1);
        }
        if (employee2.equals("WXYZ")) {
            System.out.println("Name of 2nd Employee of the Company: " + employee2);
        }
        if (address2.equals("Mangalore")) {
            System.out.println("Address of the 2nd Employee: " + address2);
        }
        if (department2.equals("HIJK")) {
            System.out.println("Department of the 2nd Employee: " + department2);
        }
        if (startDate.equals("24/02/2025")) {
            System.out.println("Start Date of Employee: " + startDate);
        }
        if (contact == 1234567890L) {
            System.out.println("Contact Number of the Employee: " + contact);
        }
        if (salary == 50000) {
            System.out.println("Salary of Employee: " + salary);
        }
        if (workFromHome == true) {
            System.out.println("Can Employee work from Home: " + workFromHome);
        }
    }
}
