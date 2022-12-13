package Array;

public class SubarraySum {

    public static void sumSubarray(int arr[], int sum){

        for (int i = 0; i < arr.length; i++) {  // traverse  each no.
            int currSum = arr[i];   // check if no == sum

            if(currSum == sum){     // if that no found show the Index
                System.out.println("Sum found at Index : "+i);
                return ;
            }else{          // if no no found at the place the sum 
                //try all subarray starting with i
                for (int j = i + 1; j < arr.length; j++) {
                     
                    currSum += arr[j];

                    if(currSum ==  sum){
                        System.out.println("Sum found Between Indexs "+i+ "  and "+j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subArray Found");
        return ;
    }

    public static void SumSub(int arr[], int sum){

        for (int i = 0; i < arr.length; i++) {

            int ans= arr[i];

            if(ans == sum){
                System.out.println("Found at index "+i);
                return;
            }
            
            for (int j = i; j < arr.length; j++) {
                
                if((arr[i]+arr[j]) == sum){

                    System.out.println("Found at index is " +i+ " and "+j);
                }   
            }
        }
        System.out.println("Sum Not Found ");
    }

    public static void main(String[] args) {
        
       int arr[]={15,2,4,8,9,5,10,23};
       //int arr[]={2,5};

       // int n= arr.length;
        int sum= 21;
        sumSubarray(arr, sum);
     // SumSub(arr, sum);
    }
    
}
