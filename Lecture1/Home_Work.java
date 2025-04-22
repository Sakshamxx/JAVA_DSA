package Lecture1;

public class Home_Work {
    public static void main(String[] args) {
        int n=100;
        int i=1;
        while(i<=n){
            if(i%3==0){
                i=i+1;
                continue;
            }
            System.out.println(i);
            i=i+1;
        }

        // for(int i=1;i<=n;i++){
        //     if(i%3==0){
        //         continue;
        //     }
        //     System.out.println(i+" ");
        // }
    }
}
