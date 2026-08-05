package Lecture16;
import java.util.Scanner;

public class finding_CB_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        String s = sc.next();
        SubString(s);
        sc.close();
    }

    private static void SubString(String s){
        int count  = 0;
        boolean[] visited = new boolean[s.length()];
        for(int len =1;len<=s.length();len++){
            for(int j = len;j<=s.length();j++){
                int i = j-len;
                String str = s.substring(i,j); // String number
                if(isCBNumber(Long.parseLong(str) ) == true && isVisited(visited, i ,j-1)){
                    count++;
                    for (int k = i;k<j;k++){
                        visited[k] = true; // Marked
                    }
                }
            }
        }
        System.out.println(count);
    }

    private static boolean isVisited(boolean[] visited, int i, int j){
        for(int k = i;k<=j;k++){
            if (visited[k] == true){
                return false;
            }
        }
        return true;
    }

    private static boolean isCBNumber(long n){
        if (n ==0 || n ==1){
            return false;
        }
        int[] arr = {2,3,5,7,11,13,17,19,23,29};
        for (int i =0;i<arr.length;i++){
            if (n ==arr[i]){
                return true;
            }
        }

        for(int i =0;i<arr.length;i++){
            if (n %arr[i]==0){
                return false;
            }
        }
        return true;
    }
}
