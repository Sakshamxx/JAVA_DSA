package Lecture09;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] result = Product_of_Array(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print( result[i] + " ");
        }
    }

    public static int[] Product_of_Array(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        left[0] = 1;
        for (int i = 0; i < n - 1; i++) {
            left[i + 1] = left[i] * nums[i];
        }
        int[] right = new int[n];
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            left[i] = left[i] * right[i];
        }
        return left;
    }
}