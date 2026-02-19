/**
 * Given a string s consisting of only '0's and '1's,  find the last index of the '1' present.
Note: If '1' is not present, return "-1"

Examples:
Input: s = 00001
Output: 4
Explanation: Last index of  1 in given string is 4.
Input: s = 0
Output: -1
Explanation: Since, 1 is not present, so output is -1.
 */
import java.util.*;
class Last1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Last Occurance of 1 is: " + last(s));
        sc.close();
    }
    static int last(String s){
        int n=s.length();
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i)=='1')
                return i;
        }
        return -1;
    }
}