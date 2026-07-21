package Lecture14;

public class Spiral {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };

        printSpiral(arr);
    }

    public static void printSpiral(int[][] arr) {
        int minR = 0, minC = 0;
        int maxR = arr.length - 1;
        int maxC = arr[0].length - 1;

        while (minR <= maxR && minC <= maxC) {

            // Top row
            for (int i = minC; i <= maxC && minC <= maxC; i++) {
                System.out.print(arr[minR][i] + " ");
            }
            minR++;

            // Right column
            for (int i = minR; i <= maxR && minR <= maxR; i++) {
                System.out.print(arr[i][maxC] + " ");
            }
            maxC--;

            // Bottom row
            if (minR <= maxR) {
                for (int i = maxC; i >= minC && minC <= maxC; i--) {
                    System.out.print(arr[maxR][i] + " ");
                }
                maxR--;
            }

            // Left column
            if (minC <= maxC) {
                for (int i = maxR; i >= minR && minR <= maxR; i--) {
                    System.out.print(arr[i][minC] + " ");
                }
                minC++;
            }
        }
    }
}