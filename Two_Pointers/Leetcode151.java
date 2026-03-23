/**
 * Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string 
should only have a single space separating the words. Do not include any extra spaces.

Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */

import java.util.*;
class Leetcode151{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String sentence: ");
        String s = sc.nextLine();
        System.out.println("Before: " + s);
        System.out.println("After: " + reverseWords(s));
    }
    public static String reverseWords(String s) {
        String m = "";
        boolean isTrue = false;
        for(char ch:s.toCharArray()){
            if(ch!=' '){
                isTrue=true;
                m+=ch;
            }
            else if(ch==' ' && isTrue){
                isTrue=false;
                m+=' ';
            }
        }
        return isReverse(m);
    }
    static String isReverse(String s){
        String[] arr = s.split(" ");
        int j=arr.length-1;
        String k="";
        while(j>=0){
            k += arr[j]+" ";
            j--;
        }
        k=k.trim();
        return k;
    }
}