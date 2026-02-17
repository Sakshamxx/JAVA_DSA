package Lecture07;

public class function_3 {
    static int val =30; //  GLOBAL VARIABLE  
    public static void main(String[] args) {
        System.out.println("Hello");
        int a=7;
        int b=11;
        System.out.println(val);
        System.out.println(Add(a,b));
        System.out.println(val);
    }
    // Parametrized
    public static int Add(int a, int b){
        int c = a+b;
        int val=100; //This is only for local variable
        function_3.val+=5; //To Access  Global Variable
        return c - Sub(c,b);
    } 

    // public static int Add(int a, int b){
    //     int c = a+b;
    //     int val=100;
    //     val+=5;
    //     return c - Sub(c,b);
    // } 

    public static int Sub(int a,int b){
        int c = a-b;
        return c;
    }
}
