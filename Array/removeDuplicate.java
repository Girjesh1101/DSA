package Array;

public class removeDuplicate {
    
    public static int removeDupli(int arr[], int n){

      if(n==0 || n==1){
        return n;
      }

      // creating array for unqiue element only
    // n-1 when the element remove size would be decrease
      int temp[]= new int[n];
      int j=0;

    
      for (int i = 0; i <n-1; i++) {
        if(arr[i]!=arr[i+1]){
            temp[j++]=arr[i];
        }
      }
      temp[j++]=arr[n-1];

      //chnaging the original value
      for (int i = 0; i < j; i++) {
            arr[i]=temp[i];
      }
      return j;
    }

    public static void main(String[] args) {
        
        int arr[]={1,2,3,3,4,5};
        int n=arr.length;

       n= removeDupli(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
