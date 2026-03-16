/**
 * Container with most water
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two 
 * endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1
 */

import java.util.*;
class Leetcode11{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum Water is: " + maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int n=height.length, i=0, j=n-1, s=0, val=0, max=Integer.MIN_VALUE;

        while(i<j){
            s=j-i;

            if(height[j]>=height[i]){
                val=height[i];
                i++;
            }
            else{
                val=height[j];
                j--;
            }

            s*=val;
            max=Math.max(max,s);
        }
        return max;
    }
}