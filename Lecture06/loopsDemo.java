package Lecture06;

public class loopsDemo {
    public static void main(String[] args) { 
        // for (byte i = 0; i <= 127; i++) {
        //     System.out.println(i);
        // }
        // THIS ABOVE WILL BE TYPECASTED AND WILL BECOME INFINITE LOOP
        for (byte i = 0; i < 127; i++) {
            System.out.println(i);
        }
    }
}
