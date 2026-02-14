import java.util.*;
class Four{
    //Binary(2) -> Decimal
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number to convert decimal: ");
        String s =  sc.next();
        System.out.println(dec_bin(s));
        sc.close();
    }

    static int dec_bin(String s){
        int sum=0, n=s.length(), c=0;
        for(int i=n-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='1')
                sum += (ch-48)*(int)Math.pow(2,c++);
        }
        return sum;
    }
}