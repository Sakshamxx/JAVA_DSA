package Lecture19;

public class First_Occurence {
    public static void main(String[] args) {
        int item = 3;
        int[] arr = {2, 3, 4, 5, 3, 6};
        System.out.println(First_occurence(arr,item,0));
    }

    public static int First_occurence(int[] arr, int item, int ind){
        if (ind == arr.length) return -1;
        if ( arr[ind] == item) return ind;
        
        return First_occurence(arr, item, ind+1);
    }
}
