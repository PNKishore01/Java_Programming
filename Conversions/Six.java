import java.util.*;
class Six{
    //Hexa(16) -> Decimal
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hexa number to convert decimal: ");
        String s =  sc.next();
        System.out.println(hex_dec(s));
        sc.close();
    }

    static int hex_dec(String s){
        int sum=0, n=s.length(), c=0;
        for(int i=n-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9')
                sum += (ch-48)*(int)Math.pow(16,c++);
            else
                sum += (ch-55)*(int)Math.pow(16,c++);
        }
        return sum;
    }
}