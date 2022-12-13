package Practices;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.FormView;

public class PeliDrom {
    

    public static void main(String[] args) {
        
        int n=525;
        int r, temp, sum=0;

        temp=n;
        while(n>0){

            r= n%10;
            sum= (sum*10)+r;
            n=n/10;
        }

        if(temp==sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
            }

        String str="Ayo";
        String rev="";
    
            for(int i=str.length()-1;i>=0;i--){
                rev=rev+str.charAt(i);
            }

            if(rev.equalsIgnoreCase(str)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");}


            int num=51;
            int count=0;

            for (int i = 0; i <= n; i++) {
                
                if(n%2==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println("Not prime");
            }
            else {
                System.out.println("Prime");
            }
    }

    
}
