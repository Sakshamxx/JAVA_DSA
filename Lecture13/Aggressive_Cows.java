package Lecture13;

import java.util.Scanner;
import java.util.Arrays;

public class Aggressive_Cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // No of Test Cases
        while(t>0){
            int n = sc.nextInt(); // No of Stalls
            int c = sc.nextInt(); // No of Cows
            int[] stall = new int[n];
            for (int i = 0; i < stall.length; i++) {
                stall[i] = sc.nextInt(); // Position of Stalls
            }
            Arrays.sort(stall); // To Sort Array in any Ques In-Built fn
            System.out.println("Minimum Distance: " + largestMinDistance(stall, c));
            t--;
        }
        sc.close();
    }

    public static int largestMinDistance(int[] stall, int c) {
        int lo = 0;
        int hi = stall[stall.length - 1] - stall[0];
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (isItPossible(stall, c, mid) == true) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isItPossible(int[] stall, int c, int mid) {
        int cow = 1;
        int pos = stall[0];
        for (int i = 1; i < stall.length; i++) {
            if ((stall[i] - pos) >= mid) {
                pos = stall[i];
                cow++;
            }
            if (cow == c) {
                return true;
            }
        }
        return false;
    }

}