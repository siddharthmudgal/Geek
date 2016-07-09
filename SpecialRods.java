import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by SMudgal on 5/21/2016.
 */
public class SpecialRods {
    static int special_rods = 0;
    public static void main(String args[]) {
        try {
            Scanner scanner = new Scanner(new FileReader("input.txt"));
            int test_cases = scanner.nextInt();
            int rod;
            for (int i=0;i<test_cases;i++)
            {
                rod = scanner.nextInt();

                for (int j=2;j<=rod;j++)
                {
                    find_special_rod(j);
                }
                System.out.println(special_rods);
                special_rods = 0;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    private static void find_special_rod(int rod)
    {
        if (rod == 1)
            return;
        int rem = rod%2;
        while (rod!=1 && rem!=0)
        {
            rod = rod/2;
            if (rod == 3 || rod == 7 || rod == 15)
            rem = rod%2;

        }
        if (rem==0)
            return;
        special_rods++;
    }
    private static void special_rod(int rod)
    {}
}
