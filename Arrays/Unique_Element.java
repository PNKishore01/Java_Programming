/**
 * Given an array of elements occurring in multiples times, except one element which doesn't occur in 
 * multiple times. Return the unique element.

Examples:
Input: arr[] = [6, 2, 5, 2, 2, 6, 6]
Output: 5
Explanation: Every element appears 3 times except 5.

Input:  arr[] = [2, 2, 2, 10, 2]
Output: 10
Explanation: Every element appears 4 times except 10.
 */

import java.util.*;
class Unique_Element{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row values count: ");
        int n = sc.nextInt();//should be greater than 1 and even
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Unique element in the given array: "+findUnique(arr));
    }
    static int findUnique(int[] arr){
        Map<Integer,Integer> hm = new HashMap<>();
        for(int a:arr){
            hm.put(a, hm.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> m:hm.entrySet()){
            if(m.getValue()==1)
                return m.getKey();
        }
        return -1;
    }
}