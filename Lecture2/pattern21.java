package Lecture2;

import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = (2 * n) - 3;
        int row = 1;
        int star = 1;
        while (row <= n) {
            // Star prep
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            // Spcae prep
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            // Star prep
            int k = 1;
            if (row == n) {
                k = 2;
            }
            while (k <= star) {
                System.out.print("* ");
                k++;
            }
            row++;
            star++;
            space -= 2;
            System.out.println();
        }
        sc.close();
    }
}
