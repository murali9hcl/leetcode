package dp;

import java.util.HashMap;
import java.util.Map;

public class NumberFactor {
    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        int num = 5;
        System.out.println("ways to express number " + num + " is " + waysToGetNBottomUp(num));
    }

    public static int waysToGetNTopDown(int n) {
        if(n == 0) return 1;
        if(n <= 0) return 0;
        int count = 0;
        if(map.containsKey(n)) {
            return map.get(n);
        }
        count = waysToGetNTopDown(n - 1) + waysToGetNTopDown(n - 3) + waysToGetNTopDown(n - 4);
        map.put(n, count);
        return count;
    }

    public static int waysToGetNBottomUp(int n) {
        if(n == 0) return 1;
        if(n <= 0) return 0;

        int[] ways = new int[n + 1];
        ways[0] = 1;
        ways[1] = 1;
        ways[2] = 1;
        ways[3] = 2;

        for (int i = 4; i <= n; i++) {
            ways[i] = ways[i -1] + ways[i -3] + ways[i -4];
        }

        return ways[n];

    }
}
