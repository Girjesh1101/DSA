package Sorting;

public class BubbleSorting { 

    public static void bubbleSorting(int arr[]){

        for(int turn=0; turn<arr.length;turn++){

            for (int i = 0; i < arr.length-1-turn; i++) {
                
                if(arr[i]<arr[i+1]){

                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    public static void print(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        
        int arr[]={5,4,1,3,2};

        bubbleSorting(arr);
        print(arr);
    }
}
