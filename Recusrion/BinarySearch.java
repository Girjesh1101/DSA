package Recusrion;

public class BinarySearch {

    public static void print(int arr[], int s, int e){

        for (int i = s; i < e; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int binarySearch(int arr[],  int s, int e,int key){

        //  s = 0;
        //  e = arr.length-1;
        print(arr, s, e);
        int mid =  s+(e-s)/2;

        System.out.println("Value of Array mid : "+arr[mid]);
        //base case Not found
        if(s > e){
            return -1;
        }
        
        // FOund at mid Index
        if(arr[mid] == key){
            return mid;
        }

        if(arr[mid] < key){

            int ans = binarySearch(arr, mid+1,e,key);
            return ans;
        }else{
            int ans = binarySearch(arr, s, mid-1, key);
            return ans;
        }

    }

    


    public static void main(String[] args) {
        
        int arr[]={1,2,4,5,6,10,11,12,16,18};
        int key =18;
        int e= arr.length;

        System.out.println("Found at index "+binarySearch(arr, 0, e, key));
    }
}
