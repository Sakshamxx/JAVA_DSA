package Lecture07;

public class function_2 {
    public static void main(String[] args) {
        System.out.println("Hello");
        // int value=Add();
        // System.out.println(value);
        System.out.println(Add());
    }
    public static int Add() {
        int a =8;
        int b =7;
        int c= a+b-Sub();
        return c;
    }
    public static int Sub(){
        int a =9;
        int b=7;
        int c = a-b;
        return c;
    }
}
