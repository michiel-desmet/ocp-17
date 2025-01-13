# Nested classes

Er zijn 4 soorten neste classes:

- **Inner class**
    - `non-static` type defined at the member level of a class.
- **Static nested class**
    - `static` type defined at the member level of a class.
- **Local class**
    - a class `within` a method body
- **Anonymous class**
    - A special case of a local class that `does not` have a name.

## Inner class

- Can be declared `public`, `protected`, `package` or `private`
- Can extend a class and implement interfaces
- can be marked `abstract` or `final`
- Can access members fo the outer class, including private members.

## Static Nested Class

- can be initialised without the need to initialise the parent class.
- it **can not** access fields and methods of the enclosing class.
- The nesting creates a namespace because the enclosing class name must be used to refer to it.
- it can be marked `private` or `protected`
- the enclosing class can refer to the fields and methods of the static nested class.

## Local Nested Class

- they do not have access modifiers
- they can be declared `final` or `abstract`
- They have access to all fields and method of the enclosing class (when defined in an instance method).
- The can access `final` and `effectively final` local variables.

## Defining anonymous class

Dit zijn eigenlijk een soort lamda calls.
