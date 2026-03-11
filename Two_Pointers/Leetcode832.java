/**
 * 
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting 
 * image.
To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0,1,1] results in [1,0,0]. 

Example 1:
Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

Example 2:
Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 */

import java.util.*;
class Leetcode832{

    public static void main(String[]args){
        int[][] arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int n = arr.length;
        for(int i=0; i<n; i++){
            arr[i] = reverse(arr[i]);
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = (arr[i][j]==0)?1:0;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    static int[] reverse(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            arr[i]=arr[j]+arr[i]-(arr[j]=arr[i]);
            i++;
            j--;
        }
        return arr;
    }
}