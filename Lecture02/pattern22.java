package Lecture02;

import java.util.*;

public class pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int space = -1;
        int row = 1;
        while (row <= n) {
            // Star Prep
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            // Space prep
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            // Star prep
            int k = 1;
            if (row == 1) {
                k = 2;
            }
            while (k <= star) {
                System.out.print("* ");
                k++;
            }
            row++;
            star--;
            space += 2;
            System.out.println();
        }
        sc.close();
    }
}
