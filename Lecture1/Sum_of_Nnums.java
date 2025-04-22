package Lecture1;

public class Sum_of_Nnums {
    public static void main(String[] args) {
        int n=10;
        int i=1;
        int sum=0;
        System.out.println("SUM"+"\t"+"I");
        while(i<=n){
             sum+=i;//sum=sum+i
             i=i+1;
             System.out.println(sum+"\t"+i);
        }
        // System.out.println(sum);
    }
}
