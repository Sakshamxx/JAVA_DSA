package Lecture05;

import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        byte b = 3;
        short s = 5;
        int i = 9;
        long l = 16;
        Scanner sc = new Scanner(System.in);
        b=sc.nextByte();
        s=sc.nextShort();
        i=sc.nextInt();
        l=sc.nextLong();
        System.out.println(b+" "+s+" "+i+" "+l);
        sc.close();
    }
}