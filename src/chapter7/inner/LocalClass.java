package chapter7.inner;

/**
 * Local classes can only access final or effectively final variables. Otherwise, this local class not compile.
 */
public class LocalClass {

    private final int length = 5;

    public void calculate() {
        final int width = 20;

        class Calculator {
            public void multiply() {
                System.out.println(length * width);
            }
        }

        Calculator calc = new Calculator();
        calc.multiply();
    }

    public static void main(String[] args) {
        var localClass = new LocalClass();
        localClass.calculate();
    }

}
