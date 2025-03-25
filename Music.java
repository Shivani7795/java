public class Music {
    public static void describeMusic() {
        System.out.println("Music is a universal language that connects people across the world.");
    }

    public static void describeMusic(String genre) {
        System.out.println(genre + " music is a distinct style enjoyed by many.");
    }

    public static void describeMusic(String genre, String artist) {
        System.out.println(genre + " music is beautifully represented by artists like " + artist + ".");
    }

    public static void describeMusic(String genre, int bpm) {
        System.out.println(genre + " music often has a tempo of " + bpm + " beats per minute.");
    }

    public static void describeMusic(String songTitle, String artist, String mood) {
        System.out.println("\"" + songTitle + "\" by " + artist + " is a " + mood + " song that resonates with listeners.");
    }

    public static void describeMusic(String instrument, boolean isAcoustic) {
        System.out.println(instrument + " is " + (isAcoustic ? "an acoustic instrument." : "not an acoustic instrument."));
    }

    public static void describeMusic(String album, int year) {
        System.out.println("The album \"" + album + "\" was released in " + year + ".");
    }

    public static void describeMusic(String genre, String characteristic, boolean isPopular) {
        System.out.println(genre + " music is known for its " + characteristic + " and is " + (isPopular ? "widely popular." : "not very mainstream."));
    }

    public static void describeMusic(String[] instruments) {
        System.out.println("Here are some instruments used in music: ");
        for (String instrument : instruments) {
            System.out.println("- " + instrument);
        }
    }

    public static void describeMusic(String genre, String iconicSong, String iconicArtist) {
        System.out.println(genre + " is often associated with \"" + iconicSong + "\" by " + iconicArtist + ".");
    }

    public static void describeMusic(String songTitle, double duration) {
        System.out.println("\"" + songTitle + "\" has a duration of " + duration + " minutes.");
    }

    public static void describeMusic(String genre, boolean isDanceable, int idealAudienceSize) {
        System.out.println(genre + " music is " + (isDanceable ? "great for dancing" : "not typically for dancing") + " and is best experienced with an audience of around " + idealAudienceSize + " people.");
    }

    public static void describeMusic(String composer, String era) {
        System.out.println("The composer " + composer + " was a prominent figure in the " + era + " era of music.");
    }

    public static void describeMusic(String instrument, int strings) {
        System.out.println("The " + instrument + " typically has " + strings + " strings.");
    }

    public static void describeMusic(String songTitle, String producer) {
        System.out.println("The song \"" + songTitle + "\" was produced by " + producer + ".");
    }

    public static void describeMusic(String mood, String genre, String activity) {
        System.out.println(mood + " " + genre + " music is perfect for " + activity + ".");
    }

    public static void describeMusic(String genre, int chartPosition, String hitSong) {
        System.out.println(genre + " music's top hit \"" + hitSong + "\" reached chart position #" + chartPosition + ".");
    }

    public static void describeMusic(char key, String scaleType) {
        System.out.println("Music in the key of " + key + " is often played in the " + scaleType + " scale.");
    }

    public static void describeMusic(String concertName, String venue, int attendees) {
        System.out.println("The concert \"" + concertName + "\" at " + venue + " was attended by " + attendees + " people.");
    }

    public static void describeMusic(String genre, String culture, String rhythmPattern) {
        System.out.println(genre + " music, rooted in " + culture + ", is characterized by its unique " + rhythmPattern + " rhythm pattern.");
    }

    public static void main(String[] args) {
        describeMusic();
        describeMusic("Jazz");
        describeMusic("Rock", "Queen");
        describeMusic("EDM", 128);
        describeMusic("Shape of You", "Ed Sheeran", "uplifting");
        describeMusic("Guitar", true);
        describeMusic("Thriller", 1982);
        describeMusic("Classical", "orchestral complexity", true);
        describeMusic(new String[]{"Piano", "Violin", "Drums", "Saxophone"});
        describeMusic("Hip-Hop", "Lose Yourself", "Eminem");
        describeMusic("Bohemian Rhapsody", 5.55);
        describeMusic("Pop", true, 5000);
        describeMusic("Ludwig van Beethoven", "Classical");
        describeMusic("Harp", 47);
        describeMusic("Blinding Lights", "Max Martin");
        describeMusic("relaxing", "Ambient", "meditation");
        describeMusic("Pop", 1, "Blinding Lights");
        describeMusic('C', "major");
        describeMusic("The Rolling Stones Live", "Madison Square Garden", 20000);
        describeMusic("Reggae", "Jamaican culture", "offbeat");
    }
}
