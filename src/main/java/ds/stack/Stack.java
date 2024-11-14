package ds.stack;

public class Stack {
    int top;
    int maxSize;
    int[] array;

    public Stack(int size) {
        array = new int[size];
        top = -1;
        maxSize = size;
    }

    public void push(int value) {
        array[++top] = value;
    }

    public int peek() {
        return array[top];
    }

    public int pop() {
        return array[top--];
    }

    public boolean isFull () {
        return top -1 == maxSize;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
