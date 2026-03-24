/**
 * 
 * You are given a string s and an integer k. You can choose any character of the string and change it to any 
 * other uppercase English character. You can perform this operation at most k times.
Return the length of the longest substring containing the same letter you can get after performing the above 
operations.

Example 1:
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

Example 2:
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
 */

import java.util.*;
class Leetcode424{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1: ");
        String s = sc.next();
        System.out.println("Enter k value: ");
        int k = sc.nextInt();
        System.out.println(characterReplacement(s,k));
    }

    public static int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int maxLen = Integer.MIN_VALUE, maxFreq = Integer.MIN_VALUE, l=0, n=s.length();
        for(int r=0; r<n; r++){
            arr[s.charAt(r)-'A']++;

            maxFreq=Math.max(maxFreq,arr[s.charAt(r)-'A']);
            if((r-l+1)-maxFreq>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, (r-l+1));
        }
        return maxLen;
    }
}