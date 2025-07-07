/*

You are given  queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of  space-separated integers.

-> Input Format

The first line contains an integer, q , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective a, b, and n values for that query.

-> Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

*/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int extra = 0;
            for (int j = 0 ; j < n ; j++) {
                extra += (int)(Math.pow(2, j)*b);
                System.out.print((a+extra) + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
