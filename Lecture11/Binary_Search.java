package Lecture11;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8};
        int item =7 ;
        System.out.println(binarySearch(arr, item));
          
    }

    public static int binarySearch(int[] arr, int t){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if (arr[mid] == t){
                return mid;
            }
            else if (arr[mid]<t){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}
