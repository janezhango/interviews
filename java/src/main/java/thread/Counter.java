package thread;

/**
 * Created by xiaojing on 5/17/2016.
 */
public class Counter {
    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    class Calculator implements Runnable {
        private int name;
        public Calculator(int i){
            name = i;
        }
        public void run() {
            try {
                Thread.sleep(1);
                increment();
                Thread.sleep(2);
                decrement();
                Thread.sleep(3);
                printValue();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        private void printValue(){
            synchronized(Counter.this){
                System.out.println("thread " + name + " value " + c);
            }

        }
    }
    public static void main(String[] args){
        Counter counter = new Counter();
        for(int i = 0 ; i < 50 ; i ++) {
            Calculator calculator = counter.new Calculator(i);
            (new Thread(calculator)).start();
        }
    }


}
