package Array;

public class removeElement {
    
    public static int remove(int nums[], int val){

        int n=nums.length;
        if(n==0 || n==1){
            return -1;
        }

        int expectedNums[]= new int[n-1];

        for (int i = 0,k=0; i <n ; i++) {
            
            if(i==val){
                continue;
            }
            expectedNums[k++]=nums[i];
        }

        for (int i = 0; i < n-1; i++) {
            expectedNums[i]=nums[i];
            System.out.print(expectedNums[i]+" ");
        }
        return 1;

    }

    public static void main(String[] args) {
        
        int nums[]={1,5,3,6,3,5,2};
        int val=3;

        remove(nums, val);
        // for (int i = 0; i < nums.length-1; i++) {
        //     System.out.print(nums[i]+" ");
        // }
    }
}
