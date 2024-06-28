package chapter7.records;

public record LongConstructor(int number, String name) {

    public LongConstructor(int number, String name) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        this.number = number;
        this.name = name.toUpperCase();
    }

    // Modifying the values passed, it is NOT possible to change the fields in the record.
    //    public LongConstructor {
    //        if(name == null || name.isEmpty()) {
    //            throw new IllegalArgumentException();
    //        }
    //        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    //    }

    public static void main(String[] args) {
        var longConstructor = new LongConstructor(10, "voorbeeld van een naam");
        System.out.println(longConstructor.number);
        System.out.println(longConstructor.name);
    }
}
