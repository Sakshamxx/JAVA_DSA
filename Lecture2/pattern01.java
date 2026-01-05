package Lecture2;

public class pattern01 {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int row = 1;
        while (row <= n) {
            // Star prep
            int i = 1;
            while (i <= star) {
                System.out.print(" *  ");
                i++;
            }
            // Row Prep
            row++;
            System.out.println();

        }
    }
}
