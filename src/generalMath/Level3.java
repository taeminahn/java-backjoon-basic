package generalMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());

        while(num > 0){
            int result = num % b;
            if(result < 10){
                sb.append((char)(result + '0'));
            }else {
                sb.append((char)(result - 10 + 'A'));
            }
            num /= b;
        }
        System.out.println(sb.reverse());
    }
}
