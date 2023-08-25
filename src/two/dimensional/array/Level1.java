package two.dimensional.array;

import java.util.Scanner;
public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] inputArr = new int[n * 2][m];
        int[][] outputArr = new int[n][m];

        for(int i = 0; i < n * 2; i++){
            for(int j = 0; j < m; j++){
                inputArr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                outputArr[i][j] = inputArr[i][j] + inputArr[i+n][j];
                System.out.print(outputArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
