import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by SMudgal on 5/21/2016.
 */
public class Hydra {
    public static void main(String args[])
    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            int test_cases = Integer.parseInt(reader.readLine());
            String test_case;
            String[] pass = new String[2];
            for (int i=0;i<test_cases;i++)
            {
                test_case = reader.readLine();
                pass = test_case.split("\\s+");
                System.out.println(pass[0]);
                System.out.println(pass[1]);
                //check_pass(pass);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
    public static void check_pass(String[] pass)
    {
            if ((2*pass[0].length()) == pass[1].length())
            {
                if (pass[1].contains(pass[0])) {
                    System.out.println("Possible");
                    return;
                }
                System.out.println("Impossible");
                return;
            }
        System.out.println("Impossible");
    }
}
