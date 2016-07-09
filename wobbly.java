import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by SMudgal on 2/28/2016.
 */
public class wobbly {
    public static void main(String[] args)
    {
        try
        {
            Scanner reader = new Scanner(new FileReader("input.txt"));

            int test_cases = reader.nextInt();
            int n,k;
            while (test_cases > 0)
            {
                n = reader.nextInt();
                k = reader.nextInt();
                if (k > 81)
                    System.out.println(-1);
                else
                {
                    int div = k /9;
                    div++;
                    int rem = k % 9;

                    if (rem <= div)
                    {
                        rem--;
                    }
                    int i=0;
                    while (i<n)
                    {
                        System.out.print(div);
                        i++;
                        
                        if (i<n) {
                            System.out.print(rem);
                            i++;
                        }
                    }
                    System.out.println();
                }
                test_cases--;
            }
        }catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
