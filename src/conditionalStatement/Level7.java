package conditionalStatement;

import java.util.Scanner;
public class Level7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sameNumCount = 0;
        int sameNum = 0;
        int bigNum = 0;
        int[] numArr = new int[3];

        for(int i = 0; i < 3; i++){
            numArr[i] = sc.nextInt();
            if(i != 0) {
                // if(numArr[i] == numArr[i-1]){
                //     sameNumCount ++;
                //     sameNum = numArr[i];
                // }
                if(numArr[i] >= bigNum){
                    bigNum = numArr[i];
                }
            }else {
                bigNum = numArr[i];
                // sameNum = numArr[i];
            }
        }
        for(int i = 0; i < 3; i++) {
            if(numArr[i] == numArr[i+1]){
                sameNum = numArr[i];
            }
        }
        switch(sameNumCount) {
            case 0:
            System.out.println(bigNum * 100);
            break;
            case 1:
            System.out.println(1000 + sameNum * 100);
            break;
            case 2:
            System.out.println(10000 + sameNum * 1000);
        }
    }

}
