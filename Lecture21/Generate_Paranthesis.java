package Lecture21;
import java.util.*;

public class Generate_Paranthesis {
    public static void main(String[] args) {
        int n =3;
        List<String> list = new ArrayList<>();
        GeneratePara(n, 0, 0, "", list);
        System.out.println(list);
    }

    public static void GeneratePara(int n, int open, int close, String ans, List<String> list) {
        if ( open == n && close == n){
            // System.out.print(ans+" ");
            list.add(ans);
            return;
        }
        if ( open < n) GeneratePara(n, open+1, close, ans+"(", list);
        if ( close < open) GeneratePara(n, open, close+1, ans+")", list);
    }
}