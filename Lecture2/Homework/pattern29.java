package Lecture2.Homework;

import java.util.Scanner;

public class pattern29 {
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
                if (j == 1 || j == star) {
                    System.out.print(row + " ");
                } else {
                    System.out.print("0 ");
                }
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
