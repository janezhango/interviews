package io.janezhango.generic;

import java.util.Date;

/**
 * Created by xiaojing on 12/28/2017.
 */
public class Main {
    public static void main(String args[]) throws Exception{
        Class<Date> c1 = Date.class;
        Class c2 = Date.class;
        Date d1 = c1.newInstance(); // new style, no potential ClassCastException
        Date d2 = (Date) c2.newInstance(); // old style

        Object o = d1;

        // no need to do a manual cast, the cast() method
        // throws the ClassCastException if necessary
        Date d3 = c1.cast(o);

        // old style, need to do a manual cast
        Date d4 = (Date) o;


        System.out.println(AbstractTrafficLightState.RED.next());
    }
}
