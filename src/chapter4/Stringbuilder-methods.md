# StringBuilder methods

Hierin worden een aantal methods uitgelegd die mogelijk gebruikt kunnen worden tijdens het examen.

Een StringBuilder zou je kunnen gebruiken wanneer je één grote String wil samenvoegen uit verschillende methodes. Dit
zorgt ervoor dat er maar één object wordt aangemaakt in plaats van meerdere.

## Mutability and Chaining

In het voorbeeld hieronder zie je dat er maar één instantie wordt aangemaakt van StringBuilder. Daarom verwijst zowel
variabele **a** als **b** naar hetzelfde object.

```java
class Example {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a); //abcdefg
        System.out.println("b=" + b); //abcedfg
    }
}
```

## Important Methods

### Inserting data

```java
public StringBuilder insert(int offset, String str);
```

````java
class Example {
    public static void main(String[] args) {
        var sb = new StringBuilder("animals");
        sb.insert(7, "-"); // sb = animals-
        sb.insert(0, "-"); // sb = -animals-
        sb.insert(4, "-"); // sb = -ani-mals-
    }
}
````

### Deleting data

Hierbij heb je 2 methodes die je kan gebruiken. De eerste is het verwijderen van een range. Wanneer de range te groot is krijg je een foutmelding, of wanneer er op een bepaalde index geen waarde is. Wordt deze ook leeggegooid.

```java
public StringBuilder delete(int startIndex, String endIndex);
public StringBuilder deleteCharAt(int index);
```

### Replacing portion

Hierbij heb je een methode die je kan gebruiken om data te vervangen.

```java
public StringBuilder replace(int startIndex, int endIndex, String newString);
```

````java
class Example {
    public void replace() {
        var builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "sty");
        System.out.println(builder); // pigsty dirty
    }

    //verwijdert eerst alles bij de start tot einde, daarna insert.
    public void replace2() {
        var builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 100, "");
        System.out.println(builder); // pig
    }
}
````

