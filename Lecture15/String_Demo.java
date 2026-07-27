package Lecture15;

public class String_Demo {
    public static void main(String[] args){
        String s1 = "Saksham";
        String s2 = "Saksham";
        String s3 = new String("Saksham");
        String s4 = new String("Saksham");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        int[] arr =new int[5];
        System.out.println(arr.length);
        System.out.println(s1.length());

    }
}
