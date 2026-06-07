package Lecture12;

public class Time_Space_Complexity {
    public static void main(String[] args) {
        // Exponential way ->> Completely Wrong
        // This is hardware Dependancy
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
        int i = 0;
        int n = 100000;
        while (i <= n) {
            System.out.println("Hey");
            i *= 2;
        }
        while(n>0) {
            System.out.println();
            n/=2;
        }
        while(n>0) {
            System.out.println("Hello");
            i+=2;
            i+=3;
        }
    }
}
