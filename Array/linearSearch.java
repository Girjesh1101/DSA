package Array;

public class linearSearch {
    
    public static int linear(int number[],int key){

        for (int i = 0; i < number.length; i++) {
         
            if(number[i]==key){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        
        int number[]={1,5,10,9,3,7};
        int key=30;

       // String menu[]={"Apple","Banana", "Orange"};

        int index= linear(number, key);

        if(index==-1){
            System.out.println("Not FOund");
        }
        else
        System.out.println("key isfound at index "+index);
    }
}
