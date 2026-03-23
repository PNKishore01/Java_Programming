/**
 * Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.

The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] 
where |arr1[i]-arr2[j]| <= d.

Example 1:
Input: arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
Output: 2
Explanation: 
For arr1[0]=4 we have: 
|4-10|=6 > d=2 
|4-9|=5 > d=2 
|4-1|=3 > d=2 
|4-8|=4 > d=2 
For arr1[1]=5 we have: 
|5-10|=5 > d=2 
|5-9|=4 > d=2 
|5-1|=4 > d=2 
|5-8|=3 > d=2
For arr1[2]=8 we have:
|8-10|=2 <= d=2
|8-9|=1 <= d=2
|8-1|=7 > d=2
|8-8|=0 <= d=2

Example 2:
Input: arr1 = [1,4,2,3], arr2 = [-4,-3,6,10,20,30], d = 3
Output: 2

Example 3:
Input: arr1 = [2,1,100,3], arr2 = [-5,-2,10,-3,7], d = 6
Output: 1
 */

import java.util.*;
class Leetcode1385{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row1 count value: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter row2 count value: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("Enter d value: ");
        int d = sc.nextInt();
        System.out.println(findTheDistanceValue(arr1,arr2,d));
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int a:arr1){
            if(isValid(a,arr2,d))
                c+=1;
        }
        return c;
    }
    static boolean isValid(int val, int[] arr, int d){
        for(int a:arr){
            if(Math.abs(val-a)<=d)
                return false;
        }
        return true;
    }
}