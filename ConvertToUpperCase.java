//Write a Java program that takes multiple strings as command-line arguments and converts them to uppercase.
public class ConvertToUpperCase {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      String upperCaseString = "";
      for (int j = 0; j < args[i].length(); j++) {
        char ch = args[i].charAt(j);
        if (ch >= 'a' && ch <= 'z') {
          ch = (char) (ch - 'a' + 'A');
        }
        upperCaseString += ch;
      }
      System.out.println(upperCaseString);
    }
  }
}
