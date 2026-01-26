class Butterfly{

    public static void main(String[]args){
        int n = 5;
        System.out.println("Stars :---");
        for(int i=1; i<=n; i++){
            for(int j=1; j<2*n; j++){
                if(j<=i || j>=2*n-i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<2*n; j++){
                if(j<=n-i || j>=2*n-n+i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Numeric :---");
        for(int i=1; i<=n; i++){
            for(int j=1; j<2*n; j++){
                if(j<=i || j>=2*n-i)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<2*n; j++){
                if(j<=n-i || j>=2*n-n+i)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}