class Min_Max{

    public static void main(String[]args){

        int[] arr = {7,3,8,1,6,4,9,2};
        int max = arr[0], min = arr[0];
        for(int a:arr){ //for-each loop
            if(a<min)
                min=a;
            
            if(a>max)
                max=a;
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }
}