package ds.array;

import java.util.Arrays;

public class DynamicArray {
    int capacity;
    int size;
    String[] arr;

    private DynamicArray(int capacity){
       this.capacity = capacity;
       arr = new String[capacity];
   }


   private void add(String item) {
       if(size >= capacity) {
           resize(arr, capacity);
       }
       arr[size] = item;
       size++;
   }

    private void resize(String[] arr, int capacity) {
        this.arr = Arrays.copyOf(arr, capacity * 2);
    }

    private void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
   }

   private void remove(String item) {
       for (int i = 0; i < size; i++) {
           if(arr[i].equals(item)) {
               arr[i] = null;
               size--;
           }
       }
   }


    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(2);
        dynamicArray.add("murali");
        dynamicArray.add("krishna");
        dynamicArray.add("kodavati");
        dynamicArray.add("laziness");
        dynamicArray.remove("laziness");
        dynamicArray.print();
    }
}
