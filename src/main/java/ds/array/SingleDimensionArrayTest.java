package ds.array;

public class SingleDimensionArrayTest {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(5);
        sda.insert(0, 3);
        sda.insert(1, 4);
        sda.insert(2, 5);
        sda.insert(3, 6);
        sda.insert(4, 7);
        sda.insert(5, 8);
        sda.insert(4, 10);

        var firstElement = sda.arr[0];
        System.out.println(firstElement);

        var thirdElement = sda.arr[2];
        System.out.println(thirdElement);

        sda.traverseArray();

        sda.searchInArray(5);

        sda.deleteValueFromArray(4);

    }
}
