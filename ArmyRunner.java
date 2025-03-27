public class ArmyRunner {
    public static void main(String args[]) {
        Army army1 = new Army("Elite Forces");
        army1.info();
        Army army2 = new Army("Elite Forces", 5000);
        army2.info();
        Army army3 = new Army("Elite Forces", 5000, "Infantry");
        army3.info();
        Army army4 = new Army("Elite Forces", 5000, "Infantry", "India");
        army4.info();
        Army army5 = new Army("Elite Forces", 5000, "Infantry", "India", 250.0);
        army5.info();
        Army army6 = new Army("Elite Forces", 5000, "Infantry", "India", 250.0, "Christopher G.Cavoil");
        army6.info();
        Army army7 = new Army("Elite Forces", 5000, "Infantry", "India", 250.0, "Christopher G.Cavoil", "Arthur Tedder");
        army7.info();
        Army army8 = new Army("Elite Forces", 5000, "Infantry", "India", 250.0, "Christopher G.Cavoil", "Arthur Tedder", "Colonel");
        army8.info();
        Army army9 = new Army("Elite Forces", 5000, "Infantry", "India", 250.0, "Christopher G.Cavoil", "Arthur Tedder", "Colonel", "Special Operations");
        army9.info();
        Army army10 = new Army("Elite Forces", 5000, "Infantry", "India", 250.0, "Christopher G.Cavoil", "Arthur Tedder", "Colonel", "Special Operations", "Kargil");
        army10.info();
    }
}