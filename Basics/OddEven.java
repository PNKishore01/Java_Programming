class OddEven{

    public static void main(String[] args){
        int num = 10;

        System.out.print("Odd Numbers: ");
        for(int i=1; i<=num; i++){
            if(i%2==1)
                System.out.print(i + " ");
        }

        System.out.print("Even Numbers: ");
        for(int i=1; i<=num; i++){
            if(i%2==0)
                System.out.print(i + " ");
        }

        System.out.println();
        System.out.println((num%2==0)? "Even": "Odd");
    }
}