/**
 * Given a string s and an array of strings words, determine whether s is a prefix string of words.

A string s is a prefix string of words if s can be made by concatenating the first k strings in words for some
 positive k no larger than words.length.
Return true if s is a prefix string of words, or false otherwise.

Example 1:
Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
Output: true
Explanation:
s can be made by concatenating "i", "love", and "leetcode" together.

Example 2:
Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
Output: false
Explanation:
It is impossible to make s using a prefix of arr.
 */

import java.util.*;
class Leetcode1961{

    public static void main(String[]args){
        String s = "iloveleetcode";
        String[] words = {"apples","i","love","leetcode"};
        System.out.println(isPrefixString(s,words));
    }
    public static boolean isPrefixString(String s, String[] words) {
        String t = "";
        for(String str:words){
            t+=str;
            if(s.equals(t))
                return true;
        }
        return false;
    }
}