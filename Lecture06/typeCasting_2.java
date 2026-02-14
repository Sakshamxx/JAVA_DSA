package Lecture06;

import java.util.Scanner;

public class typeCasting_2 {
    public static void main(String[] args) {
        float f = 8.9f;
        double d = 8.9;
        Scanner sc = new Scanner(System.in);
        f=sc.nextFloat();
        d = sc.nextDouble();  
        sc.close();
    }
}