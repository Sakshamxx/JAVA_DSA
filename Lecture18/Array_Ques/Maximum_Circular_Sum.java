package Lecture18.Array_Ques;

import java.util.*;

public class Maximum_Circular_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, -1 , 3, -11, 4, -18, 7, 5};
        System.err.println(MaxSum(arr));
        sc.close();
    }

    public static int MaxSum(int[] arr){
        int linearSum = kadenes_Algo(arr);
        int total = 0;
        for (int i = 0; i < arr.length; i++){
            total = total + arr[i];
            arr[i] = arr[i]*(-1);
        }
        int inverse = kadenes_Algo(arr);
        int Circular_Max = total + inverse;
        if (Circular_Max == 0){
            return linearSum;
        }
        return Math.max(Circular_Max, linearSum);
    }

    public static int kadenes_Algo(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum+=arr[i];
            ans = Math.max(ans, sum);
            if (sum < 0){
                sum = 0;
            }
        }
        return ans;
    }
}