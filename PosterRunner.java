public class PosterRunner{
	    public static void main(String[] args) {

	    Poster poster = new Poster();
        Poster poster1 = new Poster(10);
        Poster poster2 = new Poster(10, 20);
        Poster poster3 = new Poster(10, 20, "Ad");
        Poster poster4 = new Poster(10, 20, "Ad", "Plastic");


	    poster.posterDetails();
        poster1.posterDetails();
        poster2.posterDetails();
        poster3.posterDetails();
        poster4.posterDetails();

	}
}		

        
        


   