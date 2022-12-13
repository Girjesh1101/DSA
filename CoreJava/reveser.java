package CoreJava;

public class reveser {
    
    public static void main(String[] args) {
        
        int n=1997; //--> 7991

        // if you want last digit no. then  then use ( num % 10) 
        // if you want to remove last giti no. (num/10)

        // while(n>0){

        //     int lastdigit=n%10;

        //     System.out.print(lastdigit);
        //     n =n/10;
        // }

        // Revese the given Number

        int Number=56213;
        int reveser=0;

        while(Number > 0) {
           
            int lastdigit1=Number%10;
            reveser=(reveser*10)+lastdigit1;
            Number=Number/10;
        }
        System.out.println(reveser);
    }


    
}
