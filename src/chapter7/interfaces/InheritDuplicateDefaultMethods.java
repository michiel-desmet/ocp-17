package chapter7.interfaces;

/**
 * It is not possible to import 2 default method, as the compiler does not know what type to call.
 * However, if the getSpeed is overloaded, it does run. As the compiler now know what to call.
 */
public class InheritDuplicateDefaultMethods implements Walk, Run {

    public int getSpeed() {
        return 2;
    }

    public static void main(String[] args) {
        var example = new InheritDuplicateDefaultMethods();
        System.out.println(example.getSpeed()); //2
    }

}

interface Walk {
    default int getSpeed() {
        return 5;
    }
}

interface Run {
    default int getSpeed() {
        return 10;
    }
}

