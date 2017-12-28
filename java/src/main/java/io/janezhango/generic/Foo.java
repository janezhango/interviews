package io.janezhango.generic;

/**
 * Created by xiaojing on 12/28/2017.
 */
abstract class Foo<SubClassOfFoo extends Foo<SubClassOfFoo>>
{
    /** subclasses are forced to return themselves from this method */
    public abstract SubClassOfFoo subclassAwareDeepCopy();
}

class Bar extends Foo<Bar> {
    public Bar subclassAwareDeepCopy() {
        Bar b = new Bar();
        // ...
        return b;
    }

    public static void main(String args[]){

        Bar b = new Bar();
        Foo<Bar> f = b;
        Bar b2 = b.subclassAwareDeepCopy();
        Bar b3 = f.subclassAwareDeepCopy(); // no need to cast, return type is Bar

    }

}
/*
The trick going on with Foo<SubClassOfFoo extends Foo<SubClassOfFoo>> is:

Any subclass of Foo must supply a type argument to Foo.
That type argument must actually be a subclass of Foo.
Subclasses of Foo (like Bar) follow the idiom that the type argument they supply to Foo is themselves.
Foo has a method that returns SubClassOfFoo. Combined with the above idiom,
this allows Foo to formulate a contract that says "any subclass of me must implement subclassAwareDeepCopy()
and they must declare that it returns that actual subclass".
To say that another way: this idiom allows a superclass (such as an Abstract Factory)
to define methods whose argument types and return types are in terms of the subclass type, not the superclass type.

 */

