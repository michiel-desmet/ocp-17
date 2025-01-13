package chapter7.inner;

public class StaticInnerClass {

    static class Ride {
        private final int price = 6;
    }

    public static void main(String[] args) {
        var ride = new Ride();
        System.out.println(ride.price);
    }

}
