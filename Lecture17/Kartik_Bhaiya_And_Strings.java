package Lecture17;

import java.util.*;

public class Kartik_Bhaiya_And_Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        int flip_a = maxLen(str, k, 'a');
        int flip_b = maxLen(str, k, 'b');
        System.out.println(Math.max(flip_a, flip_b));
        sc.close();
    }

    public static int maxLen(String str, int k, char ch) {
        int si = 0;
        int ei = 0;
        int ans = 0;
        int flip = 0;

        while (ei < str.length()) {

            // Growing
            if (str.charAt(ei) != ch) {
                flip++;
            }

            // Shrinking
            while (flip > k) {
                if (str.charAt(si) != ch) {
                    flip--;
                }
                si++;
            }

            // Answer
            ans = Math.max(ans, ei - si + 1);
            ei++;
        }

        return ans;
    }
}