package multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

class CallableTask implements Callable<String>{

    private String name;

    public CallableTask(String name) {
        this.name=name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(3000);
        return "Hello "+name;
    }
}

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

/* uncomment and comment the second program to completely go through the first progra
m
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        System.out.println("before the thread execution");
        Future<String> returnFromThread = executorService.submit(new CallableTask("thread 1"));
        System.out.println("after the thread execution");

        System.out.println("before the get");
        System.out.println(returnFromThread.get());
        System.out.println("after the get");

        executorService.shutdown();

        System.out.println("main done");
*/

        ExecutorService executorService=Executors.newFixedThreadPool(2);

        List<CallableTask> tasks = Arrays.asList(new CallableTask("Thread one"), new CallableTask("Thread Two"),
                new CallableTask("Thread Three"));

        //invoke all returns all the tasks to be done
     /*   List<Future<String>> futures = executorService.invokeAll(tasks);
        for (Future<String> result:futures){
            System.out.println(result.get());
        }
      */

        //invokeAny will complete any only one task

        String s = executorService.invokeAny(tasks);
        System.out.println("with Invoke Any->  "+s);


        executorService.shutdown();

    }
}
