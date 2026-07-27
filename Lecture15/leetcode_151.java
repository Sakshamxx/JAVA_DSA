package Lecture15;
import java.util.Scanner;
public class leetcode_151 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Without Trim: "+s);
        System.out.println("With Trim: "+s.trim());
        System.out.println(reverse(s));
        System.out.println(reverse_word(s));
    }
    public static String reverse(String s){
        s=s.trim();
        String[] arr = s.split("\s+");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return s;
    }

        public static String reverse_word(String s){
        s=s.trim();
        String[] arr = s.split("\s+");
        String ans= "";
        for(int i =arr.length-1;i>=0;i--){
            ans = ans + arr[i] + " ";
        }
        return ans.trim();
    }
}
