package Lecture07;
import java.util.*;
public class armstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(isArmstrong(n));

        sc.close();
    } 

    public static boolean isArmstrong(int n){
        int sum=0;
        int num = n;
        int c = countOfDigit(n);
        while(n>0){
            int rem = n%10;
            sum+=(int) Math.pow(rem,c);
            n=n/10;
        }
        if (sum==num){
            return true;
        }else{
            return false;
        }
    }

    public static int countOfDigit(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
}
