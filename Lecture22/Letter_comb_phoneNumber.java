package Lecture22;

import java.util.*;
public class Letter_comb_phoneNumber {
    public static void main(String[] args) {
        String SubSequence = "23";
        ArrayList<String> list = new ArrayList<>();
        Combination(SubSequence, "",list);
        System.out.println(list);
    }
    static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void Combination(String ques, String ans, ArrayList<String> list){
        if (ques.length() == 0){
            list.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        int num = ch - '0';
        String Press = map[num];
        for (int i = 0; i < Press.length(); i++) {
            Combination(ques.substring(1), ans + Press.charAt(i),list);
        }
    }
}
