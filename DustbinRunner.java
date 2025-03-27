public class DustbinRunner {
    public static void main(String[] args) {
        Dustbin dustbin1 = new Dustbin(1, 45.5, 30.0, 60.0, "Aristo", "Blue", "Plastic",
            "Modern", "Rectangular", "Round", "Swing", 4, "Hook", 2, 1, "bedroom",
            "Manual", "Dry", "Aditi", "Ayaan");

        Dustbin dustbin2 = new Dustbin(2, 50.0, 35.0, 65.0, "Cello", "Green", "Metal",
            "Classic", "Circular", "Sharp", "Push", 3, "Ring", 1, 2, "kitchen",
            "Automatic", "Wet", "Ananya", "Adya");

        Dustbin dustbin3 = new Dustbin(3, 40.0, 25.0, 55.0, "Supreme", "Red", "Wood",
            "Vintage", "Square", "Flat", "Lift", 2, "Clamp", 0, 1, "bus stop",
            "Slide", "Mixed", "Kabir", "Kiara");

        dustbin1.dustbin();
        System.out.println("-------------------------------------------");
        dustbin2.dustbin();
        System.out.println("-------------------------------------------");
        dustbin3.dustbin();
    }
}