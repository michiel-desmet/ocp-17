package chapter7.sealed;

/**
 * It is possible to create nested sealed classed. As seen underneath.
 * <p>
 * It is not necessary to define the permits. However, if you do so, all the nested classed which extends the sealed class need to be defined. <br>
 * <code>
 * public sealed class NestedSealed permits NestedSealed.Example, NestedSealed.Example2 {
 * final class Example extends NestedSealed {}
 * <p>
 * non-sealed class Example2 extends NestedSealed {}
 * }
 * </code>
 * <br>
 *
 */
public sealed class NestedSealed {
    final class Example extends NestedSealed {}

    non-sealed class Example2 extends NestedSealed {}
}
