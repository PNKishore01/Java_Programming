/**
 * Given array is palindrome or not
 */

import java.util.*;
class Palindrome{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row values count: ");
        int n = sc.nextInt();//should be greater than 1
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Given Array is: " + check(arr));
        sc.close();
    }
    static String check(int[] arr){
        int n=arr.length, i=0, j=n-1;
        while(i<j){
            if(arr[i]!=arr[j])
                return "not Palindrome";
            i++;
            j--;
        }
        return "Palindrome";
    }
}