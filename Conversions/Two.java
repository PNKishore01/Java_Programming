import java.util.*;
class Two{
    //decimal -> Octa(8)
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert Octa: ");
        int n =  sc.nextInt();
        System.out.println(dec_oct(n));
        sc.close();
    }

    static String dec_oct(int n){
        String s = "";
        while(n>0){
            s = (n%8)+s;
            n/=8;
        }
        return s;
    }
}