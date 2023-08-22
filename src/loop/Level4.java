package loop;

import java.util.Scanner;
public class Level4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < num; i++){
            int price = sc.nextInt();
            int count = sc.nextInt();
            sum += price * count;
        }
        if(sum == total){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
