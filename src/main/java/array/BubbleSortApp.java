package array;

public class BubbleSortApp {

    public static void main(String[] args) {
        ArrayBub arr = new ArrayBub(10);
        arr.insert(77); // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.display();
        arr.bubbleSort();
        System.out.println("after sorting");
        arr.display();
    }

}
