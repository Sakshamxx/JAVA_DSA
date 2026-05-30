package Lecture11;

public class First_Bad_Version {
    public static void main(String[] args) {
        
    }
    public static boolean isBadVersion(int n){
        return false;
    }
    public static int BadVersion(int n ){
        int l=1;
        int h=100;
        int ans = 0;
        while(l<=h){
            int mid = l+(h-l)/2; // (l+h)/2;
            if (isBadVersion(mid)){
                ans = mid;
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return ans;
    }
}
