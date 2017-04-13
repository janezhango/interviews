package io.janezhango.java8.tests;

/**
 * Created by xiaojing on 11/7/2016.
 */
public class GenericTest<T> {
    private T test;

    public GenericTest(T test){
        this.test = test;
    }
    public void print(){
        System.out.println(test.toString());
    }

    public static void main(String[] args){
        GenericTest<String> myGenerics = new GenericTest<>("test");
        myGenerics.print();
    }
}
