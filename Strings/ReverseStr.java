/**
 * You are given a string s, and your task is to reverse the string.

Examples:
Input: s = "Geeks"
Output: "skeeG"
Input: s = "for"
Output: "rof"
Input: s = "a"
Output: "a"
 */

import java.util.*;
class ReverseStr{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev = ""; //empty String
        int n = s.length();
        for(int i=n-1; i>=0; i--){
            rev += s.charAt(i);//character wise retriving
        }
        System.out.println("Before: " + s);
        System.out.println("After: " + rev);
        sc.close();
    }
}