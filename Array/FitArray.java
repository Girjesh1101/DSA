package Array;

import java.util.Arrays;

public class FitArray {
    
    public static boolean isFit(int arr[], int brr[], int n){

        Arrays.sort(arr);
        Arrays.sort(brr);

        for (int i = 0; i < n; i++) {
                   
                if(arr[i] < brr[i]){
                    return false;
                }
            
        }
        return true;


    }

    public static void main(String[] args) {
        
        int arr[]={7,5,9,90};
        int brr[]={5,4,8,10};

        int n=4;

        System.out.println(isFit(arr, brr, n));
    }
}
