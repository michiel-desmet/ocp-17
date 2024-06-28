package chapter7.inner;

public class AnonymousClass {

    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly saleTodayOnly = new SaleTodayOnly() {
            int dollarsOff() {
                return 3;
            }
        };
        return basePrice - saleTodayOnly.dollarsOff();
    }

    public static void main(String[] args) {
        var a = new AnonymousClass();
        var admission = a.admission(10);
        System.out.println(admission);
    }
}
