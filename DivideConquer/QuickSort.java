package DivideConquer;

public class QuickSort {
    
    public static void printArr(int arr[]){

        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]+" ");
        }
    }

    public static void quickSort(int arr[], int si,int ei){

        //basecase
        if(si >= ei){
            return;
        }

        int pIdx= partition(arr, si,ei);
        quickSort(arr, si, pIdx-1);// for left 
        quickSort(arr, pIdx+1, ei);// for right
    }

    public static int partition(int arr[], int si, int ei){

        int pivot= arr[ei]; //pivot
        int i=si-1;            //to make a place for element smaller then pivot

        for (int j = si; j < ei; j++) {
            if(arr[j]<= pivot){
                i++;

                //swap
                int temp= arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i]; // pivot= arr[i]
        arr[i]=temp;

        return i;
    }

    public static void main(String[] args) {
        
        int arr[]={6,3,9,8,2,5};

        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
