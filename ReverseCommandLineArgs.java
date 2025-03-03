//Write a Java program that takes multiple strings as command-line arguments and prints them in reverse order.
public class ReverseCommandLineArgs {
  public static void main(String[] args) {
    for (int i = args.length - 1; i >= 0; i--) {
      System.out.println(args[i]);
    }
  }
}
