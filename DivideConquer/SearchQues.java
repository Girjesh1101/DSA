package DivideConquer;


public class SearchQues {

   
    public static int search(int arr[], int tar, int si , int ei){

        if(si >ei){
            return -1;
        }

        int mid= si + (ei-si)/2;//mid-> (si+ei)/2

        //case founf
        if(arr[mid] == tar){
            return mid;
        }

        //mid on L1

        if(arr[si] <= arr[mid]){
            //case a :left
            if(arr[si] <= tar  && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }else{  
            //case b : right
            return search(arr, tar, mid+1, ei);
             }
        }
        //mid on L2
        else {
            //case c:right
            if(arr[mid] <= tar && tar <=arr[ei] ){
               return search(arr, tar, mid+1, ei);
            }
            else{
                //case d: left
                return search(arr, tar, si, mid-1);
            }
        }
    }
    

    public static void main(String[] args) {
        
        int arr[]={4,5,6,7,0,1,2};
        int target=2;// output index=4

        int tIdx=search(arr, target, 0, arr.length-1);

        System.out.println(tIdx);
    }
}
