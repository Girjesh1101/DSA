package Recusrion;

public class Factorial {
    
    public static int fact(int n){

        if(n==0){
            return 1;
        }
        //int nm1=fact(n-1);
        int ans=n*fact(n-1);
       // System.out.println(ans);

        return ans;
    }

    public static void main(String[] args) {
        
        int n=5;

       // fact(n);

       System.out.println(fact(n));
    }
}
