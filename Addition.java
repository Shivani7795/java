public class Addition {

    public static void add() {
        System.out.println("No numbers provided. The sum is 0.");
    }

    public static void add(int num1, int num2) {
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
    }

    public static void add(int num1, int num2, int num3) {
        System.out.println("The sum of " + num1 + ", " + num2 + " and " + num3 + " is: " + (num1 + num2 + num3));
    }

    public static void add(double num1, double num2) {
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
    }

    public static void add(int num1, double num2) {
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
    }

    public static void add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("The sum of the array elements is: " + sum);
    }

    public static void add(double[] numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        System.out.println("The sum of the array elements is: " + sum);
    }

    public static void add(int num1, int num2, String description) {
        System.out.println(description + ": The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
    }

    public static void add(float num1, float num2) {
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
    }

    public static void add(double num1, double num2, String unit) {
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2) + " " + unit);
    }

    public static void addRepeated(int num1, int times) {
        int sum = 0;
        for (int i = 0; i < times; i++) {
            sum += num1;
        }
        System.out.println(num1 + " added " + times + " times is: " + sum);
    }

    public static void add(float[] numbers) {
        float sum = 0.0f;
        for (float num : numbers) {
            sum += num;
        }
        System.out.println("The sum of the float array elements is: " + sum);
    }

    public static void add(long num1, long num2) {
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
    }

    public static void add(int num1, float num2) {
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
    }

    public static void add(int num1, int num2, boolean checkPositive) {
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        if (checkPositive) {
            System.out.println("The sum is " + (sum > 0 ? "positive." : "not positive."));
        }
    }

    public static void addSelf(int num1) {
        System.out.println("The sum of " + num1 + " added to itself is: " + (num1 * 2));
    }

    public static void add(double num1, double num2, double num3) {
        System.out.println("The sum of " + num1 + ", " + num2 + " and " + num3 + " is: " + (num1 + num2 + num3));
    }

    public static void add(int[] numbers, int additionalNumber) {
        int sum = additionalNumber;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("The sum of the array elements plus " + additionalNumber + " is: " + sum);
    }

    public static void add(String number1, String number2) {
        try {
            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide numeric strings.");
        }
    }

    public static void add(char charValue, int num) {
        System.out.println("The sum of the ASCII value of '" + charValue + "' and " + num + " is: " + ((int) charValue + num));
    }

    public static void main(String[] args) {
        add();
        add(5, 10);
        add(3, 4, 7);
        add(3.5, 7.2);
        add(4, 6.5);
        add(new int[]{1, 2, 3, 4});
        add(new double[]{1.1, 2.2, 3.3});
        add(4.5f, 6.5f);
        add(5, 3.5, "units");
        addRepeated(3, 5);
        add(new float[]{1.5f, 2.5f, 3.5f});
        add(1000000000L, 2000000000L);
        add(10, 5.5f);
        add(6, 4, true);
        addSelf(15);
        add(1.1, 2.2, 3.3);
        add(new int[]{1, 2, 3}, 10);
        add("15", "20");
        add('A', 10);
    }
}
