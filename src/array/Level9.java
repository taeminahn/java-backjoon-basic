package array;

import java.util.Scanner;

public class Level9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basket = sc.nextInt();
        int count = sc.nextInt();
        int[] basketArr = new int[basket];

        for(int i = 0; i < basketArr.length; i++) {
            basketArr[i] = i + 1;
        }

        for(int i = 0; i < count; i++){
            int firstBasket = sc.nextInt() - 1;
            int secondBasket = sc.nextInt() - 1;
            int changeCount = secondBasket - firstBasket;
            for(int j = 0; j < changeCount; j++){
                if(firstBasket - secondBasket >= 0){
                    break;
                }
                int temp1 = basketArr[firstBasket];
                int temp2 = basketArr[secondBasket];
                basketArr[secondBasket] = temp1;
                basketArr[firstBasket] = temp2;
                firstBasket++;
                secondBasket--;
            }
        }

        for(int i = 0; i < basketArr.length; i++) {
            System.out.print(basketArr[i] + " ");
        }
    }
}
