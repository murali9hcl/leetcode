package array;

public class ArrayBub {

    private long[] a;
    private int NElems;

    public ArrayBub(int count) {
        a = new long[count];
    }

    public void insert(long value) {
        a[NElems] = value;
        NElems++;
    }

    public void display() {
        for (long l : a) {
            System.out.print(l + " ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] > a[j]){
                    long temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
