package Lecture17;

public class Subarray_Product_Less_Than_K {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int k = 10;
        System.out.println(LeetCode_713(arr, k));
    }

    public static int LeetCode_713(int[] arr, int k){
        int start = 0;
        int end = 0;
        int prod = 1;
        int ans = 0;
        while(end <= arr.length - 1){
            // Growing
            prod *= arr[end];
            // Shrinking
            while (prod >= k && start <= end){
                prod /= arr[start];
                start++;
            }
            // Answer
            ans += end - start + 1;
            end++;
        }
        return ans;
    }
}
