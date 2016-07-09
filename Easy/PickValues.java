package Easy;

import java.io.InputStreamReader;
import java.util.Scanner;

public class PickValues {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int test_cases = scanner.nextInt();
        int size;
        int [] arr;
        for (int i=0;i<test_cases;i++){
            size = scanner.nextInt();
            arr = new int[size];
            for (int j=0;j<size;j++){
                arr[j] = scanner.nextInt();
            }
            pickValues(arr,size);
        }
    }
    private static void pickValues(int [] arr, int size){
        if (size <= 4){
            int min = arr[0];
            for (int i=0;i<size;i++){
                if (arr[i] < min)
                    min = arr[i];
            }
            System.out.println(min);
            return;
        }
        int sum[] = new int[size];
        sum[0] = arr[0];
        sum[1] = arr[1];
        sum[2] = arr[2];
        sum[3] = arr[3];
        for (int i=4;i<size;i++){
            sum[i] = arr[i] + min (
                    min(sum[i-4],sum[i-3]),
                    min(sum[i-2],sum[i-1])
            );
        }
        System.out.println(min(min(sum[size-1],sum[size-2]),min(sum[size-3],sum[size-4])));
    }
    private static int min(int a, int b){
        if (a < b)
            return a;
        else
            return b;
    }
}
