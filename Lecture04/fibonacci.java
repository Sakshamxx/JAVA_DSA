package Lecture04;

public class fibonacci {
    public static void main(String[] args) {
        int n = 6;
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " Index:" + a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
