package Lecture10;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {9,3,4,1,3,0};
        Sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        } 
    }

    public static void Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = minidx(arr, i);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
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
}
