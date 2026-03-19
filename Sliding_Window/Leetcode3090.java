/**
 * Given a string s, return the maximum length of a substring such that it contains at most two occurrences of 
 * each character.
 
Example 1:
Input: s = "bcbbbcba"
Output: 4
Explanation:
The following substring has a length of 4 and contains at most two occurrences of each character: "bcbbbcba".

Example 2:
Input: s = "aaaa"
Output: 2
Explanation:
The following substring has a length of 2 and contains at most two occurrences of each character: "aaaa"
 */

import java.util.*;
class Leetcode3090{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();
        System.out.println("Maximum length substring witho two occurances is: " + maximumLengthSubstring(s));
    }

    public static int maximumLengthSubstring(String s) {
        int[] arr = new int[26];
        int n = s.length(), max=0;
        String t="";

        for(int i=0; i<n; i++){
            if(arr[s.charAt(i)-97]<2){
                arr[s.charAt(i)-97]++;
                t+=s.charAt(i);
            }
            else{
                arr[t.charAt(0)-97]--;
                t = t.replaceFirst(t.charAt(0)+"","");
                i--;
            }
            max=Math.max(max,t.length());
        }
        return max;
    }
}
