package Easy;

import java.io.InputStreamReader;
import java.util.Scanner;

public class GreaterElement {
    public static void main(String [] args){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int test_cases = scanner.nextInt();
        int [] arr;
        int size;
        for (int i=0;i<test_cases;i++){
            size = scanner.nextInt();
            arr = new int [size];
            for(int j=0;j<size;j++)
                arr[j] = scanner.nextInt();
            for (int j=0;j<size;j++){
                if (j==size-1)
                {
                    System.out.println("-1");
                    break;
                }
                for (int k=j;k<size;k++){
                    if (arr[j] < arr[k]){
                        System.out.print(arr[k]+ " ");
                        break;
                    }
                    if (k+1 == size){
                        System.out.print("-1 ");
                        break;
                    }
                }
            }
        }


    }
}
