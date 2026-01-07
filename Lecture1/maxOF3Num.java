package Lecture1;

public class maxOF3Num {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int c = 9;
        if (a > b && a > c) {
            System.err.println(a + " is the largest");
        } else if (b > a && b > c) {
            System.err.println(b + " is the largest");
        } else {
            System.err.println(c + " is the largest");
        }
    }
}
