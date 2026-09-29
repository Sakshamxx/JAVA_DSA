package Lecture20;

public class CoinToss {
    public static void main(String[] args) {
        int N = 3;
        toss(N,"");
    }
    public static void toss(int N, String ans){
        if ( N == 0){
            System.out.println(ans);
            return;
        }
        toss(N-1, ans+"H");
        toss(N-1, ans+"T");
    }
}
