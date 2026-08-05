package Lecture16;

public class substring_lengthwise {
    public static void main(String[] args){
        lengthwise("abcd");
    }
    private static void lengthwise(String s){
        for(int len =1;len<=s.length();len++){
            System.out.println();
            System.out.println("Length ="+len);
            for(int j =len;j<=s.length();j++){
                int i = j - len;
                System.out.println("("+i+","+j+"): " + s.substring(i,j));
            }
        }
    }
}
