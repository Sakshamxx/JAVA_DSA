package Lecture04;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                count++;
                break; // Optimised it will break when count becomes 1
            }
        }
        if (count >= 1) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
        sc.close();
    }
}