/*                                                 JULY 6 , 2025

-> Task
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

-> Input Format
A single integer N.

-> Output Format
Print 10 lines of output; each line i (where 1 <= i <=10) contains the result of N x i in the form:
N x i = result.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1 ; i <=10 ; i++) {
            System.out.println(N + " x " +i+" = "+N*i);
        }

        bufferedReader.close();
    }
}
