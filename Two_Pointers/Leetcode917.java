/**
 * Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

Example 1:
Input: s = "ab-cd"
Output: "dc-ba"

Example 2:
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"

Example 3:
Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 */

import java.util.*;
class Leetcode917{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        System.out.println("Before: " + s);
        String k = reverseOnlyLetters(s);
        System.out.println("After: " + k);
    }

    public static String reverseOnlyLetters(String s) {
        int n=s.length(), i=0, j=n-1;
        char[] arr = s.toCharArray();

        while(i<j){
            char ch1= arr[i];
            char ch2= arr[j];

            while(i<j && !Character.isLetter(ch1)){
                i++;
                if(i<j)
                    ch1=arr[i];
            }

            while(i<j && !Character.isLetter(ch2)){
                j--;
                if(i<j)
                    ch2=arr[j];
            }
            char ch = arr[i];
            arr[i]=arr[j];
            arr[j]=ch;
            i++;j--;
        }

        return String.copyValueOf(arr);
    }
}