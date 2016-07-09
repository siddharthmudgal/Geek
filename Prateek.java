import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by SMudgal on 5/11/2016.
 */
public class Prateek {
    public static void main(String args[])
    {
        try {
            Scanner reader = new Scanner(new FileReader("input.txt"));
            int test_cases = reader.nextInt();
            int friends,budget,sum,flag;
            int[] gift;
            while (test_cases > 0)
            {
                sum=flag=0;
                friends = reader.nextInt();
                budget = reader.nextInt();
                gift = new int[friends];
                for (int i=0;i<friends;i++) {

                        gift[i] = reader.nextInt();
                        if (sum < budget) {
                            sum += gift[i];
                        }
                        if (sum == budget && flag != 2) {
                            flag = 2;
                            System.out.println("YES");
                        }
                        if (sum > budget)
                            flag = 1;

                }
                if (sum < budget)
                {
                    System.out.println("NO");
                    test_cases--;
                    continue;
                }
                if (flag == 2)
                {
                    test_cases--;
                    continue;
                }
                if (flag == 1)
                {
                    for (int i=1;i<friends;i++)
                    {
                        sum=gift[i];
                        if (i == friends - 1) {
                            if (sum == budget) {
                                System.out.println("YES");
                                flag = 2;
                                break;
                            }
                        }
                        else
                        {
                            for (int j=i+1;j<friends;j++)
                            {
                                sum+=gift[j];
                                if (sum == budget) {
                                    System.out.println("YES");
                                    flag = 2;
                                    break;
                                }
                                if (sum > budget)
                                    break;
                            }
                        }
                        if (flag == 2)
                            break;
                    }
                }
                if (flag != 2)
                    System.out.println("NO");
                test_cases--;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
