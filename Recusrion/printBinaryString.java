package Recusrion;

public class printBinaryString {
    
    public static void binaryString(int n, int lastPlace, String str){

        //base case
        if(n==0 ){
            System.out.println(str);
            return;
        }
        //kam
        // if(lastPlace==0){
        //     //sit 0 on chair n
        //     binaryString(n-1, 0, str+"0");
        //     binaryString(n-1, 1, str+"1");
        // }else{
        //     binaryString(n-1, 0, str+"0");
        // }

        binaryString(n-1, 0, str+"0");

        if(lastPlace==0){
            binaryString(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {

        binaryString(3, 0, "");
        
    }
}
