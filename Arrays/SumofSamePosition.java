/**
 * Sum of two elements in same position in the given two arrays.
 * otherwise print normal
 */

import java.util.*;
class SumofSamePosition{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row1 values count: ");
        int n1 = sc.nextInt();//should be greater than 1
        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter row2 values count: ");
        int n2 = sc.nextInt();//should be greater than 1
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i]=sc.nextInt();
        }

        int n = (n1>n2)?n1:n2;
        int[] arr = new int[n];
        int i=0, j=0,k=0;
        while(i<n1 && j<n2){
            arr[k++] = arr1[i++]+arr2[j++];
        }
        while(i<n1){
            arr[k++]=arr1[i++];
        }
        while(j<n2){
            arr[k++]=arr2[j++];
        }
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}