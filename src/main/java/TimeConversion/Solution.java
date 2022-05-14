package TimeConversion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String substring = s.substring(Math.max(s.length() - 2, 0));
        if(substring.equals( "AM")){
            String myString = s.substring(0, s.length() - 2);

            if(Integer.parseInt(myString.substring(0,2)) == 12){
                Integer number = Integer.parseInt(myString.substring(0,2)) - 12;
                return number + "0" + myString.substring(2,myString.length());

            }
            else return s.substring(0, s.length() - 2);

        }
        else {
            String myString = s.substring(0, s.length() - 2);
            if(Integer.parseInt(myString.substring(0,2)) != 12){
                Integer number = Integer.parseInt(myString.substring(0,2)) + 12;
                return number + myString.substring(2,myString.length());
                //myString.setCharAt(1,String.valueOf(number%10));

            }
            else return s.substring(0, s.length() - 2);
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}