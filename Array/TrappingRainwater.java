package Array;

public class TrappingRainwater {

    public static int trappedRainWater(int height[]){

        int n=height.length;
        // calculate the left max boundary - array

        int leftMax[]= new int[n];
        leftMax[0]=height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }

        // calculate the right max boundary - array
        int rightMax[]= new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater=0;
        // loop
        for (int i = 0; i<n; i++) {

            // waterlevel= min(leftmax bound, rightmax bound)
            int waterLevel=Math.min(leftMax[i], rightMax[i]);

            //trapped water =(waterlevel - height[i])* width
            trappedWater += waterLevel - height[i];
        }
        
        return trappedWater;
    }
    public static int maxArea(int A[], int len)
    {
        int l = 0;
        int r = len -1;
        int area = 0;
     
        while (l < r)
        {
            // Calculating the max area
            area = Math.max(area,
                        Math.min(A[l], A[r]) * (r - l));
                         
            if (A[l] < A[r])
                l += 1;
                 
            else
                r -= 1;
        }
        return area;
    }
     
    

    public static void main(String[] args) {
        
        int height[]={4,2,0,6,3,2,5};

        System.out.println(trappedRainWater(height));

        int len=7;

        System.out.println(maxArea(height, len));
    }
}
