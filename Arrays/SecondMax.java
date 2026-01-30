class SecondMax{

    public static void main(String[]args){
        int[] arr = {8,4,6,7,2,9,3,1};

        int max = arr[0], max2=arr[0];

        for(int a:arr){
            if(a>max){
                max2=max;
                max=a;
            }
            else if(a>max2 && a<max){
                max2=a;
            }
        }
        System.out.println("Second max: "  + max2);
    }
}