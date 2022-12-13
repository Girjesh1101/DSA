package Practices;

public class Fibo {
    
    public static void main(String[] args) {
        
        int number=10;
        int n1=0, n2=1;
        int  sum=0;

        for (int i = 0; i < number; i++) 
            
        {

            sum=n1+n2;
            System.out.print(sum+ " ");

           
            n1=n2;
            n2=sum;
        }

        // int arr[]={6,5,4,8,2,1,};

        // for (int i = arr.length-1; i >=0; i--) {
        //     System.out.print(arr[i]+" ");
        // }
        //     int temp=0;
        // for (int i = 0; i < arr.length-1; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
                
        //         if(arr[i]> arr[j]){
        //             temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        // System.out.println("large + "+temp);
        
    }
}
