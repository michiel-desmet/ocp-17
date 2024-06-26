package chapter7.interfaces;

public class InterfaceWithDefault implements DefaultMethod, PreferableExercise {

    // Shadow hiding the default implementation
    public int getAlmostAge() {
        return 29;
    }

    public int getAlmostAgeInterface() {
        return DefaultMethod.super.getAlmostAge();
    }

    public String getDescription() {
        return PreferableExercise.super.getDescription();
    }

    public static void main(String[] args) {
        var interfaceWithDefault = new InterfaceWithDefault();
        System.out.println(interfaceWithDefault.getAlmostAge());
        System.out.println(interfaceWithDefault.getAlmostAgeInterface());
        System.out.println(interfaceWithDefault.getDescription());
    }
}

interface DefaultMethod {
    default int getAlmostAge() {
        return 30;
    }
}

interface PreferableExercise {
    default String getDescription() {
        return "On foot";
    }
}
