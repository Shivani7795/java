//Write a Java program that counts the number of command-line arguments provided and displays the count.
public class CommandLineArgsCount {
  public static void main(String[] args) {
    int count = 0;

    for (String arg : args) {
      count++;
    }

    System.out.println("Number of command-line arguments provided: " + count);
  }
}
