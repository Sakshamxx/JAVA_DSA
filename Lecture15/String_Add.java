package Lecture15;

public class String_Add {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "bye";
        String s = s1 + s2;
        String s4 = "Kaju" + s1;
        String s5 = "Kaju" + "Katli";
        String s3 = s1.concat(s2);
        System.out.println(s);
        System.out.println(s3);
        System.out.println("Hey" + 10 + 30 + "Bye" + 4 + 2);
        String sx = "Hello";
        sx = sx.concat(" World");

        System.out.println(sx);
    }
}
