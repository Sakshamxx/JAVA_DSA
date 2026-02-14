package Lecture06;

import java.util.Scanner;
  
public class typeCasting_3 {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println((int) (ch));
        ch++; // ch = (char) (ch+1);
        System.out.println(ch);
        ch = (char) (ch+1);
        System.out.println(ch);
        Scanner sc = new Scanner(System.in);
        ch=sc.next().charAt(0);
        System.out.println((int) (ch));
        sc.close();
    }
    
}