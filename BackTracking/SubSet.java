package BackTracking;

public class SubSet {

    public static void findSubsets(String str, String ans, int i){

        //basecase
        if(i==str.length()){
            if(str.length() == 0){
                System.out.println("null");
            }
            else{
            System.out.println(ans);
            return;
            }
        }

        //recursion
        //yes choices
        findSubsets(str, ans+str.charAt(i), i+1);

        //No Choices    
        findSubsets(str, ans, i+1);

    }
    

    public static void main(String[] args) {
        
        String str= "abc";  
        //String str="";
        //output ---> a,b,c,ab,ac,bc,abc,"" 

        findSubsets(str, " ", 0);
    }
}
