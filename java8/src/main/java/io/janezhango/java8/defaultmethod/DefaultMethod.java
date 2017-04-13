package io.janezhango.java8.defaultmethod;

/**
 * Created by xiaojing on 17/4/13.
 */
//http://stackoverflow.com/documentation/java/113/default-methods/4010/why-use-default-methods#t=201704131457138387759

public class DefaultMethod {
    public static void main(String[] args){
        //default implementation
        new WithDefault().printString();
        //overridden implementation
        new OverrideDefault().printString();
        //half person from abstract class
        new Dog().whoIam();
    }
}

/**
 * Interface with default method
 */
interface Printable {
    public default void printString() {
        System.out.println( "default implementation" );
    }
}

/**
 * Class which falls back to default implementation of {@link #printString()}
 */
class WithDefault implements Printable {}

/**
 * Custom implementation of {@link #printString()}
 */
class OverrideDefault implements Printable {
    @Override
    public void printString() {
        //call the default method
        Printable.super.printString();
        System.out.println( "overridden implementation" );
    }
}

//Abstract class method takes precedence over Interface Default Method.

interface Person{
    public default void whoIam(){
        System.out.println("I am a person");
    }
}

abstract class HalfPerson implements Person{
    public void whoIam(){
        System.out.println("I am a half person not a person");
    }
}

class Dog extends HalfPerson{
    @Override
    public void whoIam(){
        System.out.println("I am a dog not a half person nor a person");
    }

}