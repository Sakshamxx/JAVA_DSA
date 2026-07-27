package Lecture15;

import java.util.Scanner;
public class PlayingwithGoodString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        System.out.println(longest_good_string(s));
        sc.close();
    }

    // Longest String
    public static int longest_good_string(String s){
        int ans = 0;
        int count = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if (isVowel(ch)==true){
                count++;
            }else{
                ans = Math.max(ans,count);
                count =0;
            }
        }
        return ans;
    }

    // Is vowel
    public static boolean isVowel(char ch){
        if (ch =='a' || ch =='e' || ch =='i' || ch=='o' || ch=='u' ){
            return true;
        }
        return false;
    }
}
