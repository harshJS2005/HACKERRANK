/*                                                    JULY 6 , 2025

-> Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

-> Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
      
                System.out.printf("%-15s%03d\n",s1,x);
            }
            System.out.println("================================");

    }
}

/*  Sample Input                                                    Sample Output
      java 100                                           =====================================
       cpp 65                                                    java           100
      python 50                                                  cpp            65
                                                                 python         50
                                                         ======================================
*/
