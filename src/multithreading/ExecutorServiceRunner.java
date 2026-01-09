package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        //executor service is used instead of synchronized keyword
        //newSingleThreadExecutor is used to execute exactly only one thread at a time and its one basic functionality
        ExecutorService executorService= Executors.newSingleThreadExecutor();

        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));

        System.out.println("\ntask three starts from main");
        for(int i=301;i<=399;i++){
            System.out.print(" "+i);
        }
        System.out.println("\ntask three ends from main");

        //executor service.shutdown is mandatory /if not the service will keep on running and won't end.
        executorService.shutdown();
    }
}
