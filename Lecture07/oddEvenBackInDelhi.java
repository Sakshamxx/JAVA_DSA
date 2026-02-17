package Lecture07;
import java.util.*;

public class oddEvenBackInDelhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t>0) {
            int carno = sc.nextInt();
            if (even_Odd(carno) == true){
                System.out.println("Yess");
            }else{
                System.out.println("Nooo");
            }
            t--;
        }
        sc.close();
    } 
    public static boolean even_Odd(int n) {
        int sum_even = 0;
        int sum_odd = 0;
        while(n>0){
            int rem=n%10;
            if (rem%2==0){
                sum_even +=rem;
            }else{
                sum_odd+=rem;
            }
            n=n/10;
        }
        if (sum_even%4==0 || sum_odd%3==0){
            return true;
        }else{
            return false;
        }
    }
}
