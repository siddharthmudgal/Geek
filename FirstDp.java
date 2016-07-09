import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.min;

/**
 * Created by SMudgal on 7/3/2016.
 */
public class FirstDp {
    public static void main(String args[]){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int number = scanner.nextInt();
        int [] memo = new int[number+1];
        Arrays.fill(memo,-1);
        System.out.println(find_shortest_path(number, memo));
    }
    private static int find_shortest_path(int n, int[] memo){
        if (n == 1) return 0;
        if (memo[n] != -1) return memo[n];
        int r = 1 + find_shortest_path(n - 1,memo);
        if (n % 2 == 0) r = min(r, 1+find_shortest_path(n/2,memo));
        if (n % 3 == 0) r = min(r,1+find_shortest_path(n/3,memo));
        memo[n] = r;
        return r;
    }
}
