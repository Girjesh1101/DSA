package Practices;

public class PelindromCheck {

    public static void main(String[] args) {

        int n = 545;
        int sum=0;
        int  r ,temp;
        temp =n;

        while(n>0){

            r = n%10;
            sum =(sum*10)+r;
            n = n/10; 
        }

        if(sum == temp){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

        String str="racedar";
        String rev="";
        for (int i=str.length()-1;i>=0;i--) {
          
            rev = rev+str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }

    
}
