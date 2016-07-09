import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SMudgal on 5/18/2016.
 */
public class chandu {
    public static void main(String args[])
    {
        try{
            Scanner scanner = new Scanner(new FileReader("input.txt"));
            int test_cases = scanner.nextInt();
            int size_of_array;
            int[] array;
            for (int i=0;i<test_cases;i++)
            {
                size_of_array = scanner.nextInt();
                array = new int[size_of_array];
                for (int j=0;j<size_of_array;j++)
                    array[j]=scanner.nextInt();
                quick_sorter(array,0,--size_of_array);
                displayArray(size_of_array,array);
            }
            scanner.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    private static void displayArray(int size, int [] arr){
        for (int i=0;i<=size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    private static void quick_sorter(int [] array,int start_index, int size_of_array)
    {
        if (start_index >= size_of_array)
            return;
        if (size_of_array-1 == start_index)
        {
            quick_sort(array,start_index,size_of_array);
            return;
        }
        if (start_index < size_of_array )
        {
            quick_sorter(array,start_index,size_of_array/2);
            quick_sorter(array,(size_of_array/2)+1,size_of_array);
        }
        quick_sort(array,start_index,size_of_array);
        return;
    }
    private static int[] quick_sort(int [] array,int start_index, int size_of_array)
    {
            int temp,i,j;

            int median = (start_index+size_of_array)/2;

            i = start_index; j =size_of_array;
            while (i < j && i < size_of_array && j>=0)
            {
                if (array[i] > array[median])
                {
                    i++;
                    continue;
                }
                if (array[j] < array[median])
                {
                    j--;
                    continue;
                }
                if (array[i] <= array[median] && array[j] >= array[median])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;j--;
                    continue;
                }
            }
        return array;
    }


}
