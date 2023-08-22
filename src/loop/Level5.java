package loop;

import java.util.Scanner;
public class Level5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for(int i = 0; i < num / 4; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
