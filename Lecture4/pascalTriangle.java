package Lecture4;

import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 0;
        while (row < n) {
            int i = 0;
            int val = 1;
            while (i < star) {
                System.out.print(val + " ");
                val = ((row - i) * val) / (i + 1);
                i++;
            }
            row++;
            star++;
            System.out.println();
        }
        sc.close();
    }
}
