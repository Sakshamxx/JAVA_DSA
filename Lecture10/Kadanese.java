package Lecture10;

// LEETCODE PROBLEM -> 53 MAXIMUM SUBARRAY (MEDIUM)
public class Kadanese {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -11, 4, -1, 5 };
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans=Math.max(ans, sum);
            if (sum<0){
                sum=0;
            }
        }
        return ans;
    }
}
