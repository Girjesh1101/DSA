package Strings;

public class basicString {
    
    public static void print(String concat){

        for (int i = 0; i < concat.length(); i++) {
            System.out.print(concat.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        
        char arr[]={'a','b','c'};

        String str="abc";
        String str1= new String("abc");

          //Strings are immutable  

        String fullName="Tony Stark";
        String aka="IronMan";
         
        System.out.println("lenght :"+fullName.length());

        String concat=fullName+aka;
        System.out.println(concat.charAt(1));

print(concat);


    }
}
