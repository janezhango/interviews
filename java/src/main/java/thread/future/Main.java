package thread.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by xiaojing on 7/17/2017.
 */
public class Main {
    public static void main(String[]args)throws Exception{
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> result = executorService.submit(new Callable<String>() {
            public String call(){
                System.out.println("result in thread " + Thread.currentThread().getName());
                return "Callable Result";
            }
        });
        System.out.println("result in thread " + Thread.currentThread().getName() + result.get());
    }
}
