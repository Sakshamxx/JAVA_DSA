package Lecture08;

public class Max_Value {
    public static void main(String[] args) {
        int[] arr = {3,5,1,7,8,6};
        System.out.println("Max1 of array: "+Max1(arr));
        System.out.println("Max2 of array: "+Max2(arr));
        System.out.println("Max3 of array: "+Max3(arr));
    }
    public static int Max1(int[] arr){
        int m = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }
    public static int Max2(int[] arr){
        int m = Integer.MIN_VALUE; //{MIN_VALUE = -2^31} and {MAX_VALUE = 2^31}
        for(int i =1;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }
    public static int Max3(int[] arr){
        int m = Integer.MIN_VALUE; //{MIN_VALUE = -2^31} and {MAX_VALUE = 2^31}
        for(int i =1;i<arr.length;i++){
            // if(arr[i]>m){
            //     m=arr[i];
            // }
            m= Math.max(m, arr[i]);
        }
        return m;
    }
}
