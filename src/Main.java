public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Nurzada","casual style","Facebook-Meta");
        System.out.println(programmer);

        programmer.learn();
        programmer.eat();
        programmer.walk();

        Dancer dancer = new Dancer("Asia","white dress");
        System.out.println(dancer);

        dancer.dancing();
        dancer.eat();
        dancer.learn();
        dancer.walk();

        Singer singer = new Singer("Sam","pop style");
        System.out.println(singer);

        singer.singing();
        singer.playGitar();
        singer.learn();
        singer.eat();
        singer.walk();

    }


}
