package Easy;

import java.io.InputStreamReader;
import java.util.Scanner;

public class ReversePower {
    public static void main(String [] args){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int test_case = scanner.nextInt();
        long number, reverse;
        long result;
        for (int i=0;i<test_case;i++){
            number = scanner.nextLong();
            reverse = rev(number);
            result = pow(number,reverse,100000007);
            System.out.println(result);
        }
    }
    private static long pow(long no, long po, int p){
        long res  = 1;
        no = no % p;
        while (po > 0){
            if ((po & 1) != 0){
                res = (res * no) % p;
            }
            po = po >> 1;
            no = (no*no) % p;
        }
        return res;
    }
    private static long rev(long no){
        long rev = 0;
        while (no>0){
            rev = (rev * 10) + no%10;
            no = no/10;
        }
        return rev;
    }
}
