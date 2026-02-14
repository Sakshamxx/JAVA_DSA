package Lecture06;
import java.util.*;
public class conversion_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minf =sc.nextInt();
        int maxf =sc.nextInt();
        int steps =sc.nextInt();
        for (int i=minf;i<=maxf;i+=steps){
            int c = (int) ((5/9.0)*(i-32));
            System.out.println(i+"\t"+c);
        }
        sc.close();
    }
}
