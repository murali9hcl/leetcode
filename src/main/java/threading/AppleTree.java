package threading;

import java.util.concurrent.TimeUnit;

public class AppleTree {

    private final String treeLabel;
    private final int numOfApples;

    public AppleTree(String treeLabel) {
        this.treeLabel = treeLabel;
        this.numOfApples = 3;
    }

    public int pickApples(String workerName){
        try {
            System.out.printf("%s started picking apples from %s \n", workerName, treeLabel);
            TimeUnit.SECONDS.sleep(1);
            System.out.printf("%s started %d 🍎s  from %s \n", workerName, numOfApples, treeLabel);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  numOfApples;
    }

    public static AppleTree[] newTreeGarden(int size) {
        AppleTree[] appleTrees = new AppleTree[size];
        for (int i = 0; i < appleTrees.length; i++) {
            appleTrees[i] = new AppleTree("🌳#" + i);
        }
        return appleTrees;
    }
}
