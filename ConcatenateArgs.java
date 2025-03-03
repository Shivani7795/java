//Write a Java program that concatenates all the command-line arguments into a single string and prints it.
public class ConcatenateArgs {
  public static void main(String[] args) {
    String concatenatedString = "";

  
    for (int i = 0; i < args.length; i++) {
      concatenatedString += args[i];
      if (i < args.length - 1) {
        concatenatedString += " "; 
      }
    }

    System.out.println("Concatenated string: " + concatenatedString);
  }
}
