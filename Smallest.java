import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by SMudgal on 6/28/2016.
 * program to find the smallest number in a set without disturbing the sequence of the set
 */
public class Smallest {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(new FileReader("input.txt"));
            int test_cases = scanner.nextInt();
            int n;
            String s,smallest;
            for (int i=0;i<test_cases;i++){
                smallest="";
                n = scanner.nextInt();
                s = scanner.next();
                System.out.println(build_smallest(0,s.length(),n,s,smallest));
            }
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
    private static String build_smallest(int from, int to, int n , String s , String smallest){

        if (s.length() == n){
            return smallest;
        }
        if (n == 0 ){
            return smallest.concat(s);
        }
        if (n > 0) {
            int index = -1;
            index = find_smallest(from,to, s);
            while ((n - index) < 0){
                index = find_smallest(from, index,s);
            }
            n = n - index;
            smallest = smallest.concat(Character.toString(s.charAt(index)));
            s = s.substring(index+1);
            to = s.length();
            smallest = build_smallest(0,to,n,s,smallest);
        }
        return smallest;
    }
    private static int find_smallest(int from,int to, String s){
        int smallest=999999999,index = -1,p;
        for (int i=from;i<to;i++){
            p = Character.getNumericValue(s.charAt(i));
            if (smallest > p){
                smallest = p;
                index = i;
            }
        }
        return index;
    }
}
/*
    private static void build_smallest(int n, String s){
        Map<Integer,Integer> smallest = new HashMap<Integer, Integer>();
        for (int i=0;i<s.length();i++){
            smallest.put(i,Character.getNumericValue(s.charAt(i)));
        }
        Map<Integer,Integer> small = sortByComparator(smallest);
        //finding smallest value
        System.out.println(small.toString());
        int length = small.size() - 1;
        double s2 = 0,count=0;
        int index = -1,flag = 0;
        for (Map.Entry<Integer,Integer> map : small.entrySet()){
            if (length - count >  n){
                if ((flag ==0 && index < map.getKey()) || (flag == 1 && index < map.getKey())) {
                    if (flag == 0) {
                        s2 = (s2 * (Math.pow(10, count))) + map.getValue();
                        count++;
                        index = map.getKey();
                    }
                    if (flag == 1) {
                        s2 = (map.getValue() * Math.pow(10, count)) + s2;
                        count++;
                        index = map.getKey();
                    }
                    if (map.getKey() == length) {
                        flag = 1;
                    }
                }
            }
        }

    }
    private static Map<Integer,Integer> sortByComparator(Map<Integer,Integer> small){
        List<Map.Entry<Integer,Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(small.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        Map<Integer,Integer> smallest = new LinkedHashMap<Integer, Integer>();
        for (Iterator<Map.Entry<Integer,Integer>> it = list.iterator(); it.hasNext();){
            Map.Entry<Integer,Integer> entry = it.next();
            smallest.put(entry.getKey(),entry.getValue());
        }
        return smallest;
    }
*/
