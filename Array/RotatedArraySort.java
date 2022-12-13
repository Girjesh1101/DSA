package Array;

public class RotatedArraySort {

    public static int getPivot(int arr[], int n){

        int s=0;
        int e = n-1;
        while(s < e){
            int mid  = s +(e -s)/2;

            if(arr[mid ] > arr[0]){
                s = mid +1;
            }else {
                e = mid;
            }
        }
        return s;
    }
    

    public static void main(String[] args) {
        
        int arr[]={7,8,3,4,5};
        int n=arr.length;
        int key=4;
        System.out.println(getPivot(arr, n));
    }
}
