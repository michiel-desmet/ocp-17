package chapter7.records;

public record CompactConstructor(int number, String name) {
    public CompactConstructor {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        name = name.toUpperCase();
    }


    public static void main(String[] args) {
        var compactConstructor = new CompactConstructor(5, "CompactConstructor");
        System.out.println(compactConstructor.number);
        System.out.println(compactConstructor.name);

        //Throws exception
        new CompactConstructor(-1, "CompactConstructor");
    }
}
