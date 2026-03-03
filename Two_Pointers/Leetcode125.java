/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing 
 * all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include 
 * letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
 */

import java.util.*;
class Leetcode125{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        System.out.print("Given String is ");
        System.out.println(isPalindrome(s)?"Palindrome":"not Palindrome");
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String k = "";
        for(char ch:s.toCharArray()){
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
                k+=ch;
        }
        int i=0, j=k.length()-1;
        while(i<j){
            if(k.charAt(i)!=k.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}