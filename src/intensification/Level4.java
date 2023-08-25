package intensification;

import java.util.Scanner;
import java.lang.StringBuffer;
public class Level4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        String reverseStr = sb.reverse().toString();
        System.out.println(str.equals(reverseStr) ? 1 : 0);
    }
}
