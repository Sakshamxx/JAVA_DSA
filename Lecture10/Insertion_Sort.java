package Lecture10;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 8, 2 };
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            insertLastElement(arr, i);
        }
    }

    public static void insertLastElement(int[] arr, int i) {
        int item = arr[i];
        int j = i - 1;
        while (arr[j] > item) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j + 1] = item;
    }
}