package ex;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleExecutor {


    public static class MyTask implements Callable<Integer> {
        private int i;
        public MyTask(Integer i) {
            this.i = i;
        }

        @Override
        public Integer call()  {
            System.out.println("executing thread " + Thread.currentThread().getName() + " with input " + i);
            return i + 1; // Example result
        }
    }



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Integer> integerList = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        int result = 0;
       // int j =0;
//        Callable<Integer> myTask = () -> {
//            System.out.println("executing thread " + Thread.currentThread().getName() + " with input " + i);
//            return addPlusOne(j); // Example result
//        };


        for (Integer i : integerList) {
            Future<Integer> future = executorService.submit(new MyTask(i));
            result = result + future.get();
        }
        System.out.println("Result: " + result);
        executorService.shutdown();
    }

    private static int addPlusOne(int i) {
        return i + 1;
    }
}
