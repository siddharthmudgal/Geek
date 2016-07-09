import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Prime {
    final static int max = 10000000;
    public static void main(String args[]){
        boolean[] prime = new boolean[max];
        int [] primes2 = new int [max];
        int sq = (int) Math.sqrt(max);
        for (int i=2;i<sq;i++){
            if (prime[i] == false){
                for (int j=2*i;j<max;j+=i){
                    prime[j] = true;
                    if (primes2[j] == 0)
                        primes2[j] = i;
                }
            }
        }
        for (int i=2;i<max;i++)
            if (primes2[i]== 0)
                primes2[i] = i;

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int test_case = scanner.nextInt();
        int l,r,sum;
        long final_sum=0;
        for (int i = 0;i<test_case;i++) {
            sum = 1;final_sum= 0;
            l = scanner.nextInt();
            r = scanner.nextInt();
            for (int j=l;j<=r;j++){
                final_sum+=find(j,primes2,sum);
            }
            System.out.println(final_sum);
        }


    }
    private static int find(int temp,int [] primes,int sum) {
        if (temp == 1)
            return 1;
        int factor = 0;
        int div = primes[temp];

        while (temp%div == 0){
            ++factor;
            temp = temp/div;
        }
        sum *= ((Math.pow(div, ++factor) - 1) / (div - 1)) * find(temp,primes,sum);
    return sum;
    }
}
