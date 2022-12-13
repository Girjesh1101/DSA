package Array;

public class OnePluse {
    
public static int[] onePlus(int arr[]){

    int i = arr.length;

    while(--i >=0 ){

        if(arr[i] != 10){
            arr[i] +=1;
            return arr;
        }else{

            arr[i] =0;
        }
    }
    if(i == 0){
        arr = new int[i+1];
        arr[0] = 1;
    }
    return arr;
}
public static void print(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}

    public static void main(String[] args) {
        
        int arr[]={1,2,3};

        onePlus(arr);
        print(arr);
    }
}
