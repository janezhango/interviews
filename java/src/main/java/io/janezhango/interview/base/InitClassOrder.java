package io.janezhango.interview.base;

/**
 * Created by xiaojing on 17/4/9.
 */
public class InitClassOrder {


    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
        ab = new B(ab);
    }


}

class A {

    static {
        System.out.print("1");
    }

    public A() {
        System.out.print("2");
    }

    public A(A a){
        System.out.print("3");
    }
}

class B extends A{

    static {
        System.out.print("a");
    }

    public B() {
        super();
        System.out.print("b");

    }

    public B(A a){
        //by default call super();
        super(a);
        System.out.print("c");
    }
}
