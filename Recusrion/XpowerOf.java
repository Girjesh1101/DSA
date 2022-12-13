package Recusrion;

public class XpowerOf {
    
    public static int power(int x, int p){

        if(p==0){
            return 1;
        }

        int ans=power(x, p-1);

        return ans*x;
    }

    public static int lognPower(int x, int p){

        if(p==0){
            return 1;
        }

        int halfPower =lognPower(x, p/2);
        //int halfPowerSq= lognPower(x, p/2) * lognPower(x, p/2);
        int halfPowerSq=  halfPower * halfPower;

        if(p % 2 != 0){
            halfPowerSq = p * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        
        int x=5;
        int p=3;

        System.out.println(power(x, p));

        System.out.println("TC : Logn = "+lognPower(x, p));
    }
}
