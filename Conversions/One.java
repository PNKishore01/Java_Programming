import java.util.*;
class One{
    //decimal -> Binary(2)
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert binary: ");
        int n =  sc.nextInt();
        System.out.println(dec_bin(n));
        sc.close();
    }

    static String dec_bin(int n){
        String s = "";
        while(n>0){
            s = (n%2)+s;
            n/=2;
        }
        return s;
    }
}