class One{

    public static void main(String[] args){
        int n = 5;

        //left-down
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //right-down
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<=n-i)
                  System.out.print("  ");
                else  
                    System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //left-up
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //right-up
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<i)
                  System.out.print("  ");
                else  
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}