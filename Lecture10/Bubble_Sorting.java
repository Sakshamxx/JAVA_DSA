package Lecture10;

public class Bubble_Sorting {
    public static void main(String[] args) {
        int[] arr={4,5,3,2,1};
        System.out.print("Actual Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Sort(arr);
        System.out.print("Sorted Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Sort(int[] arr){
        int n=arr.length;
        for(int turn=1;turn< n;turn++){
            for(int i=0;i<n-turn;i++){
                if (arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp; 
                }
            }
        }
    }
}