package Lecture19;

public class Decreasing {
    public static void main(String[] args) {
        int n =5;
        Dec(n);
    }
    public static void Dec(int n){
        if ( n == 0){
            return;
        }
        System.out.println(n);
        Dec(n-1);
    }
}
