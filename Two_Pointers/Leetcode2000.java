/**
 * 
 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and 
 * ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, 
 * do nothing.
For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends 
at 3 (inclusive). The resulting string will be "dcbaefd". Return the resulting string.

Example 1:
Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3. 
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".

Example 2:
Input: word = "xyxzxe", ch = "z"
Output: "zxyxxe"
Explanation: The first and only occurrence of "z" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".

Example 3:
Input: word = "abcd", ch = "z"
Output: "abcd"
Explanation: "z" does not exist in word.
You should not do any reverse operation, the resulting string is "abcd".
 */

import java.util.*;
class Leetcode2000{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s value: ");
        String s = sc.next();
        System.out.println("Enter character: ");
        char k = sc.next().charAt(0);
        System.out.println("After: " + reversePrefix(s,k));
    }
    public static String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch+"");
        if(idx==-1) return word;

        String k = word.substring(0,idx+1);
        String l = word.substring(idx+1);
        k = toReverse(k);
        return k+l;
    }
    static String toReverse(String s){
        char[] arr = s.toCharArray();
        int i=0, j=arr.length-1;
        while(i<j){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return String.copyValueOf(arr);
    }
}