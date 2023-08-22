package characterAndString;

import java.util.Scanner;
public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int num = sc.nextInt() -1;

        System.out.println(st.charAt(num));
    }
}
