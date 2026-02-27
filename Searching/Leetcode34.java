/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of 
 * a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity. 

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
 */

import java.util.*;
class Leetcode34{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target value: ");
        int t = sc.nextInt();
        int[] fl = searchFirstLast(arr,t);
        System.out.println("First and last Occurance of given target: " + Arrays.toString(fl));
    }

    static int[] searchFirstLast(int[] arr, int target){
        int[] ar = {-1,-1};
        int i=0, j=arr.length-1;

        if(arr.length==1 && arr[0]!=target)
            return ar;

        while(i<=j){
            if(arr[i]!=target)
                i++;
            if(arr[j]!=target)
                j--;
            
            if(arr[i]==target && arr[j]==target){
                ar[0]=i;
                ar[1]=j;
                break;
            }
        }
        return ar;
    }
}