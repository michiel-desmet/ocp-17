package one;

public class Main {

    public static void main(String[] args) {
        Animal a = new Bird();
        System.out.println(a.sound());
        a = new Cat();
        System.out.println(a.sound());

        Animal b = new Animal();
        b = a;
        System.out.println(b.sound());
    }

}
