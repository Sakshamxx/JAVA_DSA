package Lecture21;

public class PrintPath {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        System.out.println(printPath(0,0,m-1,n-1));
    }
    public static int printPath(int cc,int cr, int ec, int er){
        // Base case
        if ( cc == ec && cr == er){
            return 1;
        }
        // Return Condition
        if ( cc > ec || cr > er){
            return 0;
        }
        // Recursion
        int a = printPath(cc, cr+1, ec, er);
        int b = printPath(cc+1, cr, ec, er);
        return a+b;
    }
}
