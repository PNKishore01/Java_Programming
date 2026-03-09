/**
 * 
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the 
 * result must be unique and you may return the result in any order.
 * 
 * Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */

import java.util.*;
class Leetcode349{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row1 count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter row2 count value: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i]=sc.nextInt();
        }
        int[] ar = intersection(arr,arr2);
        System.out.println(Arrays.toString(ar));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for(int i:nums1){
            s.add(i);
        }
        Set<Integer> s1 = new HashSet<>();
        for(int i:nums2){
            if(s.contains(i)){
                s1.add(i);
            }
        }
        int j=0;
        int[] arr = new int[s1.size()];
        for(Integer i:s1){
            arr[j++]=i;
        }
        return arr;
    }

}