package Lecture15;
public class SubString_print {
    public static void main(String[] args){
        String s ="Hellobye";
        System.out.println(s.substring(2,5));
        custom_substring(s);
    }
    public static void custom_substring(String s1 ){
        for(int i = 0;i<s1.length();i++){
            for(int j =i+1;j<=s1.length();j++){
                System.out.println(s1.substring(i,j));
            }
        }
    }
}
