package threading;

import java.util.List;
import java.util.concurrent.*;

public class CarServiceExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create a thread pool with 10 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Define a simple asynchronous task

        Callable<Integer> callable1 = () -> {
            System.out.println("executing service for car1");
            Thread.sleep(10000);
            return 10;
        };

        Callable<Integer> callable2 = () -> {
            System.out.println("executing service for car2");
            Thread.sleep(10000);
            return 20;
        };

        Callable<Integer> callable3 = () -> {
            System.out.println("executing service for car3");
            Thread.sleep(10000);
            return 30;
        };
        Callable<Integer> callable4 = () -> {
            System.out.println("executing service for car4");
            Thread.sleep(10000);
            return 40;
        };

        Callable<Integer> callable5 = () -> {
            System.out.println("executing service for car5");
            Thread.sleep(10000);
            return 50;
        };

        List<Callable<Integer>> callableList = List.of(callable1, callable2, callable3, callable4, callable5);


        // Execute the task
        //executor.execute(task);
        List<Future<Integer>> futures = executor.invokeAll(callableList);

        for (Future<Integer> future : futures) {
            System.out.println(future.get());
        }

        // Shutdown the executor when done
        executor.shutdown();
    }
}
