package threading;

import java.util.concurrent.*;

public class PizzaStore {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);

        Callable<Pizza> pizzaCallable1 = () -> {
            System.out.println("preparing pizza");
            System.out.println("slicing onions");
            System.out.println("slicing tomatoes");
            System.out.println("applying sauce and baking in oven");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("pizza is ready");
            Pizza pizza = new Pizza();
            return pizza;
        };
        Future<Pizza> pizzaFuture = service.submit(pizzaCallable1);
        if(pizzaFuture.isDone()) {
            Pizza pizza = pizzaFuture.get();
            System.out.println("pizza is ready can be eaten");
        }
        System.out.println("mean while I'm walking in the park");
        System.out.println("waiting for pizza!................");
    }
}


class Pizza {

}