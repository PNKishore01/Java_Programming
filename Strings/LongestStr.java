/**
 * Given an array arr[] containing strings of names. Your task is to return the longest string. 
 * If there are multiple names of the longest size, return the first occurring name.

Examples :
Input: arr[] = ["Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"]
Output: "GeeksforGeeks"
Explanation: name "GeeksforGeeks" has maximum length among all names. 

Input: arr[] = ["Apple", "Mango", "Orange", "Banana"]
Output: "Orange"
Explanation: names "Orange" and "Banana" both have maximum length among all names but Orange comes first
 so answer will be "Orange". 
 */

import java.util.*;

class LongestStr{

    public static void main(String[] args){
        String[] arr = {"Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"}; //String array
        longestStr(arr);
    }
    static void longestStr(String[] arr){
        int idx = 0; //index of longest in array;
        int maxL = arr[0].length(); //maximum length traversal
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(arr[i].length()>maxL){
                maxL=arr[i].length();
                idx=i;
            }
        }
        System.out.println("Longest String in given array is: " + arr[idx]);
    }
}