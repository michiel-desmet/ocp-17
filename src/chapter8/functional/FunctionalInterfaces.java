package chapter8.functional;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterfaces implements ExtendedInterface {
    @Override
    public String convert(String parameter) {
        return parameter.trim().toUpperCase();
    }

    List<String> lists = List.of("voorbeeld", "weer wat nieuws", "bla bla bla");

    public static void main(String[] args) {
        var functionalInterfaces = new FunctionalInterfaces();

    }
}

@FunctionalInterface
interface FunctionalInterface1 {
    String convert(String parameter);
}

interface ExtendedInterface extends FunctionalInterface1 {
}

