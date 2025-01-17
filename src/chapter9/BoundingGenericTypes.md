# Bounding Generic Types

| **Type of bound**         | **Syntax**     | **Example**                                                           |
|---------------------------|----------------|-----------------------------------------------------------------------|
| Unbounded wildcard        | ?              | List **<?>** a = new ArrayList<String>();                             |
| Wildcard with upper bound | ? extends type | List **<? extends Exception>** a = new ArrayList<RuntimeException>(); |
| Wildcard with lower bound | ? super type   | List **<? super Exception>** a = new ArrayList<Object>();             |

## Unbounded wildcard

Hiermee geef je aan dat alle data types gebruikt kunnen worden.

## Wildcard with upper bound

```java
import java.util.ArrayList;

ArrayList<Number> list = new ArrayList<Integer>(); // Does not compile
ArrayList<? extends Number> list = new ArrayList<Integer>(); // Does compile
```

Met de upper-bounded wildcard geef je aan dat **elke klasse** die `Number` extend of `Number` zelf gebruikt kan worden.
In het voorbeeld hieronder zie je wat je kan doen.

```java
import java.util.Arrays;

public static double sum(List<? extends Number> numberlist) {
    double sum = 0.0;
    for (Number n : numberlist) {
        sum += n.doubleValue();
    }
    return sum;
}

public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(1, 2, 3);
    System.out.println("sum = " + sum(integerList));

    List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
    System.out.println("sum = " + sum(doubleList));

    List<Number> numberList = Arrays.asList(1, 2, 4, 6);
    System.out.println("sum = " + sum(numberList));
}
```

## Wildcard with lower bound

Op deze manier geef je aan Java mee dat je een lijst wilt hebben met `String` objecten of een lijst met objecten die de
superclasse zijn van `String`.
In dit voorbeeld kan dit alleen maar `Object` zijn. In het voorbeeld hieronder, kan je dus een `List<Object> list` of
`List<String> list` meegeven.

```java
public static void addSound(List<? super String> list) {
    list.add("quack");
}
```

