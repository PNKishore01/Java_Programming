/**
 * Frequency of given array Elements
 */

import java.util.*;
class Frequency{

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
        Map<Integer,Integer> hm = new HashMap<>();
        for(int a:arr){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> m:hm.entrySet()){
            System.out.println(m.getKey() + " -> " + m.getValue());
        }
    }

    static void modelOne(int[] arr, int n){
        int[] freq = new int[n];
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j])
                    sum++;
            }
            freq[i]=sum;
        }

        for(int i=0; i<n; i++){
            int c=0;
            for(int j=i; j>=0; j--){
                if(arr[i]==arr[j])
                    c++;
            }
            if(c==1)
                System.out.println(arr[i] + " -> " + freq[i]);
        }
    }
}