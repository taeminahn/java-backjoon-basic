package two.dimensional.array;

import java.util.Scanner;
public class Level2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int maxNum = 0;
        int x = 0;
        int y = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
                if(maxNum <= arr[i][j]) {
                    maxNum = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        System.out.println(maxNum);
        System.out.print(x + " " + y);
    }
}
