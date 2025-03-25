public class Subtraction {

    public static void subtract() {
        System.out.println("No numbers provided. The result is 0.");
    }

    public static void subtract(int num1, int num2) {
        System.out.println("The result of subtracting " + num2 + " from " + num1 + " is: " + (num1 - num2));
    }

    public static void subtract(int num1, int num2, int num3) {
        System.out.println("The result of subtracting " + num2 + " and " + num3 + " from " + num1 + " is: " + (num1 - num2 - num3));
    }

    public static void subtract(double num1, double num2) {
        System.out.println("The result of subtracting " + num2 + " from " + num1 + " is: " + (num1 - num2));
    }

    public static void subtract(int num1, double num2) {
        System.out.println("The result of subtracting " + num2 + " from " + num1 + " is: " + (num1 - num2));
    }

    public static void subtract(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        System.out.println("The result of subtracting all elements in the array is: " + result);
    }

    public static void subtract(double[] numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        System.out.println("The result of subtracting all elements in the array is: " + result);
    }

    public static void subtract(int num1, int num2, String description) {
        System.out.println(description + ": The result of subtracting " + num2 + " from " + num1 + " is: " + (num1 - num2));
    }

    public static void subtract(float num1, float num2) {
        System.out.println("The result of subtracting " + num2 + " from " + num1 + " is: " + (num1 - num2));
    }

    public static void subtract(double num1, double num2, String unit) {
        System.out.println("The result of subtracting " + num2 + " from " + num1 + " is: " + (num1 - num2) + " " + unit);
    }

    public static void subtractRepeated(int num1, int times) {
        int result = num1;
        for (int i = 1; i < times; i++) {
            result -= num1;
        }
        System.out.println(num1 + " subtracted " + (times - 1) + " times is: " + result);
    }

    public static void subtract(float[] numbers) {
        float result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        System.out.println("The result of subtracting all elements in the float array is: " + result);
    }

    public static void subtract(long num1, long num2) {
        System.out.println("The result of subtracting " + num2 + " from " + num1 + " is: " + (num1 - num2));
    }

    public static void subtract(int num1, float num2) {
        System.out.println("The result of subtracting " + num2 + " from " + num1 + " is: " + (num1 - num2));
    }

    public static void subtract(int num1, int num2, boolean checkPositive) {
        int result = num1 - num2;
        System.out.println("The result of subtracting " + num2 + " from " + num1 + " is: " + result);
        if (checkPositive) {
            System.out.println("The result is " + (result > 0 ? "positive." : "not positive."));
        }
    }

    public static void subtractSelf(int num1) {
        System.out.println("The result of subtracting " + num1 + " from itself is: 0");
    }

    public static void subtract(double num1, double num2, double num3) {
        System.out.println("The result of subtracting " + num2 + " and " + num3 + " from " + num1 + " is: " + (num1 - num2 - num3));
    }

    public static void subtract(int[] numbers, int additionalNumber) {
        int result = numbers[0] - additionalNumber;
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        System.out.println("The result of subtracting the array elements and " + additionalNumber + " is: " + result);
    }

    public static void subtract(String number1, String number2) {
        try {
            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);
            System.out.println("The result of subtracting " + num2 + " from " + num1 + " is: " + (num1 - num2));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide numeric strings.");
        }
    }

    public static void subtract(char charValue, int num) {
        System.out.println("The result of subtracting " + num + " from the ASCII value of '" + charValue + "' is: " + ((int) charValue - num));
    }

    public static void main(String[] args) {
        subtract();
        subtract(15, 10);
        subtract(30, 5, 10);
        subtract(7.5, 3.2);
        subtract(8, 2.5);
        subtract(new int[]{20, 5, 3});
        subtract(new double[]{50.5, 20.2, 10.1});
        subtract(15, 5, "Subtraction Example");
        subtract(4.5f, 2.2f);
        subtract(50.2, 25.1, "meters");
        subtractRepeated(10, 3);
        subtract(new float[]{10.5f, 3.2f, 1.1f});
        subtract(100000L, 50000L);
        subtract(25, 5.5f);
        subtract(20, 10, true);
        subtractSelf(12);
        subtract(100.5, 30.5, 20.5);
        subtract(new int[]{100, 10, 5}, 20);
        subtract("50", "30");
        subtract('A', 10);
    }
}

