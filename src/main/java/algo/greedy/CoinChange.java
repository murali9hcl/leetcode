package algo.greedy;

import java.util.ArrayList;
import java.util.List;

public class CoinChange {
    public static void main(String[] args) {
        int[] demoninations = {1,2,5,10, 20,50, 100,1000};
        List<Integer> coins = new ArrayList<>();
        int sum = 2035;
        getChange(sum, demoninations, coins);
        for (Integer coin : coins) {
            System.out.println(coin);
        }


    }

    private static void getChange(int sum, int[] demoninations, List<Integer> coins) {
        if(sum <=0 ){
            return;
        }
        for (int i = demoninations.length -1 ; i > 0; i--) {
            if(sum >= demoninations[i]) {
                coins.add(demoninations[i]);
                sum -= demoninations[i];
                break;
            }
        }
        getChange(sum, demoninations, coins);

    }


}
