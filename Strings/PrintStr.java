import java.util.*;
class PrintStr{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("String is: " + s);
        System.out.println("Length of String is: " + s.length());
        System.out.println("Character by character printing: ");
        for(char ch:s.toCharArray()){
            System.out.print(ch + " ");
        }
        sc.close();
    }
}