import java.util.*;
class FibonacciSeries{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        isFibonacci(num);
        sc.close();
    }

    public static void isFibonacci(int n){
        int a=0, b=1;
        for(int i=0; i<n; i++){
            System.out.print(a + " ");
            int c = a+b;
            a=b;
            b=c;
        }
    }
}