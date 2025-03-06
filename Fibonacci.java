//Write a method to find the Fibonacci of the number.
public class Fibonacci{
    public static void display() {
    	int number = 10;
        int first = 0, second = 1, fibonacci = 0;

        if (number == 0) {
            fibonacci = first; 
        } else if (number == 1) {
            fibonacci = second; 
        } else {
            
            for (int i = 2; i <= number; i++) {
                fibonacci = first + second;
                first = second;
                second = fibonacci;
            }
        }

        System.out.println("The Fibonacci number at position " + number + " is " + fibonacci);
        
    }
}
