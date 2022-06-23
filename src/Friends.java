public class Friends {
    public static void main(String[] args) {
        All p1 = new All();
        //Person p1 = new Person();
        p1.name = "Опція";
        p1.age = 24;
        p1.growth = 171;
        p1.weight = 52.4;
        p1.hobby = "Музикою";
        System.out.println("Це " + p1.name + ", йому " + p1.age + " роки, має зріст " +
                p1.growth + "см та вагу " + p1.weight + "кг, полюбляє займатись " + p1.hobby);

        All p2 = new All();
        //Person p2 = new Person();
        p2.name = "Бабця";
        p2.age = 18;
        p2.growth = 168;
        p2.weight = 56.5;
        p2.hobby = "Туризмом";
        System.out.println("Це " + p2.name + ", йому " + p2.age + " роки, має зріст " +
                p2.growth + "см та вагу " + p2.weight + "кг, полюбляє займатись " + p2.hobby);

        All p3 = new All();
        //Person p3 = new Person();
        p3.name = "Білка";
        p3.age = 20;
        p3.growth = 160;
        p3.weight = 52.4;
        p3.hobby = "Іграми";
        System.out.println("Це " + p3.name + ", йому " + p3.age + " роки, має зріст " +
                p3.growth + "см та вагу " + p3.weight + "кг, полюбляє займатись " + p3.hobby);

        All p4 = new All();
        //Person p4 = new Person();
        p4.name = "Кіт";
        p4.age = 21;
        p4.growth = 192;
        p4.weight = 78;
        p4.hobby = "Електронікою";
        System.out.println("Це " + p4.name + ", йому " + p4.age + " роки, має зріст " +
                p4.growth + "см та вагу " + p4.weight + "кг, полюбляє займатись " + p4.hobby);

        All p5 = new All();
        //Person p5 = new Person();
        p5.name = "Душман";
        p5.age = 23;
        p5.growth = 180;
        p5.weight = 85;
        p5.hobby = "Пивком";
        System.out.println("Це " + p5.name + ", йому " + p5.age + " роки, має зріст " +
                p5.growth + "см та вагу " + p5.weight + "кг, полюбляє випивати " + p5.hobby);

    }
}

/*class Person {
    String name;
    byte age;
    int growth;
    double weight;
    String hobby;
}*/