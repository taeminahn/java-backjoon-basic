package characterAndString;

import java.util.Scanner;
public class Level3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 0; i < count; i++){
            String st = sc.next();
            System.out.print(st.charAt(0));
            System.out.print(st.charAt(st.length() -1));
            System.out.println();
        }
    }
}
