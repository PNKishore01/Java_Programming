/**
 * 
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the 
 * result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 */

import java.util.*;
class Leetcode350{

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
        int[] ar = intersect(arr,arr2);
        System.out.println(Arrays.toString(ar));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
       Map<Integer,Integer> hm = new HashMap<>();
       for(int i:nums1){
        hm.put(i,hm.getOrDefault(i,0)+1);
       }

       List<Integer> l = new ArrayList<>();
       for(int i:nums2){
        if(hm.containsKey(i) && hm.get(i)>0){
            l.add(i);
            hm.put(i,hm.get(i)-1);
        }
       }

       int[] arr = new int[l.size()];
       int j=0;
       for(Integer i:l){
        arr[j++]=i;
       }
       return arr;
    }
}