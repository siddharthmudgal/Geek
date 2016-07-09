package Easy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistinctSub {
    private static final int max = 100000007;
    public static void main(String args[]){
        // 97 - 122
        int [] alp = new int [255];
        for (int i=0;i<255;i++)
            alp[i] = -1;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int test_cases = Integer.parseInt(bufferedReader.readLine());
            String seq;
            for (int i=0;i<test_cases;i++){
                seq = bufferedReader.readLine();
                count(seq,alp.clone());
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
    private static void count(String seq,int [] alp) {
        int size = seq.length();
        long [] str = new long[size];
        long total = 1;
        char ch;
        for (int i=0;i<size;i++){
            ch = seq.charAt(i);
            if (alp[ch] != -1){
                if (alp[ch] == 0){
                    total = (total * 2);
                    total -= 1;
                }
                else {
                    total = ((total * 2) - str[alp[ch] - 1]);
                }
                    alp[ch] = i;
            }
            else {
                total = (total *2);
            }
            total = total % max;
            str[i] = total;
            alp[ch] = i;

        }
        System.out.println(total);
    }


}
