/**
 * Count and print the duplicates in the given array
 */

import java.util.*;
class CountDuplicates{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row values count: ");
        int n = sc.nextInt();//should be greater than 1
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        //Approach-1
        System.out.println("Approach - 1");
        modelOne(arr,n);
        System.out.println();
        //Approach-2
        System.out.println("Approach - 2");
        modelTwo(arr,n);

        sc.close();
    }

    static void modelTwo(int[] arr, int n){
        //we have to use HashMap
        int duplicateCount = 0;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int a:arr){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> m:hm.entrySet()){
            if(m.getValue()>1){
                duplicateCount++;
                System.out.println(m.getKey() + " -> " + m.getValue());
            }
        }
        System.out.println("Duplicates Count: " + duplicateCount);
    }

    static void modelOne(int[] ar, int n){
        //after count the value, then the value should be changed to -1
        int[] arr = ar.clone(); //copy original array to another, so changes will not affect to original array.
        int duplicateCount = 0;
        for(int i=0; i<n; i++){
            int sum = 0, val=arr[i];
            if(val==-1) continue; //if value -1 then skip inner for loop, need not to count.
            for(int j=0; j<n; j++){
                if(val==arr[j]){
                    sum++;
                    arr[j]=-1; //after count set to -1;
                }
            }
            if(sum>1){
                duplicateCount++;
                System.out.println(val + " -> " + sum);
            }
        }
        System.out.println("Duplicates Count: " + duplicateCount);
    }
}