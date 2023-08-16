package conditionalStatement;

import java.util.Scanner;
public class Level6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        min += sc.nextInt();
        for(int i = min / 60; i > 0; i--){
            hour ++;
            min -= 60;
            if(hour >= 24) {
                hour = 0;
            }
        }
        System.out.println(hour + " " + min);
    }

}
