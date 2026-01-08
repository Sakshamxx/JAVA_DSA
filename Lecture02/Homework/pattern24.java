package Lecture02.Homework;

import java.util.Scanner;

public class pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n - 1;
        int row = 1;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print(row + " ");
                j++;
            }

            row++;
            star += 2;
            space--;
            System.out.println();
        }
        sc.close();
    }
}
