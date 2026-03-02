

import java.util.*;
class Leetcode28{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1: ");
        String s = sc.next();
        System.out.println("Enter String2: ");
        String t = sc.next();
        int a = strStr(s,t);
        System.out.println(a);
    }
    public static int strStr(String s, String t) {
        int n=s.length(), m=t.length();
        if(m>n)
            return -1;
        String k="";
        for(int i=0; i<m; i++){
            k += s.charAt(i);
        }
        if(k.equals(t))
            return 0;
        int i=0, j=m;
        while(j<n){
            k=k.replaceFirst(s.charAt(i)+"","");
            k+=s.charAt(j);
            i++;j++;
            if(k.equals(t))
                return i;
        }
        return -1;
    }
}