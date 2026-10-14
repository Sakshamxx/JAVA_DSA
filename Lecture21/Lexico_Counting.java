package Lecture21;

public class Lexico_Counting {
    public static void main(String[] args) {
        int n = 1000;
        Counting(n,0);
    }

    public static void Counting(int n, int curr) {
        if ( curr > n) return;
        System.out.println(curr);
        int i = 0;
        if (curr == 0){
            i = 1;
        }
        for(;i<=9;i++){
            Counting(n, curr*10+i);
        }
    }
}
