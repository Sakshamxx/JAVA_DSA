package Lecture10;

public class Revise {
    public static void main(String[] args) {
        int[] arr = { 12, 4, 6, 1, 22, 9, 2 };
        System.out.println("Original Array:");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        // bubble(arr);
        // System.out.println("Bubble Sort:");
        // for(int i =0;i<=arr.length-1;i++){
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println("");
        System.out.println();
        System.out.println("Selection Sort:");
        selection(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int minidx(int[] arr, int i) {
        int mini = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[mini]) {
                mini = j;
            }
        }
        return mini;
    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int idx = minidx(arr, i);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }

    public static void bubble(int[] arr) {
        int n = arr.length;
        for (int turn = 1; turn < n; turn++) {
            for (int i = 0; i < n - turn; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}