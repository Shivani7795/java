public class CementRunner{
	public static void main(String args[]){
		Cement cement1 = new Cement("Rapid Set");
		cement1.info();
		Cement cement2 = new Cement("Rapid Set", 50);
		cement2.info();
		Cement cement3 = new Cement("Rapid Set", 50, 25.0);
		cement3.info();
		Cement cement4 = new Cement("Rapid Set", 50, 25.0, "Ultratech");
		cement4.info();
		Cement cement5 = new Cement("Rapid Set", 50, 25.0, "Ultratech", 30);
		cement5.info();
		Cement cement6 = new Cement("Rapid Set", 50, 25.0, "Ultratech", 30, 70);
		cement6.info();
		Cement cement7 = new Cement("Rapid Set", 50, 25.0, "Ultratech", 30, 70, 5);
		cement7.info();
		Cement cement8 = new Cement("Rapid Set", 50, 25.0, "Ultratech", 30, 70, 5, 1440);
		cement8.info();
		Cement cement9 = new Cement("Rapid Set", 50, 25.0, "Ultratech", 30, 70, 5, 1440, "Dobby");
		cement9.info();
		Cement cement10 = new Cement("Rapid Set", 50, 25.0, "Ultratech", 30, 70, 5, 1440, "Dobby", "Shivani");
		cement10.info();
	}
}
