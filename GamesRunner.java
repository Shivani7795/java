public class GamesRunner{
	public static void main (String args[]){
	Games.saveGameNames("Subway Surfers");
	Games.saveGameNames("abc");
	Games.saveGameNames("def");
	Games.saveGameNames("ghi");
	Games.search("abc");
	Games.checkDuplicate("abc");
	Games.displayGamesInUpperCase();
	Games.displayGamesInLowerCase();
	}	
}