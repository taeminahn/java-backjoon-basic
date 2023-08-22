package Array;

import java.util.Scanner;
public class Level5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basket = sc.nextInt();
        int count = sc.nextInt();
        int[] basketArr = new int[basket];

        for(int i = 0; i < count; i++){
            int startBasket = sc.nextInt();
            int endBasket = sc.nextInt();
            int basketNum = sc.nextInt();
            for(int j = startBasket; j <= endBasket; j++){
                basketArr[j - 1] = basketNum;
            }
        }

        for(int i = 0; i < basketArr.length; i++) {
            System.out.print(basketArr[i] + " ");
        }
    }
}
