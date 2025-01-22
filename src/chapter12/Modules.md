# Modules

## Benefits

- Better access control
- Clearer dependency management
- Custom Java builds
- Improved security
- Improved performance
- Unique package enforcement

## How To

Om een module aan te maken moet er een `module-info.java` aanwezig zijn.
Hierin geef je aan dat de package(root) een module is.

### Compiling

```shell
javac -p mods -d feeding feeding/zoo/animal/feeding/*.java feeding/*java
```

- `-d` wordt gebruikt voor `directory`
- `-p` is het path van de module (`--module-path` is de langere vorm)

### Using

```shell
java --module-path mods --module book.module/com.sybex.OCP
```

Hier boven geef je eerst aan waar de module is (`--module-path` of `-p`)
Daarna geef je aan welke module er uitgevoerd moet worden (`class`)

## Creating services

Met een service kan je aangeven dat iets gebruikt moet worden.

### Service Locator

Deze kan alle klassen vinden die een service provider interface gebruiken.
Je hebt hier 2 methoden voor die vaak gebruikt worden

```java
public static <S> SerivceLoader<S> load(Class<S> service);

public Stream<Providcer<S>> stream() {}
```

```java
class Example {
    void example() {
        ServiceLoader.load(Tour.class)
            .stream()
            .map(Provider::get)
            .mapToInt(Tour::length)
            .max()
            .ifPresent(System.out::println);
    }
}
```

### Review

| Artifact                   | Part of the service | Directive requires        |
|----------------------------|---------------------|---------------------------|
| Service provider interface | yes                 | exports                   |
| Service provider           | no                  | requires / provides       |
| Service locator            | yes                 | exports / requires / uses |
| Consumer                   | No                  | requires                  |

| Directive                          | Description                            |
|------------------------------------|----------------------------------------|
| `exports _package_ (to _module_);` | Makes package available outside module |
| `requires (transitive) _module_;`  | Specifies another module as dependency |
