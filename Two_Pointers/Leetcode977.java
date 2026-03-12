/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each 
 * number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */

import java.util.*;
class Leetcode977{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before: " + Arrays.toString(arr));
        int[] ar = sortedSquares(arr);
        System.out.println("After: " + Arrays.toString(ar));
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}