import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by SMudgal on 4/10/2016.
 */
public class milly {
    public static void main(String args[]) {
        try {
            Scanner bufferedReader = new Scanner(new FileReader("input.txt"));
            int test_cases = bufferedReader.nextInt();
            int students = 0,pos1=0,pos2=0,flag=0;
            int[] studs = null;

            while (test_cases > 0)
            {
                flag = pos1 = pos2 = 0;
                students = bufferedReader.nextInt();
                studs = new int[students];
                for (int i=0;i<students;i++)
                    studs[i] = bufferedReader.nextInt();

                for (int i=0;i<studs.length-1;i++)
                {
                    if (studs[i]>studs[i+1])
                    {
                        if (flag == 0)
                            flag = 1;
                        else
                        {
                            pos1=pos2=0;
                            break;
                        }
                        pos1 = i;
                        while (studs[i] > studs[i+1] && i<(studs.length-2))
                            ++i;
                        if (studs[i+1] < studs[pos1-1])
                        {
                            pos1=pos2=0;
                            break;
                        }
                        pos2 = i;
                    }
                }

                if ((pos1 == 0 && pos2 == 0) || (studs[pos2] < studs[pos1-1] || flag == 0))
                    System.out.println("-1 -1");
                else
                    System.out.println((pos1+1) + " "+ (pos2+1));

                test_cases--;
            }
        }catch (IOException e)
        {
            System.out.println(e);
        }

    }
}
