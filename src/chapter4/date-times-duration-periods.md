# Periods

Deze gebruik je wanneer je met jaren, maanden en dagen wilt werken.

format: `P1Y2M3D` -> 1 jaar, 2 maanden, 3 dagen.
Wanneer een waarde 0 is, word deze niet getoond.

# Duration

Deze gebruik je wanneer je met uren, minuten, seconden, milliseconden of nanoseconden wilt werken.

```java
import java.time.Duration;

class Example {
    public static void main(String[] args) {
        var daily = Duration.ofDays(1); // PT24H
        var hourly = Duration.ofHours(1); //PT1H
        var everyMinute = Duration.ofMinutes(1); //PT1M
        var every10Seconds = Duration.ofSeconds(10); //PT10S
        var everyMilli = Duration.ofMillis(1); //PT0.001S
        var everyNano = Duration.ofNanos(1); //PT0.00000001S
    }
    
    public static void addDurations() {
        var days = Duration.ofDays(1);
        var minutes = Duration.ofMinutes(50);
        var hours = Duration.ofHours(2);
        var result = days.plus(minutes).plus(hours);
        System.out.println(result); //PT26H50M
    }
}
```
