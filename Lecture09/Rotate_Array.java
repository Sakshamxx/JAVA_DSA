package Lecture09;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k=3;
        RotateArray(nums, k);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void RotateArray(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        for (int j=1;j<=k;j++){
        int item = arr[n-1];
        for(int i =n-2;i>=0;i--){
            arr[i+1] = arr[i];
        }
        arr[0]= item;
    }
    }
}
