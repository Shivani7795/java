//Write a Java program that takes multiple strings as command-line arguments and converts them to uppercase.
public class UpCa {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No strings provided.");
            return;
        }
		for (int i = 0; i < args.length; i++) {
            args[i] = toUpperCase(args[i]);
        }

        System.out.println("Strings in uppercase:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
		public static String toUpperCase(String str) {
        	char[] chars = str.toCharArray();
        	for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - ('a' - 'A'));
            }
        }
        return new String(chars);
    }
}
