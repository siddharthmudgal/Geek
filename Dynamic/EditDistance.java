package Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.min;


public class EditDistance {
  public static void main(String[] args){
      try {
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
          int test_cases = Integer.parseInt(bufferedReader.readLine());
          String s1, s2;
          for (int i=0;i<test_cases;i++){
              s1 = bufferedReader.readLine();
              s2 = bufferedReader.readLine();
              editDist(s1,s2);
          }
      }catch (IOException e){
          System.out.println(e);
      }
  }
    private static void editDist(String s1, String s2){
        int size1 = s1.length(),
                size2 = s2.length();

        int [] [] mat = new int [size1] [size2];
        for (int i=0;i<size1;i++){
            for (int j=0;j<size2;j++){
                if (i == 0)
                    mat[i][j] = j;
                else if (j == 0)
                    mat[i][j] = i;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    mat[i][j] = mat [i-1][j-1];
                else{
                    mat[i][j] = 1 + min(min(mat[i-1][j],mat[i][j-1]),mat[i-1][j-1]);
                }
            }
        }
                System.out.println(mat[size1-1][size2-1]);
    }
}
