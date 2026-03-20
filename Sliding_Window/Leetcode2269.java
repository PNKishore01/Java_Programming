/**
 * The k-beauty of an integer num is defined as the number of substrings of num when it is read as a string 
 * that meet the following conditions:
It has a length of k.
It is a divisor of num.
Given integers num and k, return the k-beauty of num.
Note:
Leading zeros are allowed.
0 is not a divisor of any value.
A substring is a contiguous sequence of characters in a string.

Example 1:
Input: num = 240, k = 2
Output: 2
Explanation: The following are the substrings of num of length k:
- "24" from "240": 24 is a divisor of 240.
- "40" from "240": 40 is a divisor of 240.
Therefore, the k-beauty is 2.

Example 2:
Input: num = 430043, k = 2
Output: 2
Explanation: The following are the substrings of num of length k:
- "43" from "430043": 43 is a divisor of 430043.
- "30" from "430043": 30 is not a divisor of 430043.
- "00" from "430043": 0 is not a divisor of 430043.
- "04" from "430043": 4 is not a divisor of 430043.
- "43" from "430043": 43 is a divisor of 430043.
Therefore, the k-beauty is 2.
 */

import java.util.*;
class Leetcode2269{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        System.out.println("Enter k value: ");
        int k = sc.nextInt();
        System.out.println("Find the k-beauty of a num is: " + divisorSubstrings(n,k));
    }
    public static int divisorSubstrings(int num, int k){
        String s = String.valueOf(num);
        int n = s.length(), c=0;
        String t = "";
        for(int i=0; i<k; i++){
            t+=s.charAt(i);
        }

        if(Integer.parseInt(t)>0 && num%Integer.parseInt(t)==0) c++;

        for(int i=k; i<n; i++){
            t=t.replaceFirst(t.charAt(0)+"","");
            t+=s.charAt(i);
            if(Integer.parseInt(t)>0 && num%Integer.parseInt(t)==0) c++;
        }
        return c;
    }
}