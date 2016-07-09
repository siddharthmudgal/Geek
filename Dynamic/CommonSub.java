package Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CommonSub {
    public static void main(String [] args){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int test_cases = Integer.parseInt(bufferedReader.readLine());
            String s1,s2,common;
            for (int i=0;i<test_cases;i++){
                s1 = bufferedReader.readLine();
                s2 = bufferedReader.readLine();
                int k = 0;
                common = "";
                for (int j=0;j<s1.length();j++){
                    for (int z=k;z<s2.length();z++){
                        if (s1.charAt(j) == s2.charAt(z)){
                            k = z;
                            common = common.concat(Character.toString(s1.charAt(j)));
                            break;
                        }
                    }
                }
                System.out.println(common);
            }

        }catch (IOException e){
            System.out.println(e);
        }

    }
}
