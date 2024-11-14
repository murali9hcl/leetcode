package ds.stack;

public class StackTestDrive {
    public static void main(String[] args) {
            Stack theStack = new Stack(10); // make new stack
            theStack.push(20); // push items onto stack
            theStack.push(40);
            theStack.push(60);
            theStack.push(80);

            System.out.println("top element is " + theStack.peek());
            while( !theStack.isEmpty() ) { // delete item from stack
                long value = theStack.pop();
                System.out.print(value); // display it
                System.out.print(" ");
            } // end while
            System.out.println(" ");
        } // end main()
    }
