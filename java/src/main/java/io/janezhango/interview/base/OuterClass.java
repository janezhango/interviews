package io.janezhango.interview.base;

/**
 * Created by xiaojing on 17/4/9.
 */
public class OuterClass {

    static class StaticInner {}

    public static void foo() {
        //static method cannot have
        new StaticInner();
    }

    public void bar() {
        new StaticInner();
    }

    public static void main(String[] args) {
        new StaticInner();
        new OuterClass().new NonStaticInner();
    }
    //注意：Java中非静态内部类对象的创建要依赖其外部类对象，
    // 上面的面试题中foo和main方法都是静态方法，静态方法中没有this，
    // 也就是说没有所谓的外部类对象，因此无法创建内部类对象，
    // 如果要在静态方法中创建内部类对象，可以这样做：

    class NonStaticInner {}

    public static void fooo() {
        //static method cannot have innerclass without the instance of outter
        new OuterClass().new NonStaticInner();
    }

    public void barr() { new NonStaticInner(); }


}
