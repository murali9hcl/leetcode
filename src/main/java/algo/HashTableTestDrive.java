package algo;

import java.util.Hashtable;

public class HashTableTestDrive {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(100, "Spongebob");
        table.put(123, "Pattrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");
        for (Integer key: table.keySet()) {
            System.out.println(key.hashCode() % 10 + " \t" + key + "\t" + table.get(key));
        }
    }
}
