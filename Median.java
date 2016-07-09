/*

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import static java.lang.Math.abs;

*/
/**
 * Created by SMudgal on 6/5/2016.
 *//*

public class Median {
    public static void main(String args[]) {
        try {
            Scanner scanner = new Scanner(new FileReader("input.txt"));
            int test_cases = scanner.nextInt();
            int numbers,median,total_cost = 0;
            ArrayList<Integer> arrayList;
            for (int i=0;i<test_cases;i++)
            {
                numbers = scanner.nextInt();
                arrayList = new ArrayList<Integer>();
                for (int j=0;j<numbers;j++)
                {
                    arrayList.add(scanner.nextInt());
                }
                Collections.sort(arrayList);
                int size = arrayList.size();
                if (size % 2 == 0)
                {
                    size = size/2;
                     median = (arrayList.get(size) + arrayList.get(size-1))/2;
                }
                else
                {
                    size = size /2;
                     median = arrayList.get(size);
                }
                for (i=0;i<numbers;i++)
                {

                    total_cost += abs(arrayList.get(i)-median);
                }
                System.out.println(total_cost);
            }
        }catch (IOException e)
        {
            System.out.println(e.toString());
        }
    }
    void merge(int arr[], int left_index, int middle_index, int right_index)
    {
        int i, j, k, first_list = middle_index - left_index + 1, second_list =  right_index - middle_index, left_list[first_list], right_list[second_list];

        for (i = 0; i < first_list; i++)
            left_list[i] = arr[left_index + i];
        for (j = 0; j < second_list; j++)
            right_list[j] = arr[middle_index + 1+ j];
        i = j = 0;
        k = left_index;
        while (i < first_list && j < second_list) {
            if (left_list[i] <= right_list[j]) {
                arr[k] = left_list[i];
                i++;
            }else {
                arr[k] = right_list[j];
                j++;
            }
            k++;
        }
        while (i < first_list) {
            arr[k] = left_list[i];
            i++;
            k++;
        }
        while (j < second_list) {
            arr[k] = right_list[j];
            j++;
            k++;
        }
    }

    void mergeSort(int arr[], int left_index, int right_index)
    {
        if (left_index < right_index) {
            int middle_index = (right_index-left_index)/2;
            mergeSort(arr, left_index, middle_index);
            mergeSort(arr, middle_index+1, right_index);

            merge(arr, left_index, middle_index, right_index);
        }
    }
}
*/
