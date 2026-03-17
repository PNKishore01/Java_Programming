/**
 * 
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] 
 * inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and using only constant extra space.

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3

Example 3:
Input: nums = [3,3,3,3,3]
Output: 3
 */
import java.util.*;
class Leetcode287{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Duplicate element is: " + findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        return -1;
    }
}