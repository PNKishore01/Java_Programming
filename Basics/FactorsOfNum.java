class FactorsOfNum{

    public static void main(String[]args){
        int num = 18;
        System.out.print("Factors of " + num + " is: ");
        for(int i=1; i<=num/2; i++){
            if(num%i==0)
                System.out.print(i + " ");
        }
    }
}