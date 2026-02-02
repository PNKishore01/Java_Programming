class LinearSearch{

    public static void main(String[]args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int val = 8;
        System.out.println(linear(arr,val));
    }

    public static boolean linear(int[] arr, int val){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==val)
                return true;
        }
        return false;
    }
}