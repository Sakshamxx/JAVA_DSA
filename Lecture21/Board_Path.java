package Lecture21;

public class Board_Path {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Count_Dice(n, 0, ""));
        
    }

    public static void Dice(int ans, int curr, String str){
        if ( curr == ans){
            System.out.print(str+' ');
            return;
        }
        if ( curr > ans){
            return;
        }
        for (int dice = 1; dice <= 6; dice++){
            Dice(ans, curr+dice, str+dice);
        }
        // Dice(ans, curr+1, str + 1);
        // Dice(ans, curr+2, str + 2);
        // Dice(ans, curr+3, str + 3);
        // Dice(ans, curr+4, str + 4);
        // Dice(ans, curr+5, str + 5);
        // Dice(ans, curr+6, str + 6);
    }

    public static int Count_Dice(int ans, int curr, String str){
        if ( curr == ans){;
            return 1;
        }
        if ( curr > ans){
            return 0;
        }
        int count = 0;
        for (int dice = 1; dice <= ans; dice++){
            int cc = Count_Dice(ans, curr+dice, str+dice);
            count+= cc;
        }
        return count;
    }
}
