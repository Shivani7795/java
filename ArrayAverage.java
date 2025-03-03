//Find the avg of all the array elements
public class ArrayAverage {
  public static void main(String[] args) {
    int[] array = {60, 60, 30, 50, 30, 40};

    int sum = 0;
    for (int num : array) {
      sum += num;
    }

    double average = (double) sum / array.length;

    System.out.println("The average of all the array elements is: " + average);
  }
}
