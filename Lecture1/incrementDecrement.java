package Lecture1;

public class incrementDecrement {
    public static void main(String[] args) {
        int a = 6;
        // System.out.println(a++); //Post Increment
        // System.out.println(a);

        // int b=11;
        // System.out.println(b--); //Post Decrement
        // System.out.println(b);

        // int x= a++ + 6 + a-- - a-- + a++ - a++; 12
        // int x = a-- + 7 + a-- + 8 + a++;
        // System.out.println(x);

        // int a = 6;
        // System.out.println(++a); // Pre Increment
        // System.out.println(a);

        // int b = 11;
        // System.out.println(--b); // Pre Decrement
        // System.out.println(b);

        int x = a++ + --a - ++a + 11 + a++ - a-- + ++a;
        System.out.println(x);
    }
}
