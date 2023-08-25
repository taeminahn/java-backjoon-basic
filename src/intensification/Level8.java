package intensification;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Level8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String creditList[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double creditScore[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
        double totalCredit = 0.0;
        double totalScore = 0.0;

        for(int i = 0; i < 20; i++){
            StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String credit = st.nextToken();
            if(!credit.equals("P")){
                totalScore += score;
                totalCredit += score * creditScore[Arrays.asList(creditList).indexOf(credit)];
            }
        }
        System.out.printf("%.6f\n", (totalCredit / totalScore));
    }
}
