package chapter10;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorExample {

    void tryToDivideAListEvenly() {
        var stream = List.of("bird-", "bunny-", "cat-", "dog-", "fish-", "lamb-", "mouse-");
        Spliterator<String> originalBagOfFood = stream.spliterator();
        System.out.println("Original bag of food: " + stream);

        System.out.println("---------------------");
        Spliterator<String> emmasBag = originalBagOfFood.trySplit();
        emmasBag.forEachRemaining(System.out::println);

        System.out.println("---------------------");
        Spliterator<String> jillsBag = originalBagOfFood.trySplit();
        jillsBag.tryAdvance(System.out::println);
        jillsBag.forEachRemaining(System.out::println);

        System.out.println("---------------------");
        originalBagOfFood.forEachRemaining(System.out::println);
    }

    void complicatedPrintTo3() {
        var originalBag = Stream.iterate(1, n -> ++n).spliterator();
        Spliterator<Integer> newBag = originalBag.trySplit();

        newBag.tryAdvance(System.out::println); //1
        newBag.tryAdvance(System.out::println); //2
        newBag.tryAdvance(System.out::println); //3
    }

    public static void main(String[] args) {
        var example = new SpliteratorExample();
        example.tryToDivideAListEvenly();

        System.out.println("---------------------");
        System.out.println("---------------------");
        example.complicatedPrintTo3();
    }
}
