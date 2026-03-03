
/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the 
 * non-zero elements.
Note that you must do this in-place without making a copy of the array.
 */

import java.util.*;
class Leetcode283{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] arr) {
        int n = arr.length, i=0, j=0;
        while(j<n){
            if(arr[j]!=0){
                arr[i]=arr[j]+arr[i]-(arr[j]=arr[i]);
                i++;
            }
            j++;
        }
    }
}