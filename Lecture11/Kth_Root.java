package Lecture11;

public class Kth_Root {
    public static void main(String[] args){
        System.out.println(K_root(3,143));
    }
    public static int K_root(int k, int n){
        int l = 1;
        int h = n;
        int ans = 0;
        while(l<=h){
            int mid = (l+h)/2;
            if (Math.pow(mid, k) <=n){
                ans = mid;
                l = mid +1;
            }else{
                h = mid -1;
            }
        }
        return ans;
    }
}
