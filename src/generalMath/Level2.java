package generalMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        String n = stk.nextToken();
        int b = Integer.parseInt(stk.nextToken());

        int sum = 0;

        for(int i = 0; i < n.length(); i++){
            int idx = n.length() - (i + 1);
            int num = (int)n.charAt(idx);
            if('0' <= n.charAt(idx) && n.charAt(idx) <= '9'){
                sum += (int)Math.pow(b, i) * (num - (int)'0');
            } else {
                sum += (int)Math.pow(b, i) * (num - (int)'A' + 10);
            }
        }
        System.out.println(sum);
    }
}
