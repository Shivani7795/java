public class Stanza {
    String title;
    String author;
    int numberOfLines;
    String publicationDate;
    String type;
    String meter;
    String theme;
    String language;
    String quotation;
    String literaryEra;

    public Stanza() {

    }

    public Stanza(String title) {
        this.title = title;
    }

    public Stanza(String title, String author) {
        this(title);
        this.author = author;
    }

    public Stanza(String title, String author, int numberOfLines) {
        this(title, author);
        this.numberOfLines = numberOfLines;
    }

    public Stanza(String title, String author, int numberOfLines, String publicationDate) {
        this(title, author, numberOfLines);
        this.publicationDate = publicationDate;
    }

    public Stanza(String title, String author, int numberOfLines, String publicationDate, String type) {
        this(title, author, numberOfLines, publicationDate);
        this.type = type;
    }

    public Stanza(String title, String author, int numberOfLines, String publicationDate, String type, String meter) {
        this(title, author, numberOfLines, publicationDate, type);
        this.meter = meter;
    }

    public Stanza(String title, String author, int numberOfLines, String publicationDate, String type, String meter, String theme) {
        this(title, author, numberOfLines, publicationDate, type, meter);
        this.theme = theme;
    }

    public Stanza(String title, String author, int numberOfLines, String publicationDate, String type, String meter, String theme, String language) {
        this(title, author, numberOfLines, publicationDate, type, meter, theme);
        this.language = language;
    }

    public Stanza(String title, String author, int numberOfLines, String publicationDate, String type, String meter, String theme, String language, String quotation) {
        this(title, author, numberOfLines, publicationDate, type, meter, theme, language);
        this.quotation = quotation;
    }

    public Stanza(String title, String author, int numberOfLines, String publicationDate, String type, String meter, String theme, String language, String quotation, String literaryEra) {
        this(title, author, numberOfLines, publicationDate, type, meter, theme, language, quotation);
        this.literaryEra = literaryEra;
    }

    public void info() {
        System.out.println("Stanza Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of Lines: " + numberOfLines);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println("Type: " + type);
        System.out.println("Meter: " + meter);
        System.out.println("Theme: " + theme);
        System.out.println("Language: " + language);
        System.out.println("Quotation: " + quotation);
        System.out.println("Literary Era: " + literaryEra);
        System.out.println("---------------------");
    }
}