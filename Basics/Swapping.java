class Swapping{

    public static void main(String[]args){
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping a = " + a + ", b = " + b);

        //using with third variable
        int t = a;
        a = b;
        b = t;
        System.out.println("After Swapping a = " + a + ", b = " + b);

        //without using third variable
        int m = 100, n = 200;
        System.out.println("Before Swapping m = " + m + ", n = " + n);
        m = n + m - (n=m);
        System.out.println("After Swapping m = " + m + ", n = " + n);
    }
}