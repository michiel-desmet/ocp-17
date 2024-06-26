package chapter3;

/**
 * Keep in mind, the pattern matching can only happen with a subclass of the passed parameter.
 * For instance, Number is the super class of Integer.
 */
public class PatternMatching {

    void compareIntegersOld(Number number) {
        if (number instanceof Integer) {
            Integer data = (Integer) number;
            System.out.println(data.compareTo(5));
        }
    }

    void compareIntegersNew(Number number) {
        if (number instanceof Integer data) {
            System.out.println(data.compareTo(5));
        }
    }

    public static void main(String[] args) {
        var patternmatching = new PatternMatching();
        patternmatching.compareIntegersOld(3);
        patternmatching.compareIntegersOld(5);
        patternmatching.compareIntegersOld(10);
        System.out.println("-------------------------------");
        patternmatching.compareIntegersNew(2);
        patternmatching.compareIntegersNew(5);
        patternmatching.compareIntegersNew(10);
    }

}
