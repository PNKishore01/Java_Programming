/**
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.

Example 1:
Input: s = "aba"
Output: true

Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

Example 3:
Input: s = "abc"
Output: false
 */

class Leetcode680{

    public static void main(String[] args){
        String s = "aba";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        int n=s.length(), st=0, en=n-1;

        while(st<en){
            if(s.charAt(st)!=s.charAt(en))
                return isPalin(s,st+1,en) || isPalin(s,st,en-1);
            st++;
            en--;
        }
        return true;
    }
    static boolean isPalin(String s, int st, int en){
        while(st<en){
            if(s.charAt(st)!=s.charAt(en))
                return false;
            st++;
            en--;
        }
        return true;
    }
}