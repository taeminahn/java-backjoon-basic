package twoDimensionalArray;

import java.util.Scanner;

public class Level4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int total = count * 100;
        int[][] arr = new int[count][2];

        for(int i = 0; i < count; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < count - 1; i++){
            System.out.println("비교할 배열" + arr[i][0] + " " + arr[i][1]);
            for(int j = 1; j < count - i; j++){
                System.out.println("비교당할 배열" + arr[i + j][0] + " " + arr[i + j][1]);
            }
        }
    }
}
