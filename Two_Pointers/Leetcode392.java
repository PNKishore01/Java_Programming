/**
 * 
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some 
(can be none) of the characters without disturbing the relative positions of the remaining characters. 
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
 */


import java.util.*;
class Leetcode392{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1: ");
        String s = sc.nextLine();
        System.out.println("Enter String2: ");
        String t = sc.nextLine();

        System.out.println((isSubsequence(s,t)?true:false));
    }

    public static boolean isSubsequence(String s, String t) {
        String k = "";
        int m=s.length(), n=t.length(), i=0, j=0;

        while(i<m && j<n){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);
            if(ch1==ch2){
                k+=ch1;
                i++;j++;
            }
            else
                j++;
        }
        return s.equals(k);
    }
}