package Lecture22;

public class PrintDistinctPermutation {
    public static void main(String[] args) {
        String ans = "abcaa";
        DistinctPermutation(ans,"");
    }
    
        public static void DistinctPermutation(String ques, String ans){
        if (ques.length() == 0){
            System.out.println(ans);
            return;
        }
        boolean val = true;
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            for (int j = i+1; j < ques.length(); j++) {
                if (ques.charAt(j) == i){
                    val = false;
                    break;
                }
            }
            if ( val == true){
            String s1 = ques.substring(0,i);
            String s2 = ques.substring(i+1);
            DistinctPermutation(s1+s2, ans+ch);
        }
        }
    }
}
