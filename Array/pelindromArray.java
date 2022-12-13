package Array;


public class pelindromArray {
    
    public static boolean isPeli(int arr[]){
        int n=arr.length;

        for (int i = 0; i < n; i++) {
            
            if(arr[i]!=arr[n-1-i]){
                return false;
            }
           
        }
        return true;

    }

    public static void main(String[] args) {
        
        int arr[]={1,2,3,2,1};

        System.out.println(isPeli(arr));
    }
}
