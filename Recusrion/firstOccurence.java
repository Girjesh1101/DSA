package Recusrion;

public class firstOccurence {
    
    public static int firstOcc(int arr[], int i,int k){

        if(i==arr.length){
            return -1;
        }

        if(arr[i]==k)
        {
            return i;
        }

        return firstOcc(arr, i+1, k);
    }

    public static int lastOccurence(int arr[], int i, int k){

        if(i==arr.length){
            return -1;
        }

        int isFound= lastOccurence(arr, i+1, k);

        if(isFound == -1 && arr[i]== k){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        
        int arr[]={8,3,6,4,9,1,2,9};
        
        System.out.println("First  Occurence = "+firstOcc(arr, 0, 9));
        System.out.println("Last Occurence = "+lastOccurence(arr, 0, 9));

    }
}
