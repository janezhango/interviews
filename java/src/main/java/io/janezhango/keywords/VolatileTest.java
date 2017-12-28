package io.janezhango.keywords;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by xiaojing on 12/28/2017.
 */
//https://dzone.com/articles/java-volatile-keyword-0
public class VolatileTest {
    private static final Logger LOGGER = Logger.getLogger(VolatileTest.class.getName());

    private static volatile int MY_INT = 0;
//    TODO:
//    private static ThreadLocal<Integer> dd = 0;
    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int local_value = MY_INT;
            while ( local_value < 5){
                if( local_value!= MY_INT){
                    LOGGER.log(Level.INFO,"Got Change for MY_INT : {0}", MY_INT);
                    local_value= MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread{
        @Override
        public void run() {

            int local_value = MY_INT;
            while (MY_INT <5){
                LOGGER.log(Level.INFO, "Incrementing MY_INT to {0}", local_value+1);
                MY_INT = ++local_value;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
}
