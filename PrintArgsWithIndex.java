//Write a Java program that prints each command-line argument along with its index.
public class PrintArgsWithIndex {
  public static void main(String[] args) {
    
    for (int i = 0; i < args.length; i++) {
      System.out.println("Index " + i + ": " + args[i]);
    }
  }
}
