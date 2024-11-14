package recursion;

public class SumNumbers {
    public static void main(String[] args) {
       SumNumbers sumNumbers = new SumNumbers();
        System.out.println(sumNumbers.getSum(545));
    }

    private int getSum(int num){
        if(num < 0 || num ==0) {
            return 0;
        }
        return num%10 + getSum(num/10);
    }
}
