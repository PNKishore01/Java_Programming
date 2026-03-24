/**
 * Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k 
 * and average greater than or equal to threshold.

Example 1:
Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).

Example 2:
Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
Output: 6
Explanation: The first 6 sub-arrays of size 3 have averages greater than 5. Note that averages are not integers.
 */

import java.util.*;
class Leetcode1343{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k value: ");
        int k = sc.nextInt();
        System.out.println("Enter Threshold value: ");
        int threshold = sc.nextInt();
        System.out.println(numOfSubarrays(arr,k,threshold));
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0,n=arr.length, s=k*threshold, sum=0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        if(sum>=s)
            c++;
        
        int i=0, j=k;
        while(j<n){
            sum -= arr[i++];
            sum += arr[j++];
            if(sum>=s)
                c++;
        }
        return c;
    }
}