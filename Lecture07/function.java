package Lecture07;

public class function {
    public static void main(String[] args) {
        System.out.println("Hello");
        Add();
        System.out.println("Bye");
    }
    // Non-Parametrized
    public static void Add(){
        int a =9;
        int b=7;
        int c = a+b;
        Sub();
        System.out.println(c);
    }

    public static void Sub(){
        int a =9;
        int b=7;
        int c = a-b;
        System.out.println(c);
    }
}
