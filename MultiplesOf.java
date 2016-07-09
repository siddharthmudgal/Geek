/**
 * Created by SMudgal on 5/28/2016.
 *
 * Program to print multiples of a number given a particular range
 */
public class MultiplesOf {
    public static void main(String[] args)
    {

        MultiplesOf multiplesOf = new MultiplesOf();
        multiplesOf.multipleOf(7,1,9920);
    }
    private void multipleOf(int number, int rangeMin, int rangeMax)
    {
        int quotientMax = rangeMax/number;
        int quotientMin = (rangeMin/number) + 1 ;
        printMultiples(number,quotientMax,quotientMin);
    }
    private void printMultiples(int number, int quotient_max, int quotient_min)
    {
        if (quotient_max < quotient_min)
            return;
        else
        {
            System.out.print(number * quotient_max + "\t");
            printMultiples(number, --quotient_max,quotient_min);
        }
    }
}
