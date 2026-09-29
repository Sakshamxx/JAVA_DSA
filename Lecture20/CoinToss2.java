package Lecture20;

public class CoinToss2 {

    // Static Variable
    static int count = 0;

    public static void main(String[] args) {
        int n = 3;
        System.out.println(count_toss(n,""));
    }

    public static void toss(int N, String ans) {
        if (N == 0) {
            System.out.println(ans);
            count++;
            return;
        }
        if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
            toss(N - 1, ans + "H");
        }
        toss(N - 1, ans + "T");
    }

    public static int count_toss(int N, String ans) {

        if (N == 0) {
            return 1;
        }

        int b = count_toss(N - 1, ans + "T");

        if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
            int a = count_toss(N - 1, ans + "H");
            return a + b;
        }

        return b;
    }
}
