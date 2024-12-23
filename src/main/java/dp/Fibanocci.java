package dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fibanocci {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = fibMemo(7, map);
        System.out.println("result " + result);
        System.out.println("result fibTab " +fibTab(7));
    }


    public static int fibMemo(int n, Map<Integer, Integer> memo) {
        if(n == 1) {
            return 0;
        }
        if(n == 2){
            return 1;
        }
        if(!memo.containsKey(n)) {
            memo.put(n, fibMemo(n - 2, memo) + fibMemo(n -1, memo));
        }
        return memo.get(n);
        //return memo.computeIfAbsent(n, k -> fibMemo(n - 2, memo) + fibMemo(n - 1, memo));
    }

    public static int fibTab(int n) {
       List<Integer> list = new ArrayList<>();
       list.add(0);
       list.add(1);
        for (int i = 2; i <= n-1 ; i++) {
            list.add(list.get(i -1) + list.get(i - 2));
        }
        return list.get(n -1);

    }
}
