public class CountGreaterThan {
  public static void main(String[] args) {
    int[] array = {10, 20, 15, 30, 25, 5};
    int specificValue = 15;

    int count = 0;

    for (int num : array) {
      if (num > specificValue) {
        count++;
      }
    }

    System.out.println("Number of elements greater than " + specificValue + ": " + count);
  }
}
