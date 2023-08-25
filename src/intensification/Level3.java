package intensification;

import java.util.Scanner;
public class Level3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = (2 * num) - 1;
        int star = 1;
        for (int i = 0; i < count; i++){
            if(i <= num - 1){
                if(i != 0){
                    star += 2;
                }
            }else {
                star -= 2;
            }
            int blank = count - star;
            for(int j = 1; j < count + 1; j++){
                if(blank / 2 >= j){
                    System.out.print(" ");
                } else if((blank / 2 + star) >= j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
