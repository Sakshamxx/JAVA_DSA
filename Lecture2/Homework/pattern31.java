package Lecture2.Homework;

import java.util.Scanner;

public class pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N:");
        int n = sc.nextInt();
        System.out.println();
        int star = n;
        int row = 1;
        while (row <= n) {
            // Star prep
            int i = 1;
            int j = n;
            while (i <= star) {
                if (row == j) {
                    System.out.print("* ");
                } else {
                    System.out.print(j + " ");
                }
                i++;
                j--;
            }
            // Row Prep
            row++;
            System.out.println();
        }
        sc.close();
    }
}
