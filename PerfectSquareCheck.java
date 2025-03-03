//Check if an array is a perfect square
public class PerfectSquareCheck {
  public static void main(String[] args) {
    int[] array = {4, 9, 15, 25, 30};

    for (int num : array) {
      if (isPerfectSquare(num)) {
        System.out.println(num + " is a perfect square.");
      } else {
        System.out.println(num + " is not a perfect square.");
      }
    }
  }

  public static boolean isPerfectSquare(int num) {
    if (num < 0) {
      return false;
    }

    for (int i = 1; i * i <= num; i++) {
      if (i * i == num) {
        return true;
      }
    }

    return false;
  }
}
