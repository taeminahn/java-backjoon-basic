package intensification;

import java.util.Scanner;
public class Level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chessPieces = {1, 1, 2, 2, 2, 8};
        for(int i = 0; i < chessPieces.length; i++){
            int num = sc.nextInt();
            if(num == chessPieces[i]){
                System.out.print(0 + " ");
            }
            else {
                System.out.print(chessPieces[i] - num + " ");
            }
        }
    }
}
