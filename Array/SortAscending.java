package Array;

import java.util.Arrays;

public class SortAscending {
    

    public static void printSort(int arr[])
    {
        //Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                
                if(arr[j]<arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        

    }
    public static void main(String[] args) {
        
        int arr[]={1,2,1,0,2};
        printSort(arr);
    }
}
