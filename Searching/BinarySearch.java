class BinarySearch{

    public static void main(String[]args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int val = 8;
        System.out.println(binary(arr,val));
    }
    static boolean binary(int[] arr, int val){
        int s=0, n=arr.length, e=n-1;//s=0, e=10-1=9
        while(s<=e){
            int mid = e-((e-s)/2);

            if(arr[mid]==val)
                return true;
            
            if(arr[mid]<val)
                s=mid+1;
            else
                e=mid-1;
        }
        return false;
    }
}