package Lecture21;

public class UniquePath {
    public static void main(String[] args) {
        int m=3;
        int n=7;
        countPath(0,0,m-1,n-1,"");
    }
    static int count;
    public static void countPath(int cc, int cr, int ec, int er,String ans){
        if (cc == ec && cr == er){
            count++;
            System.out.println(count);
            return;
        }
        if (cr < er || cc < ec){
            return;
        }
        countPath(cc+1, cr, ec, er,ans+"H");
        countPath(cc, cr+1, ec, er,ans+"V");
    }
}
