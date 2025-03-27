public class PaintBrushRunner {
    public static void main(String[] args) {
        PaintBrush paintBrush1 = new PaintBrush(1, "Artist's Choice", "Camel", "India", "Synthetic", 
                                                "Round", 15.0, "John Artis", 2020, "Yellow", 
                                                "Fine Tip", "Plastic", 200.0, "Watercolor", 
                                                "Flexible Bristles", true, "Handcrafted", 
                                                "Comfort Grip", "Artists");

        PaintBrush paintBrush2 = new PaintBrush(2, "ProStrokes", "Winsor & Newton", "UK", "Natural Hair", 
                                                "Flat", 20.0, "William Winsor", 2015, "Black", 
                                                "Chisel Edge", "Wood", 500.0, "Oil Paint", 
                                                "Durable Construction", false, "Mass-Produced", 
                                                "Ergonomic Handle", "Professionals");

        PaintBrush paintBrush3 = new PaintBrush(3, "QuickPaint", "Faber-Castell", "Germany", "Synthetic", 
                                                "Angled", 10.0, "Kaspar Faber", 2018, "Red", 
                                                "Slanted Tip", "Metal", 150.0, "Acrylic Paint", 
                                                "Lightweight Design", true, "Machine-Crafted", 
                                                "Easy Grip", "Beginners");

        paintBrush1.paintBrushDetails();
        System.out.println("-------------------------------------------");
        paintBrush2.paintBrushDetails();
        System.out.println("-------------------------------------------");
        paintBrush3.paintBrushDetails();
    }
}