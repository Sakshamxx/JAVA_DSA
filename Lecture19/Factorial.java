package Lecture19;

public class Factorial{
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Factorial_Tail(n,1));
    }

    public static int factorial_Head(int n){
        // Base Case
        if ( n == 1 || n == 0){
            return 1;
        }
        int fn = factorial_Head(n-1); // Smaller Problem
        return fn*n;
    }

    public static int Factorial_Tail(int n, int ans ){
        if (n==0){
            return ans;
        }
        return Factorial_Tail(n-1,ans*n);
    }
}