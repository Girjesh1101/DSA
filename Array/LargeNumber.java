package Array;



public class LargeNumber {
    

    public static int getlarge(int number[]){

        int largest=Integer.MIN_VALUE;// - infinity

        int smallest= Integer.MAX_VALUE;//+infinity

        for (int i = 0; i < number.length; i++) {
            
            if(largest<number[i]){
                largest=number[i];
            }

            if(smallest>number[i]){
                smallest=number[i];
            }
        }
            System.out.println("Smallest value is : "+smallest);
        return largest;
    }


    public static void main(String[] args) {
        
        int number[]={1,2,3,6,8,5,4};

        System.out.println("Largest Value : "+getlarge(number));


    }
}
