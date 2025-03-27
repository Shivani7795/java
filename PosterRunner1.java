public class PosterRunner {
    public static void main(String args[]) {
        Poster poster1 = new Poster("Motivational Quote");
        poster1.info();
        Poster poster2 = new Poster("Motivational Quote", 50);
        poster2.info();
        Poster poster3 = new Poster("Motivational Quote", 50, "Glossy");
        poster3.info();
        Poster poster4 = new Poster("Motivational Quote", 50, "Glossy", "Multi-color");
        poster4.info();
        Poster poster5 = new Poster("Motivational Quote", 50, "Glossy", "Multi-color", 300.0);
        poster5.info();
        Poster poster6 = new Poster("Motivational Quote", 50, "Glossy", "Multi-color", 300.0, "Dobby");
        poster6.info();
        Poster poster7 = new Poster("Motivational Quote", 50, "Glossy", "Multi-color", 300.0, "Dobby", "Shivani");
        poster7.info();
        Poster poster8 = new Poster("Motivational Quote", 50, "Glossy", "Multi-color", 300.0, "Dobby", "Shivani", "Paper");
        poster8.info();
        Poster poster9 = new Poster("Motivational Quote", 50, "Glossy", "Multi-color", 300.0, "Dobby", "Shivani", "Paper", "18x24 inches");
        poster9.info();
        Poster poster10 = new Poster("Motivational Quote", 50, "Glossy", "Multi-color", 300.0, "Dobby", "Shivani", "Paper", "18x24 inches", "Inspirational");
        poster10.info();
    }
}
