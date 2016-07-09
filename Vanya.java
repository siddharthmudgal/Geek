import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by SMudgal on 6/26/2016.
 */
public class Vanya {
    public static void main(String[] args)
    {

        try {
            Scanner scanner = new Scanner(new FileReader("input.txt"));
            int n = scanner.nextInt();
            Stack<Integer> noStack = new Stack<>();
            int no,total_sub = 0;
            for (int i=0;i<n;i++){
                no = scanner.nextInt();
                if (gcd(noStack,no))
                {
                    if (no == 1 && !noStack.empty() && noStack.lastElement() == 1){
                        total_sub++;
                        continue;
                    }
                    if (!noStack.empty() && no < noStack.lastElement()) {
                        total_sub+=subseq(noStack);
                        noStack.clear();
                        noStack.push(no);
                        if (i == n-1){
                            total_sub+=subseq(noStack);
                            continue;
                        }
                        continue;
                    }
                    if (i == n-1){
                        noStack.push(no);
                        total_sub+=subseq(noStack);
                        continue;
                    }
                    if (!noStack.contains(no))
                        noStack.push(no);
                }
            }
            System.out.println(total_sub%1000000007);
        }catch (IOException e)
        {
            System.out.println(e);
        }
    }
    private static boolean gcd(Stack<Integer> noS,int no){
        int last;
        if (noS.isEmpty() || no == 1)
            return true;
        Iterator<Integer> noStack = noS.iterator();
        while (noStack.hasNext())
        {
            last = noStack.next();
            if (last == 1)
                continue;
            if ((no%last) != 0)
                continue;
            else
                return false;
        }
        return true;
    }
    private static int subseq(Stack<Integer> noStack){
        int count = 0;
        if (noStack.contains(1))
            count+=1;
        int size = noStack.size(),fsize = fact(size);
        for (int i=2;i<=size;i++)
        {
            count+=perm(fsize,size,i);
        }
        return count;
    }
    private static int perm(int fsize, int size ,int i){

        return fsize/(fact(i)*fact(size - i));
    }

    private static int fact(int no){
        if (no == 0)
            return 1;
        no *= fact(no-1);
        return no;
    }
}
