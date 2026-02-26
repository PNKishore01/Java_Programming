/**Intersection of two Arrays-2
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
        System.out.println("Enter n1 value: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter n2 value: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i]=sc.nextInt();
        }

        int[] arr = intersect(arr1, arr2);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i:nums1){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        List<Integer> l = new ArrayList<>();
        for(int i:nums2){
            if(hm.containsKey(i) && hm.get(i)>=1){
                l.add(i);
                hm.put(i,hm.getOrDefault(i,0)-1);
            }
        }
        int[] arr = new int[l.size()];
        int a=0;
        for(Integer i:l){
            arr[a++]=i;
        }
        return arr;
    }
}