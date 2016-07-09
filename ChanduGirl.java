import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by SMudgal on 6/27/2016.
 */
public class ChanduGirl {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(new FileReader("input.txt"));
            int test_cases = scanner.nextInt();
            int size_of_array;
            int [] array = null;
            for (int i = 0 ; i < test_cases ; i++){
                size_of_array = scanner.nextInt();
                array = new int[size_of_array];
                for (int j=0;j<size_of_array;j++){
                    array[j] = scanner.nextInt();
                }
                sort(array,0,size_of_array-1);
                displayArray(size_of_array,array);
            }
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
    private static void displayArray(int size, int [] array){
        for (int i=0;i<size;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    private static void sort(int[] array, int low, int upper){
        if (low < upper){
            int mid = (low+upper)/2;
            sort(array,low,mid);
            sort(array,mid+1,upper);
        }
        if (low != upper)
            merge_sort(array,low,upper);
    }
    private static void merge_sort(int[] array, int low, int upper){
        int mid = (low+upper)/2;
        int mrun = mid+1,index = 0,l = low;
        int [] temp = array.clone();
        while (low <= mid && (mrun) <= upper){
            if (array[low] >= array[mrun]){
                temp[index++] = array[low++];
                continue;
            }
            if (array[mrun] > array[low]){
                temp[index++] = array[mrun++];
                continue;
            }
        }
        while (low <=mid){
            temp[index++] = array[low++];
        }
        while (mrun <= upper) {
            temp[index++] = array[mrun++];
        }
        index--;
        for (int i=upper;i>=l;i--){
            array[i] = temp[index--];
        }
    }
}
