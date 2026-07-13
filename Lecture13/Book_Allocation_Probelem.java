package Lecture13;

import java.util.Scanner;

public class Book_Allocation_Probelem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt(); // number of books
            int m = sc.nextInt(); // number of students

            int[] pages = new int[n];

            for (int i = 0; i < n; i++) {
                pages[i] = sc.nextInt();
            }

            System.out.println(minPages(pages, m));
        }

        sc.close();
    }

    public static int minPages(int[] pages, int students) {

        if (students > pages.length) {
            return -1;
        }

        int lo = 0;
        int hi = 0;

        for (int page : pages) {
            lo = Math.max(lo, page);
            hi += page;
        }

        int ans = hi;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (isPossible(pages, students, mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;       
            }
        }

        return ans;
    }

    public static boolean isPossible(int[] pages, int students, int maxPages) {

        int studentCount = 1;
        int currentPages = 0;

        for (int i = 0; i < pages.length; i++) {

            if (currentPages + pages[i] <= maxPages) {
                currentPages += pages[i];
            } else {
                studentCount++;
                currentPages = pages[i];

                if (studentCount > students) {
                    return false;
                }
            }
        }

        return true;
    }
}