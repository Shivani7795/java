public class StanzaRunner {
    public static void main(String args[]) {
        Stanza stanza1 = new Stanza("Sonnet 18");
        stanza1.info();
        Stanza stanza2 = new Stanza("Sonnet 18", "William Shakespeare");
        stanza2.info();
        Stanza stanza3 = new Stanza("Sonnet 18", "William Shakespeare", 14);
        stanza3.info();
        Stanza stanza4 = new Stanza("Sonnet 18", "William Shakespeare", 14, "1609");
        stanza4.info();
        Stanza stanza5 = new Stanza("Sonnet 18", "William Shakespeare", 14, "1609", "Sonnet");
        stanza5.info();
        Stanza stanza6 = new Stanza("Sonnet 18", "William Shakespeare", 14, "1609", "Sonnet", "Iambic Pentameter");
        stanza6.info();
        Stanza stanza7 = new Stanza("Sonnet 18", "William Shakespeare", 14, "1609", "Sonnet", "Iambic Pentameter", "Love and Beauty");
        stanza7.info();
        Stanza stanza8 = new Stanza("Sonnet 18", "William Shakespeare", 14, "1609", "Sonnet", "Iambic Pentameter", "Love and Beauty", "English");
        stanza8.info();
        Stanza stanza9 = new Stanza("Sonnet 18", "William Shakespeare", 14, "1609", "Sonnet", "Iambic Pentameter", "Love and Beauty", "English", "Shall I compare thee to a summer's day?");
        stanza9.info();
        Stanza stanza10 = new Stanza("Sonnet 18", "William Shakespeare", 14, "1609", "Sonnet", "Iambic Pentameter", "Love and Beauty", "English", "Shall I compare thee to a summer's day?", "Renaissance");
        stanza10.info();
    }
}