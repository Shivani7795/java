public class AK47Runner {
    public static void main(String args[]) {
        AK47 ak471 = new AK47(101);
        ak471.info();
        AK47 ak472 = new AK47(101, "Black");
        ak472.info();
        AK47 ak473 = new AK47(101, "Black", 30);
        ak473.info();
        AK47 ak474 = new AK47(101, "Black", 30, "Shivani Arms Co.");
        ak474.info();
        AK47 ak475 = new AK47(101, "Black", 30, "Shivani Arms Co.", "Dobby Defense Ltd.");
        ak475.info();
        AK47 ak476 = new AK47(101, "Black", 30, "Shivani Arms Co.", "Dobby Defense Ltd.", 4.3);
        ak476.info();
        AK47 ak477 = new AK47(101, "Black", 30, "Shivani Arms Co.", "Dobby Defense Ltd.", 4.3, 85.0);
        ak477.info();
        AK47 ak478 = new AK47(101, "Black", 30, "Shivani Arms Co.", "Dobby Defense Ltd.", 4.3, 85.0, "Metal Grip");
        ak478.info();
        AK47 ak479 = new AK47(101, "Black", 30, "Shivani Arms Co.", "Dobby Defense Ltd.", 4.3, 85.0, "Metal Grip", 5);
        ak479.info();
        AK47 ak4710 = new AK47(101, "Black", 30, "Shivani Arms Co.", "Dobby Defense Ltd.", 4.3, 85.0, "Metal Grip", 5, 2025);
        ak4710.info();
    }
}
