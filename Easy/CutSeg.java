package Easy;


import java.io.InputStreamReader;
import java.util.Scanner;

public class CutSeg {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int test_cases = scanner.nextInt();
        for (int i=0;i<test_cases;i++){
            cut(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        }
    }
    private static void cut(int no,int p1, int p2, int p3){
        int [] seg = sort(p1,p2,p3);

    }
    private static int segments(int no, int[] seg, int index){
        if (no == 0)
            return 1;
        if (no < 0){
            no = no + seg[index];
        }
        segments(no-seg[index],seg,index);
        return 1;
    }
    private static int[] sort (int p1, int p2, int p3){
        int arr[] = new int[3];
        if (p1 <= p2 && p1 <= p3){
            arr[0] = p1;
            if (p2 <= p3) {
                arr[1] = p2;
                arr[2] = p3;
            }
            else {
                arr[1] = p3;
                arr[2] = p2;
            }
        }
        else if (p2 <= p1 && p2 <= p3){
            arr[0] = p2;
            if (p1 <= p3) {
                arr[1] = p1;
                arr[2] = p3;
            }
            else {
                arr[1] = p3;
                arr[2] = p1;
            }
        }
        else{
            arr[0] = p3;
            if (p1 <= p2){
                arr[1] = p1;
                arr[0] = p2;
             }
            else{
                arr[0] = p2;
                arr[1] = p1;
            }
        }
    return arr;
    }

}
