package multithreading;

class Task1 extends Thread{
    public void run(){
        System.out.println("first task");
        for(int i=101;i<199;i++){
            System.out.print(i+" ");
        }
        System.out.println("\nfirst task completed");
    }
}

class Task2 implements Runnable{
    @Override
    public void run() {
        System.out.println("\nsecond task");
        for(int i=201;i<299;i++){
            System.out.print(i+" ");
        }
        System.out.println("\nsecond task completed");
    }
}


public class ThreadBasicRunner {
    public static void main(String[] args) throws InterruptedException {

        //class that extends thread class can directly start it by .start
        Task1 task =new Task1();
        //setting priority
        task.setPriority(1);
        task.start();


/*
        System.out.println("first task");
        for(int i=101;i<199;i++){
            System.out.print(i+" ");
        }
*/
        //class that implements runnable should create an instance of Thread class to start
        Task2 task2=new Task2();
        Thread thread=new Thread(task2);
        //setting priority
        thread.setPriority(10);
        thread.start();

        //.join is used to complete the thread before further proceeding
        //task.join();
        task.sleep(10000);
        thread.join();


/*
        System.out.println("\nsecond task");
        for(int i=201;i<299;i++){
            System.out.print(i+" ");
        }
*/
        System.out.println("\nthird task");
        for(int i=301;i<399;i++){
            System.out.print(i+" ");
        }
        System.out.println("\nthird task completed");
    }

}
