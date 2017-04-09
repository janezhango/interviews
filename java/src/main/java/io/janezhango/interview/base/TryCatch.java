package io.janezhango.interview.base;

/**
 * Created by xiaojing on 17/4/9.
 */
public class TryCatch {
    public static void main(String[] args) throws Exception {
        System.out.print(ret());
    }

    public static int ret(){
        try {
            //return 33333 always;
            System.out.println("try");
            String ss = null;
            System.out.println(ss.charAt(3));
            return 1;
        } catch ( Exception s ) {
            System.out.println("catch");
            return 2;
        } finally {
            System.out.println("finally");
            return 3;
        }
    }

}
class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

class Human {

    public static void main(String[] args)
            throws Exception {
        try {
            try {
                throw new Sneeze();
            }
            catch ( Annoyance a ) {
                System.out.println("Caught Annoyance");
                throw a;
            }
        }
        catch ( Sneeze s ) {
            System.out.println("Caught Sneeze");
            return ;
        }
        finally {
            System.out.println("Hello World!");
        }
    }

}