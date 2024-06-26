package chapter7.sealed;

public sealed class Bear permits Kodiak, Panda, SmallBear {

    String roar() {
        return "Braww";
    }
}

final class Kodiak extends Bear {
    String roar() {
        return "Kodiak - Brawww";
    }
}

non-sealed class Panda extends Bear {
    public static void main(String... args) {
        Bear panda = new Kodiak();
        System.out.println(panda.roar()); // Kodiak - Brawww
    }
}

sealed class SmallBear extends Bear permits MiniBear {
}

final class MiniBear extends SmallBear {
    String roar() {
        return "Minibear raw";
    }

    public static void main(String[] args) {
        var mini = new MiniBear();
        System.out.println(mini.roar());

        var bear = new Bear();
        System.out.println(bear.roar());

        var panda = new Panda();
        System.out.println(panda.roar());

        Bear bear2 = new Kodiak();
        System.out.println(bear2.roar());
    }
}
