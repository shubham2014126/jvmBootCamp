package Multithreading;
import java.util.Arrays;
public class ArraySumQ5 extends Thread{
    private int low, high;
    private int[] nums;
    private int sum = 0;

    public ArraySumQ5(int[] n, int low, int high) {
        this.nums = n;
        this.low = low;
        this.high = high;
    }
    @Override
    public void run() {
        for (int i = low; i < high; i++) {
            sum = Math.addExact(sum, nums[i]);
        }
    }
    public static void main(String[] args) {
        try {
            int[] numbers = ArraySumQ5.populateData();
            int m = ArraySumQ5.findSum(numbers);
            System.out.println(Arrays.toString(numbers));
            System.out.println("Its sum value is: " + m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static int findSum(int[] numbers) throws InterruptedException {
        int length = numbers.length;
        int sum = 0;
        int n = 4;
        ArraySumQ5[] threads = new ArraySumQ5[n];
        for (int i = 0; i < n; i++) {
            threads[i] = new ArraySumQ5(numbers,(i * length) / n, ((i + 1) * length) / n);
            threads[i].start();
        }
        for (int i = 0; i < n; i++) {
            threads[i].join();
            sum = Math.addExact(threads[i].sum, sum);
        }
        return sum;
    }

    public static int[] populateData() {
        int a[] = {1,1,1,1,1,1,1,1,1,1};
        return a;
    }
}
