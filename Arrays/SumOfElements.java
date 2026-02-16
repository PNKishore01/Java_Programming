/**
 * Sum of any two elements equals to given num, then print those numbers
 */
import java.util.*;
class SumOfElements{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of values: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key value: ");
        int k = sc.nextInt();
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==k)
                    System.out.println(arr[i] + " " + arr[j]);
            }
        }

        sc.close();
    }
}