# Arrays

Overzicht die je zeker moet kennen.

| Method     | When arrays contains the same data | When arrays are different   |
|------------|------------------------------------|-----------------------------|
| equals()   | true                               | false                       |
| compare()  | 0                                  | positive or negative number |
| mismatch() | -1                                 | zore or positive index      |

## Searching

Wanneer je wil gaan zoeken op een array. Dan moet deze gesorteerd zijn. Anders kan je de output niet voorspellen.

```java
import java.util.Arrays;

class Example {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        Arrays.binarySearch(numbers, 2); // 0
        Arrays.binarySearch(numbers, 4); // 1
        Arrays.binarySearch(numbers, 1); // -1 (moet op index 1 komen)
        Arrays.binarySearch(numbers, 3); // -2 
        Arrays.binarySearch(numbers, 9); // -5
    }
}
```

## Comparing

Volgende regels moet je uit je hoofd leren. Belangrijk om te weten, je kan niet 2 verschillende typen array vergelijken.
Dus het is niet mogelijk om een `int[]` en `String[]` te vergelijken, dat compileert niet.

- a negative number means the first array is smaller than the second.
- a zero means arrays are equal
- a positive number means the first array is larger than the second.

### Rules

- `null` is smaller than any other value.
- for numbers, normal numeric order applies
- for strings, one is smaller if it is a prefix of another
- for strings/characters, numbers are smaller than letters.
- for strings/characters, uppercase is smaller than lowercase

### Sorting in natural order
- numbers
- uppercase
- lowercase
- null

### Voorbeelden

| First array       | Second array       | Result   | Reason                                                       |
|-------------------|--------------------|----------|--------------------------------------------------------------|
| new int[]{1, 2}   | new int[]{1}       | positive | the first element is the same, but the first array is longer |
| new int[]{1, 2}   | new int[]{1}       | 0        | Exact match                                                  |
| new String[]{"a"} | new String[]{"aa"} | negative | The first element is a substring of the second               |
| new String[]{"a"} | new String[]{"A"}  | positive | Uppercase is smaller than lowercase                          |
| new String[]{"a"} | new String[]{null} | positive | null is smaller than a letter                                |

## Mismatch

Wanneer waardes gelijk zijn in de arrays, dan wordt `-1` terug gegeven.
Anders krijg je de index (tellen vanaf 0) terug waar ze verschillend zijn.

```java
import java.util.Arrays;

class Example {
    public static void main(String[] args) {
        Arrays.mismatch(new int[]{1}, new int[]{1}); // -1
        Arrays.mismatch(new int[]{"a"}, new int[]{"A"}); // 0
        Arrays.mismatch(new int[]{1, 2}, new int[]{1}); // 1
    }
}
```
