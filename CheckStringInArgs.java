 //Write a Java program that checks if a specific string (e.g., "Java") exists as a command-line argument and prints whether or not it is present.
 public class CheckStringInArgs {
  public static void main(String[] args) {
    String targetString = "Java"; 
    boolean found = false;

    for (int i = 0; i < args.length; i++) {
      if (args[i].equals(targetString)) {
        found = true;
        break;
      }
    }

    if (found) {
      System.out.println("The string \"" + targetString + "\" is present in the command-line arguments.");
    } else {
      System.out.println("The string \"" + targetString + "\" is not present in the command-line arguments.");
    }
  }
}
