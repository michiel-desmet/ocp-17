package chapter10;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingResults {

    public static void main(String[] args) {
        var simpleExample = new CollectingResults.SimpleExample();
        simpleExample.run();
        var mapExamples = new CollectingResults.MapExamples();
        mapExamples.run();
    }

    static void emptyLine() {
        System.out.println("---------------------------");
    }

    static void emptyLine(String title) {
        System.out.println("---------- " + title + " ----------");
    }

    static class SimpleExample {

        private void averageLength() {
            Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
            Double result = ohMy.collect(Collectors.averagingInt(String::length));
            System.out.println(result);
        }

        private void toSet() {
            Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
            var result = ohMy
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
            System.out.println(result);
        }

        void run() {
            averageLength();
            emptyLine();
            toSet();
        }
    }

    static class MapExamples {

        void run() {
            simpleExample();
            emptyLine("Merge with duplicate keys");
            mergeDuplicateKeyValues();
            emptyLine();
            whatToDoWithDuplicateKeyValues();
            emptyLine();
            groupBy();
            emptyLine("Group by examples");
            groupByWithSet();
            emptyLine();
            groupByWithSetAndTreeMap();
            emptyLine("Partitioning");
            partitioning();
            emptyLine();
            partitioningWithMap();
            emptyLine();
            complicatedExample();
        }

        private void simpleExample() {
            Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
            Map<String, Integer> map = ohMy.collect(
                Collectors.toMap(s -> s, String::length)
            );
            System.out.println(map);
        }

        private void mergeDuplicateKeyValues() {
            Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
            Map<Integer, String> map = ohMy.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + ", " + s2
            ));
            System.out.println(map);
            System.out.println(map.getClass());
        }

        private void whatToDoWithDuplicateKeyValues() {
            Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
            Map<Integer, String> map = ohMy.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + ", " + s2,
                TreeMap::new //Optional can be left out.
            ));
            System.out.println(map);
            System.out.println(map.getClass());
        }

        private void groupBy() {
            Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
            Map<Integer, List<String>> result = ohMy.collect(
                Collectors.groupingBy(String::length)
            );
            System.out.println(result);
            System.out.println(result.getClass());
        }

        private void groupByWithSet() {
            Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
            Map<Integer, Set<String>> result = ohMy.collect(
                Collectors.groupingBy(
                    String::length,
                    Collectors.toSet()
                )
            );
            System.out.println(result);
            System.out.println(result.getClass());
        }

        private void groupByWithSetAndTreeMap() {
            Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
            Map<Integer, Set<String>> result = ohMy.collect(
                Collectors.groupingBy(
                    String::length,
                    TreeMap::new,
                    Collectors.toSet()
                )
            );
            System.out.println(result);
            System.out.println(result.getClass());
        }

        private void partitioning() {
            Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
            Map<Boolean, List<String>> result = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 5)
            );
            System.out.println(result);
        }

        private void partitioningWithMap() {
            Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
            Map<Boolean, Set<String>> result = ohMy.collect(
                Collectors.partitioningBy(
                    s -> s.length() <= 7,
                    Collectors.toSet()
                )
            );
            System.out.println(result);
        }

        private void complicatedExample() {
            var ohMy = Stream.of("lions", "tigers", "bears");
            Map<Integer, Optional<Character>> result = ohMy.collect(
                Collectors.groupingBy(
                    String::length,
                    Collectors.mapping(
                        s -> s.charAt(0),
                        Collectors.minBy((a, b) -> a - b)
                    )
                )
            );
            System.out.println(result);
        }

    }

}
