public class CricketTeamRunner{
    public static void main(String[] args) {
        CricketTeam.storeTeam("RCB");
        CricketTeam.storeTeam("CSK");
        CricketTeam.storeTeam("MI");
        CricketTeam.storeTeam("Mumbai indians");
        CricketTeam.storeTeam("Gujarat Titans");
        CricketTeam.readTeam();
        CricketTeam.searchTeam("CSK");
    }
}