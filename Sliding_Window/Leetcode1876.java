/**
 * 
 * A string is good if there are no repeated characters.
Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.

Example 1:
Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".

Example 2:
Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".
 */

import java.util.*;
class Leetcode1876{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();
        System.out.println("Distinct subarrays is: " + countGoodSubstrings(s));
    }
    public static int countGoodSubstrings(String s) {
        int n=s.length(), count=0;
        String k="";

        for(int i=0; i<n; i++){
            k+=s.charAt(i);

            if(k.length()==3){ 
                if(isDistinct(k))
                    count++;
                k = k.replaceFirst(k.charAt(0)+"","");
            }
        }
        return count;
    }
    
    public static boolean isDistinct(String s){
        for(int i=0; i<3; i++){
            if(s.indexOf(s.charAt(i)+"") != s.lastIndexOf(s.charAt(i)+""))
                return false;
        }
        return true;
    }
}