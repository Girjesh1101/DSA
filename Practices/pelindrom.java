package Practices;

import javax.swing.text.html.FormView;

public class pelindrom {
    
    public static void main(String[] args) {
        
        int number=666;
        int r, temp, sum=0;

        temp=number;
        while(number>0){

            r=number%10;
            sum=(sum*10)+r;
            number=number/10;

        }

        if(temp == sum){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


        String str= "racecar";
        String rev="";

        for (int i = str.length()-1; i >=0; i--) {
            rev=rev+str.charAt(i);
        }

        if(rev.equals(str)){
            System.out.println("Yes");
        }
        else
        System.out.println("No");
    }

   



}
