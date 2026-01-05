package Lecture2.Homework;

import java.util.Scanner;

public class pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int row = 1;
        while (row <= n) {
            // Star prep
            int i = 1;
            int j = n;
            while (i <= star) {
                System.out.print(j + " ");
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
