package Lecture19;

public class HomeWork {
    public static void main(String[] args) {
        int n =5;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n,1);
    }
    public static void pattern1(int n){
        if (n == 0) return;
        pattern1(n-1);
        System.out.println(n);
    }
    public static void pattern2(int n){
        if (n == 0) return;
        System.err.println(n);
        pattern2(n-1);
    }
    public static void pattern3(int n){
        if ( n==0) return;
        System.out.println(n);
        pattern3(n-1);
        if (n!= 1) System.out.println(n);
    }
    public static void pattern4(int n, int i){
        if (i > n) return;
        System.out.println(i);
        pattern4(n, i+1);
        if (i != n) System.out.println(i);
    }
}