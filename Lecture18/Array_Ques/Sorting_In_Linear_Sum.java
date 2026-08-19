package Lecture18.Array_Ques;

import java.util.Scanner;

public class Sorting_In_Linear_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        DNF(arr);
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");;
        }
        sc.close();
    }

    public static void DNF(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int i = 0;
        while ( i <= right) {
            if (arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
                i++;
            }
            else if ( arr[i] == 1){
                i++;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }
}