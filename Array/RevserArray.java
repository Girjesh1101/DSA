package Array;



public class RevserArray {

    public static void reveser(int num[]){

        int first=0 , last=num.length-1;

        while(first<last){

            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;

            first++;
            last--;

        }
       
    }

    public static void main(String[] args) {

        int num[]={5,8,6,7,9};

        reveser(num);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        
        
    }
    
}
