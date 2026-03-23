/**
 * 
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, 
 * and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 */

import java.util.*;
class Leetcode15{

    public static void main(String[]args){
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> li = threeSum(nums);
        System.out.println(li);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            sum3Elements(li, nums, -nums[i], i+1, n-1);
        }
        return li;
    }

    static void sum3Elements(List<List<Integer>> li, int[] arr, int val, int st, int en){

        while(st<en){

            if(val==arr[st]+arr[en]){
                List<Integer> al = new ArrayList<>();
                al.add(-val);
                al.add(arr[st]);
                al.add(arr[en]);
                li.add(al);

                while(st<en && arr[st]==arr[st+1]) st++;
                st++;
            }
            else if(val<arr[st]+arr[en])
                en--;
            else
                st++;
        }
    }
}