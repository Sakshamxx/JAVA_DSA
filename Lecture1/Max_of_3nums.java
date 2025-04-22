package Lecture1;

public class Max_of_3nums {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 2;
        if (a > b && a > c) {
            System.out.println("A is greatest: " + a);
        } else if (b > a && b > c) {
            System.out.println("B is greatest: " + b);
        } else
            System.out.println("C is greatest: " + c);
    }
}
