package Lecture15;

public class String_Equals {
    public static void main(String[]args){
        String s2 = "hello";
        String s3 = new String("Hello");
        System.out.println(s2==s3);
        System.out.println(s2.charAt(1));
        System.out.println(s2.equals(s3));
        System.out.println(equals_2(s2,"Hello"));
    }
    public static boolean equals_2(String s1, String s2){
        if (s1==s2){
            return true;
        }
        if (s1.length()!=s2.length()){
            return false;
        }
        for(int i =0;i<s1.length();i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return false;
    }
}
