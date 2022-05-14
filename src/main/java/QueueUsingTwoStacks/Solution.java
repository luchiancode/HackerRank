package QueueUsingTwoStacks;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<Integer>();

        while(q > 0){
            int operation = scanner.nextInt();

            if(operation == 1){
                stack.add(scanner.nextInt());
                --q;
            }
            else if (operation == 2){
                stack.remove(0);
                --q;
            }
            else if(operation == 3){
                System.out.println(stack.firstElement());
                --q;
            }


        }

    }
}