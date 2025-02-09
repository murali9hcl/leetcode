package threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;

import static java.util.Arrays.asList;

public class PickFruitsWithInvokeAll {
    public static void main(String[] args) {
        AppleTree[] appleTrees = AppleTree.newTreeGarden(6);
        Callable<Void> applePicker1 = createApplePicker(appleTrees, 0, 2, "Alex");
        Callable<Void> applePicker2 = createApplePicker(appleTrees, 2, 4, "Bob");
        Callable<Void> applePicker3 = createApplePicker(appleTrees, 4, 6, "Carol");
        ForkJoinPool.commonPool().invokeAll(asList(applePicker1, applePicker2, applePicker3));
        System.out.println();
        System.out.println("All fruits collected");
    }

    private static Callable<Void> createApplePicker(AppleTree[] appleTrees, int fromIndex, int toIndex, String workerName) {
        return () -> {
            for (int i = fromIndex; i < toIndex; i++) {
                appleTrees[i].pickApples(workerName);
            }
            return  null;
        };
    }

}
