import java.util.*;
class Three{
    //decimal -> Hexa(16)
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert HexaDecimal: ");
        int n =  sc.nextInt();
        System.out.println(dec_hex(n));
        sc.close();
    }

    static String dec_hex(int n){
        String s = "";
        while(n>0){
            int r = n%16;
            if(r<=9)
                s = r+s;
            else
                s = (char)(r+55)+s;
            n/=16;
        }
        return s;
    }
}