package Lecture4;

public class GCD {
    public static void main(String[] args) {
        int divident = 36;
        int divisor = 60;
        while (divident % divisor != 0) {
            int rem = divident % divisor;
            divident = divisor;
            divisor = rem;
        }
        System.out.println(divisor);
    }
}
