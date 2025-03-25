public class Colours {
	public static void displayColour() {
        System.out.println("The colour is red.");
    }
    public static void displayColour(String colour) {
        System.out.println("The colour is: " + colour);
    }
    public static void displayColour(String colour, String shade) {
        System.out.println("The colour is: " + colour + " with a shade of: " + shade);
    }
    public static void displayColour(String colour, int brightness) {
        System.out.println("The colour is: " + colour + " with brightness level: " + brightness);
    }

    public static void displayColour(String colour, boolean isBright) {
        String brightness = isBright ? "bright" : "dark";
        System.out.println("The colour is: " + colour + " and it is a " + brightness + " colour.");
    }

    public static void displayColour(String colour, double opacity) {
        System.out.println("The colour is: " + colour + " with opacity: " + opacity);
    }

    public static void displayColour(String colour, String shade, boolean isBright) {
        String brightness = isBright ? "bright" : "dark";
        System.out.println("The colour is: " + colour + " with a shade of: " + shade + " and it is a " + brightness + " colour.");
    }

    public static void displayColour(String colour, String shade, int brightness) {
        System.out.println("The colour is: " + colour + " with a shade of: " + shade + " and brightness level: " + brightness);
    }

    public static void displayColour(String colour, String description, String country) {
        System.out.println("The colour is: " + colour + ", described as: " + description + ", and popular in: " + country);
    }

    public static void displayColour(int count) {
        System.out.println("Number of colours in the palette: " + count);
    }

    public static void displayColour(String colour, char initial) {
        System.out.println("The colour is: " + colour + ", and it starts with the letter: " + initial);
    }

    public static void displayColour(boolean isFavourite) {
        System.out.println("Is this your favourite colour? " + (isFavourite ? "Yes" : "No"));
    }

    public static void displayColour(double transparency, boolean isVisible) {
        System.out.println("Transparency: " + transparency + " and visibility: " + (isVisible ? "Yes" : "No"));
    }

    public static void displayColour(String[] colours) {
        System.out.print("The palette contains: ");
        for (String colour : colours) {
            System.out.print(colour + " ");
        }
        System.out.println();
    }

    public static void displayColour(String colour, int count, boolean isBright) {
        String brightness = isBright ? "bright" : "dark";
        System.out.println("The colour is: " + colour + ", appears " + count + " times, and it is a " + brightness + " colour.");
    }

    public static void displayColour(int count, String primaryColour) {
        System.out.println("There are " + count + " colours, and the primary colour is: " + primaryColour);
    }

    public static void displayColour(char grade, String colour) {
        System.out.println("The colour grade is: " + grade + " and the colour is: " + colour);
    }

    public static void displayColour(float gradient) {
        System.out.println("The gradient of the colour is: " + gradient);
    }

    public static void displayColour(String colour, float intensity) {
        System.out.println("The colour is: " + colour + " with an intensity of: " + intensity);
    }
    public static void main(String[] args) {
        displayColour();
        displayColour("Blue");
        displayColour("Green", "Light");
        displayColour("Yellow", true);
        displayColour("Purple", 75);
        displayColour("Orange", 0.5);
        displayColour("Pink", "Pastel", false);
        displayColour("Teal", "Dark", 80);
        displayColour("Maroon", "Bold", "India");
        displayColour(5);
        displayColour("Cyan", 'C');
        displayColour(false);
        displayColour(0.7, true);
        displayColour(new String[]{"Red", "Blue", "Green", "Yellow"});
        displayColour("Aqua", 3, false);
        displayColour(10, "White");
        displayColour('A', "Black");
        displayColour(0.8f);
        displayColour("Peach", 0.9f);
        displayColour("Magenta", "Spring", true );
    }  
}
