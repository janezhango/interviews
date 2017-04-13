package io.janezhango.java8.defaultmethod;

/**
 * Created by xiaojing on 17/4/13.
 */
public class DefaultSum {
    public static void main(String[] args){
        System.out.println(new Sum().calculateSum());

    }
}
interface Summable {
    int getA();

    int getB();

    default int calculateSum() {
        return getA() + getB();
    }
}

class Sum implements Summable {
    @Override
    public int getA() {
        return 1;
    }

    @Override
    public int getB() {
        return 2;
    }
}