import java.util.*;
class PrintArray{

    public static void main(String[] args){
        int[] arr = {1,7,9,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}