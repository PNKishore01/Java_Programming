/**
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return 
 * the answer in any order.

Example 1:
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

Example 2:
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 */

import java.util.*;
class Leetcode438{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1: ");
        String s = sc.next();
        System.out.println("Enter String2: ");
        String p = sc.next();
        List<Integer> li = findAnagrams(s,p);
        System.out.println(li);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> li = new ArrayList<>();
        int m=s.length(), n=p.length();
        if(m<n){
            return li;
        }
        String k = "";
        for(int i=0; i<n; i++){
            k += s.charAt(i);
        }
        p=isSort(p);
        if(isSort(k).equals(p))
            li.add(0);
        
        int i=0, j=n;
        while(j<m){
            k = k.replaceFirst(s.charAt(i)+"","");
            k += s.charAt(j);
            i++;
            j++;
            if(isSort(k).equals(p))
                li.add(i);
        }
        return li;
    }
    static String isSort(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}