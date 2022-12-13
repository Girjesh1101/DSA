package Array;

public class BinarySearch {
    
    public static int binarySearch(int arr[], int key){

        int start=0;            // start
        int end =arr.length-1; // end

        while(start<=end){

            int mid= (start+end) / 2;   // mid

            if(arr[mid]==key){      //found
                return mid; 
            }
            if(arr[mid]<key){       // right
                start=mid+1;
            }
            else{                   //left
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int arr[]={2,4,6,8,10,12,14};
        int key=12;

        System.out.println("Key Found at index : "+binarySearch(arr, key));

    }
}