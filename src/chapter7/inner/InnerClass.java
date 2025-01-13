package chapter7.inner;

public class InnerClass {
    private final String greeting; //Outer class instance variable

    public InnerClass(String greeting) {
        this.greeting = greeting;
    }

    public InnerClass() {
        this("hi!");
    }

    protected class Room { //Inner class declaration
        public int repeat = 3;

        public void enter() {
            for (int i = 0; i < repeat; i++) {
                greet(greeting);
            }
        }

        public static void greet(String message) {
            System.out.println(message);
        }
    }

    public void enterRoom() {
        var room = new Room();
        room.enter();
    }

    public static void main(String[] args) {
        var home = new InnerClass();
        home.enterRoom();

        var room = new InnerClass("Greetings!").new Room();
        room.enter();

        new InnerClass("Ugly").new Room().enter();
    }
}
