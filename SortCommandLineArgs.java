//Write a Java program that takes multiple strings as command-line arguments and prints them in alphabetical order.
public class SortCommandLineArgs {
  public static void main(String[] args) {
    
    for (int i = 0; i < args.length - 1; i++) {
      for (int j = 0; j < args.length - 1 - i; j++) {
        if (args[j].compareTo(args[j + 1]) > 0) {
          String temp = args[j];
          args[j] = args[j + 1];
          args[j + 1] = temp;
        }
      }
    }

    System.out.println("Command-line arguments in alphabetical order:");
    for (String arg : args) {
      System.out.println(arg);
    }
  }
}
