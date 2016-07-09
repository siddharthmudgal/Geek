import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class SuperPrime {
    public static void main(String[] args){
        int no = 10000000;
        boolean [] primes = new boolean[no];
        int [] super_primes = new int[58981];
        int count = 0;
        primes[0] = primes[1] = true;
        int sq = (int) Math.sqrt(no);
        for (int i=2;i<=sq;i++){
            if (primes[i] == false) {
                for (int j = (i + i); j < no; j += i) {
                    primes[j] = true;
                }
            }
        }
        int j =0;
        for (int i=3;i<no-2;i+=2){
            if (primes[i] == false && primes[i+2] == false)
                super_primes[j++] = i+2;

        }
        /*System.out.println(Arrays.toString(super_primes));
        System.out.println(super_primes.length);
        System.out.println(super_primes[58980]);*/
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int test_cases = Integer.parseInt(bufferedReader.readLine());
            int number;
            for (int i = 0; i< test_cases; i++){
                number = Integer.parseInt(bufferedReader.readLine());
                find(number,super_primes,0,j-1);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
    private static void find(int no, int[] super_primes, int low, int high){
        int mid = ((low+high)/2);
            if (super_primes[mid] == no)
                System.out.println(mid+1);
            if (low == high -1)
                System.out.println(high);
            else if (super_primes[mid] > no)
                find(no,super_primes,low,mid);
            else if (super_primes[mid] < no)
                find(no,super_primes,mid,high);
        return;
    }
}
