# Important String Methods

Indexes for a String is always starting from 0.

## Getting Single Character

Get a character at a specific index

```java
public char charAt(int index);
```

### Example

```java
class Example {
    public static void main(String[] args) {
        var name = "animals";
        System.out.println(name.charAt(0)); // a
        System.out.println(name.charAt(6)); // s
        System.out.println(name.charAt(7)); // exception (too large of an index)        
    }
}
```

## Finding an index

Get a character at a specific index.
Wanneer er geen match gevonden wordt, wordt er **-1** teruggegeven.

```java
public int indexOf(int ch);
public int indexOf(int ch, int fromIndex);
public int indexOf(String str);
public int indexOf(String str, int fromIndex);
```

### Example

```java
class Example {
    public static void main(String[] args) {
        var name = "animals";
        System.out.println(name.indexOf('a')); // 0
        System.out.println(name.indexOf("al")); // 4
        System.out.println(name.indexOf('a', 4)); // 4 
        System.out.println(name.indexOf("al", 4)); // -1 
    }
}
```

## Getting a Substring

Hierbij kan je een substring van een bestaande String terugkrijgen. Het tellen begint bij 0.

```java
public String substring(int beginIndex);
public String substring(int beginIndex, int endIndex);
```

### Example

```java
class Example {
    public static void main(String[] args) {
        var name = "animals";
        System.out.println(name.substring(3, 3)); // empty string
        System.out.println(name.substring(3, 2)); // exception
        System.out.println(name.substring(3, 8)); // exception (no 8th character at index)
    }
}
```

## Checking for Equality

The `equals()` method checks whether two String objects contains exactly the same characters in the same order. There is also a `equalsIgnoreCase()` method, and does the same without taking capitals or lowercase into the consideration.

## Searching for substring

```java
public boolean startsWidth(String prefix);
public boolean endsWidth(String prefix);
public boolean contains(CharSequence charSeq);
```

## Replacing values

```java
public String replace(char oldChar, char newChar);
public String replace(CharSequence target, CharSequence replacement);
```

## Removing Whitespace

Hierbij kan je dus alle whitespaces verwijderen van een String. `strip()` & `trim()`. Verwijderen alles rondom een String, de `strip()` method ondersteunt unicode.

```java
public String strip();
public String stripLeading();
public String stripTrailing();
public String trim();
```

## Working with Indentation

```java
public String indent(int numberSpaces);
public String stripIdent();
```

Wanneer je de eerste methode gebruikt, kan je zowel positieve als negative nummers gebruiken. Met een positief nummer krijg je extra whitespaces voor elke regel, en met een negatief nummer worden deze eraf gehaald in zover dit kan.
