public class Multiplication {

    public static void multiply() {
        System.out.println("No numbers provided. The result is 1.");
    }

    public static void multiply(int num1, int num2) {
        System.out.println("The result of multiplying " + num1 + " and " + num2 + " is: " + (num1 * num2));
    }

    public static void multiply(int num1, int num2, int num3) {
        System.out.println("The result of multiplying " + num1 + ", " + num2 + ", and " + num3 + " is: " + (num1 * num2 * num3));
    }

    public static void multiply(double num1, double num2) {
        System.out.println("The result of multiplying " + num1 + " and " + num2 + " is: " + (num1 * num2));
    }

    public static void multiply(int num1, double num2) {
        System.out.println("The result of multiplying " + num1 + " and " + num2 + " is: " + (num1 * num2));
    }

    public static void multiply(int[] numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        System.out.println("The result of multiplying all elements in the array is: " + result);
    }

    public static void multiply(double[] numbers) {
        double result = 1.0;
        for (double num : numbers) {
            result *= num;
        }
        System.out.println("The result of multiplying all elements in the array is: " + result);
    }

    public static void multiply(int num1, int num2, String description) {
        System.out.println(description + ": The result of multiplying " + num1 + " and " + num2 + " is: " + (num1 * num2));
    }

    public static void multiply(float num1, float num2) {
        System.out.println("The result of multiplying " + num1 + " and " + num2 + " is: " + (num1 * num2));
    }

    public static void multiply(double num1, double num2, String unit) {
        System.out.println("The result of multiplying " + num1 + " and " + num2 + " is: " + (num1 * num2) + " " + unit);
    }

    public static void multiplyRepeated(int num1, int times) {
        int result = 1;
        for (int i = 0; i < times; i++) {
            result *= num1;
        }
        System.out.println(num1 + " multiplied " + times + " times is: " + result);
    }

    public static void multiply(float[] numbers) {
        float result = 1.0f;
        for (float num : numbers) {
            result *= num;
        }
        System.out.println("The result of multiplying all elements in the float array is: " + result);
    }

    public static void multiply(long num1, long num2) {
        System.out.println("The result of multiplying " + num1 + " and " + num2 + " is: " + (num1 * num2));
    }

    public static void multiply(int num1, float num2) {
        System.out.println("The result of multiplying " + num1 + " and " + num2 + " is: " + (num1 * num2));
    }

    public static void multiplySelf(int num1) {
        System.out.println("The result of multiplying " + num1 + " by itself is: " + (num1 * num1));
    }

    public static void multiply(double num1, double num2, double num3) {
        System.out.println("The result of multiplying " + num1 + ", " + num2 + ", and " + num3 + " is: " + (num1 * num2 * num3));
    }

    public static void multiply(int[] numbers, int additionalNumber) {
        int result = additionalNumber;
        for (int num : numbers) {
            result *= num;
        }
        System.out.println("The result of multiplying the array elements and " + additionalNumber + " is: " + result);
    }

    public static void multiply(String number1, String number2) {
        try {
            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);
            System.out.println("The result of multiplying " + num1 + " and " + num2 + " is: " + (num1 * num2));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide numeric strings.");
        }
    }

    public static void multiply(char charValue, int num) {
        System.out.println("The result of multiplying the ASCII value of '" + charValue + "' and " + num + " is: " + ((int) charValue * num));
    }

    public static void main(String[] args) {
        multiply();
        multiply(5, 4);
        multiply(3, 2, 1);
        multiply(2.5, 4.0);
        multiply(3, 1.5);
        multiply(new int[]{2, 3, 4});
        multiply(new double[]{1.5, 2.5, 3.5});
        multiply(2, 5, "Multiplication Example");
        multiply(2.5f, 3.5f);
        multiply(4.0, 2.0, "square meters");
        multiplyRepeated(2, 3);
        multiply(new float[]{1.2f, 2.3f, 3.4f});
        multiply(500L, 300L);
        multiply(5, 2.5f);
        multiplySelf(4);
        multiply(2.5, 3.5, 4.5);
        multiply(new int[]{2, 3, 4}, 5);
        multiply("4", "5");
        multiply('B', 2);
    }
}
