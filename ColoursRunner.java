public class Numbers {

    public static void displayNumber() {
        System.out.println("The default number is 0.");
    }

    public static void displayNumber(int number) {
        System.out.println("The number is: " + number);
    }

    public static void displayNumber(int number, String description) {
        System.out.println("The number is: " + number + ", described as: " + description);
    }

    public static void displayNumber(double number) {
        System.out.println("The number is: " + number);
    }

    public static void displayNumber(int number, boolean isEven) {
        String type = isEven ? "even" : "odd";
        System.out.println("The number is: " + number + ", and it is " + type + ".");
    }

    public static void displayNumber(int number, int multiplier) {
        System.out.println("The number is: " + number + " multiplied by " + multiplier + " is " + (number * multiplier));
    }

    public static void displayNumber(double number, String unit) {
        System.out.println("The number is: " + number + " " + unit);
    }

    public static void displayNumber(int number, int divisor, boolean isDivisible) {
        String divisibility = isDivisible ? "divisible" : "not divisible";
        System.out.println("The number " + number + " is " + divisibility + " by " + divisor + ".");
    }

    public static void displayNumber(int[] numbers) {
        System.out.print("The array contains: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayNumber(int number, char grade) {
        System.out.println("The number is: " + number + " with a grade of: " + grade);
    }

    public static void displayNumber(boolean isPositive) {
        System.out.println("Is the number positive? " + (isPositive ? "Yes" : "No"));
    }

    public static void displayNumber(double percentage, boolean isPass) {
        System.out.println("The percentage is: " + percentage + ", and the result is " + (isPass ? "Pass" : "Fail") + ".");
    }

    public static void displayNumber(float[] numbers) {
        System.out.print("The float array contains: ");
        for (float num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void displayNumber(int number, int power, boolean isValidPower) {
        if (isValidPower) {
            System.out.println("The number " + number + " raised to the power of " + power + " is " + Math.pow(number, power) + ".");
        } else {
            System.out.println("Invalid power value for the number " + number);
        }
    }

    public static void displayNumber(int count, int sum) {
        System.out.println("Count of numbers: " + count + ", Sum: " + sum);
    }

    public static void displayNumber(char symbol, int number) {
        System.out.println("The symbol is: " + symbol + " and the associated number is: " + number);
    }

    public static void displayNumber(float gradient) {
        System.out.println("The gradient of the numbers is: " + gradient);
    }

    public static void displayNumber(int number, float ratio) {
        System.out.println("The number is: " + number + " with a ratio of: " + ratio);
    }

    public static void displayNumber(String number, boolean isNumeric) {
        System.out.println("The input \"" + number + "\" is " + (isNumeric ? "a number." : "not a number."));
    }

    // NEW METHOD: Display the factorial of a number
    public static void displayNumberFactorial(int number) {
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }

    public static void main(String[] args) {
        displayNumber();
        displayNumber(10);
        displayNumber(42, "Meaning of life");
        displayNumber(3.14);
        displayNumber(7, true);
        displayNumber(5, 2);
        displayNumber(9.8, "meters per second squared");
        displayNumber(12, 4, true);
        displayNumber(new int[]{1, 2, 3, 4, 5});
        displayNumber(8, 'A');
        displayNumber(true);
        displayNumber(75.5, false);
        displayNumber(new float[]{2.5f, 3.6f, 4.7f});
        displayNumber(2, 3, true);
        displayNumber(5, 15);
        displayNumber('@', 6);
        displayNumber(1.5f);
        displayNumber(10, 0.5f);
        displayNumber("12345", true);
        displayNumberFactorial(5);
    }
}
