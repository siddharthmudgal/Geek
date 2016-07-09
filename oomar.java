import java.io.*;
import java.util.*;

/**
 * Created by SMudgal on 4/10/2016.
 */
public class oomar {

    public static void main (String args[])
    {
        int[] alp = null;
        HashMap<Character,Integer> alpha = new HashMap<Character,Integer>();
        String word;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
            int test_cases = Integer.parseInt(bufferedReader.readLine());
            while (test_cases > 0)
            {
                alp = new int[26];

                word = bufferedReader.readLine();
                for (int i=0;i<word.length();i++)
                {
                    alp[(word.charAt(i)-97)]++;
                    alpha.put(word.charAt(i),alp[word.charAt(i)-97]);
                }
                Set<Map.Entry<Character, Integer>> al_set = alpha.entrySet();
                List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(al_set);
                Collections.sort( list, new Comparator<Map.Entry<Character, Integer>>()
                {
                    public int compare( Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2 )
                    {
                        if (o1.getValue().equals(o2.getValue()))
                            return (o2.getKey().compareTo(o1.getKey()));
                        return (o1.getValue()).compareTo( o2.getValue() );
                    }
                } );

                for (char i='z';i>='a';i--)
                {
                    if (!alpha.containsKey(i))
                    {
                        System.out.print(i+" ");
                    }
                }
                for(Map.Entry<Character, Integer> entry:list)
                    System.out.print(entry.getKey()+" ");
                test_cases--;
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


