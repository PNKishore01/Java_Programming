/**
 * Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:
Input: s = "leetcode"
Output: "leotcede"
 */

import java.util.*;
class Leetcode345{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        System.out.println("Before Swapping vowels: " + s);
        System.out.println("After Swapping vowels: " + reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i=0, j=arr.length-1;
        String a = "aeiouAEIOU";
        while(i<j){
            if(a.contains(arr[i]+"") && a.contains(arr[j]+"")){
                char ch = arr[i];
                arr[i] = arr[j];
                arr[j] = ch;
                i++;
                j--;
            }
            else if(!a.contains(arr[i]+""))
                i++;
            else if(!a.contains(arr[j]+""))
                j--;
        }
        return String.valueOf(arr);
    }
}