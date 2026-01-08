package Lecture02;

public class pattern07 {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int row = 1;
        while (row <= n) {
            int i = 1;
            while (i <= star) {
                if (i == 1 || i == n || row == 1 || row == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                i++;
            }
            row++;
            System.out.println();
        }
    } 
}
