package Lecture1;

public class sumOfNNaturalNo {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            // System.err.println("Iteration:"+i+" Sum:"+sum);
            i += 1;
        }
        System.err.println("Sum:" + sum);
    }
}
