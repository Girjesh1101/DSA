package Strings;

public class StringBuilders {
    
    public static void main(String[] args) {
        
        StringBuilder sb= new StringBuilder("");

        for (char i = 'a'; i <='z'; i++) {
            sb.append(i);
            //abcdefghijklmnop
        }
        System.out.println(sb.length());
    }
}
 