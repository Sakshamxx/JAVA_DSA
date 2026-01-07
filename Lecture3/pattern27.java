package Lecture3;

import java.util.Scanner;

public class pattern27 {
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
            int val = 1;
            int j = 1;
            while (j <= star) {
                System.out.print(val + " ");
                if (j <= star / 2) {
                    val++;
                } else {
                    val--;
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
