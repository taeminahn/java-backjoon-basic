package Array;

import java.util.Scanner;
import java.util.Arrays;
public class Level7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] studentArr = new Integer[30];
        for(int i = 0; i < 28; i++){
            studentArr[i] = sc.nextInt();
        }
        for(int i = 1; i < studentArr.length + 1; i++){
//            System.out.println(Arrays.asList(studentArr).indexOf(i));
            if(Arrays.asList(studentArr).indexOf(i) == -1) {
                System.out.println(i);
            }
        }
    }
}
