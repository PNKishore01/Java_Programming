/**
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the 
 * array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */

import java.util.*;
class Leetcode219{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target k value: ");
        int k = sc.nextInt();
        System.out.println(containsNearbyDuplicate(arr,k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(hm.containsKey(nums[i])){
                if(Math.abs(hm.get(nums[i])-i)<=k)
                    return true;
            }
            hm.put(nums[i],i);
        }
        return false;
    }
}