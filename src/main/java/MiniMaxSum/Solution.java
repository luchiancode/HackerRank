package MiniMaxSum;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        Integer min = arr.stream().min(Integer::compare).get();
        Integer max = arr.stream().max(Integer::compare).get();

        Long  sum1 = 0L;
        boolean flag = false;
        for(Integer int1 : arr){
            if(int1 != max || flag) sum1+= int1;
            else flag = true;
        }

        Long  sum2 = 0L;
        boolean flag2 = false;

        for(Integer int1 : arr){
            if(int1 != min || flag) sum2+= int1;
            else flag2 = true;
        }
        // Write your code here
        System.out.print(sum1 + " ");
        System.out.print(sum2 - min);


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}