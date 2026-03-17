/**
 * Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.
Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */

import java.util.*;
class Leetcode344{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char[] arr = {"h","e","l","l","o"};
        System.out.println("Before: " + Arrays.toString(arr));
        reverseString(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }

    public static void reverseString(char[] s) {
        int n=s.length, i=0, j=n-1;

        while(i<=j){
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;
            j--;
        }

    }
}