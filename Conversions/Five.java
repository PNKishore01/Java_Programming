import java.util.*;
class Five{
    //Octa(8) -> Decimal
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a octa number convert into decimal: ");
        String s =  sc.next();
        System.out.println(oct_dec(s));
        sc.close();
    }

    static int oct_dec(String s){
        int sum=0, n=s.length(), c=0;
        for(int i=n-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='7')
                sum += (ch-48)*(int)Math.pow(8,c++);
        }
        return sum;
    }
}