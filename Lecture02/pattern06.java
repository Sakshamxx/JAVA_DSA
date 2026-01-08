package Lecture02;

public class pattern06 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = 0;
        int star = 5;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            star--;
            space += 2;
            row++;
            System.out.println();
        }
    }
}
