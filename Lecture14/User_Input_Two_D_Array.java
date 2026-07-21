package Lecture14;

import java.util.Scanner;

public class User_Input_Two_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int[][] arr = new int[n][m];
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // Display(arr);
        int[][] vertical_wave = {{1,2,3,4,5},
                                 {6,7,8,9,10},
                                 {11,12,13,14,15},
                                 {16,17,18,19,20} };
        WavePrint(vertical_wave);
        sc.close();
    }

    public static void Display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Element at [" + i +"," + j + "] is: " + arr[i][j]);
            }
        }
    }
        public static void WavePrint(int[][] arr) {
        for (int col = 0; col < arr[0].length; col++) {
            if (col%2==0){
                for (int row = 0;row<arr.length;row++){
                    System.out.print(arr[row][col] + " ");
                }
            }else{
                    for (int row = arr.length-1;row>=0;row--){
                    System.out.print(arr[row][col] + " ");
                }
            }
    }
}
}
