
/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each 
 * unique element appears only once. The relative order of the elements should be kept the same.

Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of u
nique elements k.

The first k elements of nums should contain the unique numbers in sorted order. The remaining elements 
beyond index k - 1 can be ignored.

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 
respectively. It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 
respectively. It does not matter what you leave beyond the returned k (hence they are underscores).
 */

import java.util.*;
class Leetcode26{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int a = removeDuplicates(arr);
        for(int i=0; i<a; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        int j=1, n=nums.length;

        for(int i=1; i<n; i++){
            if(nums[i-1]!=nums[i]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}