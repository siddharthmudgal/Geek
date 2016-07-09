import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by SMudgal on 2/27/2016.
 */
public class Arijit {
    public static void main(String[] args)
    {
        try {
            Scanner reader = new Scanner(new FileReader("input.txt"));
            int size_of_array = reader.nextInt();
            int[] arr = new int[size_of_array];
            int t1,t2;
            double counter = 0;
            double denominator = size_of_array*(size_of_array-1);
            for (int i=0;i<size_of_array;i++)
            {
                arr[i] = reader.nextInt();

            }
            for (int i=0;i<size_of_array;i++)
            {
                for (int j=0;j<i;j++)
                {
                    if (arr[i] == 1)
                    {
                        t2 = (int) Math.sqrt(arr[j]);
                        if (t2*t2 == arr[j])
                            counter++;
                    }
                    if (arr[j] == 1)
                    {
                        t2 = (int) Math.sqrt(arr[i]);
                        if (t2*t2 == arr[i])
                            counter++;
                    }
                    if (arr[i]%2 == 0)
                        if (arr[j]%2 != 0)
                            continue;
                    if (arr[i]%2 != 0)
                        if (arr[j]%2 == 0)
                            continue;
                    if (arr[i] == arr[j]) {
                        counter++;
                        continue;
                    }
                    t1 = arr[i] * arr[j];
                    t2 = (int) Math.sqrt(t1);
                    if (t2*t2 == t1)
                        counter++;
                }
            }
            DecimalFormat numberFormat = new DecimalFormat("0.000000");
            System.out.println(numberFormat.format(((counter*2)/denominator)));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

