package Lecture1;

public class grade {
    public static void main(String[] args) {
        int Grade = 79;
        if (Grade >= 75) {
            System.out.println("A Grade");
        } else if (Grade < 75 && Grade >= 65) {
            System.out.println("B Grade");
        } else if (Grade < 65 && Grade >= 55) {
            System.out.println("C Grade");
        } else if (Grade < 55 && Grade >= 40) {
            System.out.println("Passing Grade");
        } else if (Grade < 40) {
            System.out.println("Fail");
        }
    }
}
