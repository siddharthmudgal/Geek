import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.max;

public class MaxAmount {
    public static void main(String args[]){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int test_case = scanner.nextInt();
        int size;
        int [] coins;
        for (int i=0;i<test_case;i++){
            size = scanner.nextInt();
            coins = new int[size];
            for (int j=0;j<size;j++)
                coins[j] = scanner.nextInt();

        }
    }
    private static int play(int[] coins,int chosen,int left, int right){
        return 0;
    }

}
