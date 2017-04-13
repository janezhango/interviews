package io.janezhango.java8.defaultmethod;

/**
 * Created by xiaojing on 17/4/13.
 */
public class DoubleExtends {
}

interface A {
    default void foo() { System.out.println("A.foo"); }
    default void foos() { System.out.println("A.foo"); }

}

interface B {
    //must have same return type
    default void foo() { System.out.println("B.foo"); }
    default void foos() { System.out.println("A.foo"); }

}

interface ABExtendsAbstract extends A, B {
    //must override or has a deault method
    @Override
    void foo();

    //must override or has a deault method
    @Override
    default void foos(){}
}