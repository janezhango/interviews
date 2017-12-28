What does Foo<T> really mean?
Very soon, the neurons in your brain are going to form an association between the Java fragment List<String> and the concept "a List of Strings". But if you see Foo<String>, what does that mean?

Considering the following code:

T is a type parameter (A). It means that the class body for Foo is parameterised over some type (any type!) T. The type T can appear (almost) anywhere in the class body, without anyone caring what type it may be.
Any use of Foo needs to supply a type argument for the type parameter of Foo (B) (C).
It is wholly dependent on the class writer to define the semantics of type parameters. The Collections API uses type parameters to say "this is a collection of T"; but these are semantics defined only by the javadoc. Some generic class Foo<T> need not be a "container of T".
The main up-shot here is: type parameters allow users of a class to avoid casting when calling methods on that class.
public class Foo<T> {    // (A)
 //...
}

Foo<String> f1 = ...;    // (B)
Foo<Integer> f2 = ...;   // (C)

