package Array;

import java.util.Scanner;
public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrNum = sc.nextInt();
        int[] arr = new int[arrNum];
        int count = 0;
        for(int i = 0; i < arrNum; i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        for(int i = 0; i < arrNum; i++){
            if(arr[i] == num){
                count ++;
            }
        }
        System.out.println(count);
    }
}
