package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CrossString {
    public static void main(String[] args){

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int test_cases = Integer.parseInt(bufferedReader.readLine());
            String inp;
            int l, r, size;
            for (int i = 0; i < test_cases; i++) {
                inp = bufferedReader.readLine();
                l = 0;
                r = inp.length() - 1;
                size = inp.length() - 1;
                while (l < r) {
                    for (int j = 0; j < l; j++)
                        System.out.print(" ");
                    System.out.print(inp.charAt(l++));
                    for (int j=0;j<(r-l);j++)
                        System.out.print(" ");
                    System.out.print(inp.charAt(r));
                    for (int j = 0; j < (size-r); j++)
                        System.out.print(" ");
                    --r;
                }
                while (l == r){
                    for (int j=0;j<l;j++){
                        System.out.print(" ");
                    }
                        System.out.print(inp.charAt(l));
                    for (int j=0;j<size - r;j++){
                        System.out.print(" ");
                    }
                    l++;
                    r--;
                }
                while (l < size) {

                    for (int j = 0; j < r; j++)
                        System.out.print(" ");
                    System.out.print(inp.charAt(r--));
                    for (int j=0;j<(l-r);j++)
                        System.out.print(" ");
                    System.out.print(inp.charAt(l));
                    for (int j = 0; j < size - l; j++)
                        System.out.print(" ");
                    l++;


                }
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
