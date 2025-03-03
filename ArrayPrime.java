//Find the array element is prime or not
public class ArrayPrime {
    public static void main(String[] args) {
        int[] arr = {4,7,24,89,4}; 

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean isPrime = true;

            if (num < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= num; j++) { 
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(num + " is a Prime number.");
            } else {
                System.out.println(num + " is NOT a Prime number.");
            }
        }
    }
}