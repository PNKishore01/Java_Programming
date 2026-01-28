class NearestPrimes{

    public static void main(String[]args){
        int n1 = 83;
        System.out.print("Nearest Prime of " + n1 + " is: ");
        nearPrimes(n1);
        System.out.println();
        int n2 = 228;
        System.out.print("Nearest Prime of " + n2 + " is: ");
        nearPrimes(n2);
    }
    static void nearPrimes(int n){
        for(int i=1; ; i++){
            boolean a = isPrime(n-i);
            boolean b = isPrime(n+i);

            if(a && b){
                System.out.print((n-i) + ", " + (n+i));
                break;
            }
            else if(a){
                System.out.print(n-i);
                break;
            }
            else if(b){
                System.out.print(n+i);
                break;
            }
        }
    }
    static boolean isPrime(int n){
        if(n==1 || (n%2==0 && n!=2))
            return false;
        
        for(int i=2; i*i<=n; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}